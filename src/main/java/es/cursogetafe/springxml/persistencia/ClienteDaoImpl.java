package es.cursogetafe.springxml.persistencia;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository("cDaonew")
public class ClienteDaoImpl implements ClienteDao {

	@Autowired
	private DataSource ds;
	
	
	public ClienteDaoImpl() {
		System.out.println("Constructor de ClienteDaoImpl");
	}
	
	@Override
	public void metodoDao() {
		System.out.println("metodoDao del clienteDaoImpl");
		
	}

}
