package es.cursogetafe.springxml.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import es.cursogetafe.springxml.persistencia.ClienteDao;


//@Component("neg")//el valor pasa a ser el nombre


@Service("neg")   // hace lo mismo que @component pero tiene mas utilidades
public class NegocioImpl implements Negocio1{

	@Autowired // esto espera un cDao
//	@Qualifier("cDaoBean")
	private ClienteDao cDao;
	
	public NegocioImpl() {
		System.out.println("constructor de NegocioImple");
	}

	@Override
	public void metodoNegocio() {
		System.out.println("metodo Negocio de NegocioImple");
		cDao.metodoDao();
	}

	
	
	public ClienteDao getcDao() {
		return cDao;
	}

	public void setcDao(ClienteDao cDao) {
		System.out.println("se ha inyectado el dao");
		this.cDao = cDao;
	}
	
	
}
