package entities.dao;

import java.util.List;

import entities.model.PreOrdemServico;

public interface PreOrdemServicoDao {
	
	public void criarPreOrdemServico(PreOrdemServico preOrdemServico);
	
	public List<PreOrdemServico> listarPreOrdensServicos();
	
	public PreOrdemServico findById(Integer id);
	
	public void deleteById(Integer id);
	

}
