package es.cursogetafe.springxml.persistencia;

import java.rmi.ConnectIOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mysql.cj.xdevapi.PreparableStatement;


//@Component("cDao")

@Repository("cDao")
public class ClienteDaoNew implements ClienteDao{

	@Autowired
	private DataSource ds;
	
	public ClienteDaoNew() {
		System.out.println("Constructor ClienteDaoNew");
	}
	
	
	@Override
	public void metodoDao() {
	System.out.println("metodo Dao de ClienteDaoNew");
	
//	creamos un objeto conection y lo sacamos del DataSource
	try(Connection cx = ds.getConnection()){
		
		String sql ="select nombre from alumnos";
		PreparedStatement ps = cx.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString("nombre"));
		}
		
	}catch (SQLException e) {

		}
		
	}
	
}
