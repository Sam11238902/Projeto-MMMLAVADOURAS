package entities.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import db.DB;
import db.DbException;
import entities.dao.PreOrdemServicoDao;
import entities.model.PreOrdemServico;

public class PreOrdemServicoDaoJDBC implements PreOrdemServicoDao{
	
	private Connection conn;
	
	public PreOrdemServicoDaoJDBC(Connection conn) {
			this.conn = conn;
	}

	public void criarPreOrdemServico(PreOrdemServico preOrdemServico){
		
		PreparedStatement st = null;
	
		try {
				st = conn.prepareStatement("INSERT INTO preordemservico"
				+ " (nomeCliente, numeroTelefone, enderecoCliente, marcaMaquina, quantKg, descricaoProblema)"
				+"VALUES(?, ?, ?, ?, ?, ?)");
				st.setString(1, preOrdemServico.getNomeCliente());
				st.setInt(2, preOrdemServico.getNumeroTelefone());
				st.setString(3, preOrdemServico.getEnderecoCliente());
				st.setString(4, preOrdemServico.getMarcaMaquina());
				st.setInt(5, preOrdemServico.getQuantKg());
				st.setString(6, preOrdemServico.getDescricaoProblema());
				st.executeUpdate();
				
				
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			
		}
		
		
	}

	
	public List<PreOrdemServico> listarPreOrdensServicos() {
	
		List<PreOrdemServico> list = new ArrayList<>();
		PreparedStatement st = null;
		ResultSet rs = null;
		
		
		try {
			st = conn.prepareStatement("SELECT * FROM preordemservico;");
			rs = st.executeQuery();
			while(rs.next()) {
				PreOrdemServico result = new PreOrdemServico();
				result.setId(rs.getInt("id"));
				result.setNomeCliente(rs.getString("nomeCliente"));
				result.setNumeroTelefone(rs.getInt("numeroTelefone"));
				result.setEnderecoCliente(rs.getString("enderecoCliente"));
				result.setMarcaMaquina(rs.getString("marcaMaquina"));
				result.setQuantKg(rs.getInt("quantKg"));
				result.setDescricaoProblema(rs.getString("descricaoProblema"));

				list.add(result);
			}
		return list ;
			
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
		DB.closedResultSet(rs);
		DB.closedStatment(st);
		}	
	}

	@Override
	public PreOrdemServico findById(Integer id) {
		
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			
			st = conn.prepareStatement("SELECT * FROM preordemservico WHERE id = ?");
			
			st.setInt(1, id);
			
			rs = st.executeQuery();
			
			PreOrdemServico preOrdemServ = new PreOrdemServico();
			
			if(rs.next()) {
			preOrdemServ.setId(rs.getInt("id"));
			preOrdemServ.setNomeCliente(rs.getString("nomeCliente"));
			preOrdemServ.setNumeroTelefone(rs.getInt("numeroTelefone"));
			preOrdemServ.setEnderecoCliente(rs.getString("enderecoCliente"));
			preOrdemServ.setMarcaMaquina(rs.getString("marcaMaquina"));
			preOrdemServ.setQuantKg(rs.getInt("quantKg"));
			preOrdemServ.setDescricaoProblema(rs.getString("descricaoProblema"));
			return preOrdemServ;
			
			}else {
				System.out.println("-----------------------------------------------------------");
				System.out.println("RESPOSTA = Usuario nao encontrado!!");
				System.out.println("-----------------------------------------------------------\n");
				return null;
			}
			} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closedResultSet(rs);
			DB.closedResultSet(rs);
		}
			
	}

	@Override
	public void deleteById(Integer id) {
		
		PreparedStatement st = null;
		
		try {
			
			st = conn.prepareStatement("DELETE FROM preordemservico WHERE id = ?");

			st.setInt(1, id);
			int rowsAfectted = st.executeUpdate();
		
			
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
			
		}finally {
			DB.closedStatment(st);
		}
		
	}

}
