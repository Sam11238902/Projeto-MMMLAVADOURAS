package entities.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbException;
import entities.dao.OrdemServicoDao;
import entities.model.OrdemServico;

public class OrdemServicoDaoJDBC implements OrdemServicoDao {
	private Connection conn;
	
	public OrdemServicoDaoJDBC(Connection conn) {
			this.conn = conn;
	}

	
	@Override
	public void cadastrarOrdemServico(OrdemServico ordemServico) {
		PreparedStatement st = null;	
		try {
			
			st = conn.prepareStatement(
					"INSERT INTO ordemservico "
					+"(nomeCliente, numeroTelefone, enderecoCliente, marcaMaquina, "
				    +"quantKg, descricaoProblema, solucaoServico, valorServico, garantiaServico, "
					+"dataInicioServico, previsaoDataFinal) "
					+"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
					st.setString(1,ordemServico.getNomeCliente());
					st.setInt(2, ordemServico.getNumeroTelefone());
					st.setString(3, ordemServico.getEnderecoCliente());
					st.setString(4, ordemServico.getMarcaMaquina());
					st.setInt(5, ordemServico.getQuantKg());
					st.setString(6, ordemServico.getDescricaoProblema());
					st.setString(7, ordemServico.getSolucaoServico());
					st.setDouble(8, ordemServico.getValorServico());
					st.setString(9, ordemServico.getTempoGarantia());
					st.setDate(10, new java.sql.Date(ordemServico.getDataInicioServico().getTime()));
					st.setDate(11, new java.sql.Date(ordemServico.getPrevisaoDataFinal().getTime()));
					
			st.executeUpdate();
			
			System.out.println("Feito");
					
					
		//	st.setString(2, ordemServico.get);
					
		} catch (SQLException e) { 
			throw new DbException(e.getMessage());
		}finally {
			DB.closedStatment(st);
			
		}
	}

}
