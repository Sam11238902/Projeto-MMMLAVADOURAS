package entities.dao;

import db.DB;
import entities.dao.impl.PreOrdemServicoDaoJDBC;

public class DaoFactory {
	
	public static PreOrdemServicoDao criandoPreOrdemServDao() {
		
		
		return new PreOrdemServicoDaoJDBC(DB.getConnection());
				
		
	}
		
}


