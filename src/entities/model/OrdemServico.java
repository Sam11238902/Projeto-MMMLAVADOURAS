package entities.model;

import java.util.Date;
import java.util.Objects;

public class OrdemServico extends PreOrdemServico{
	private final Integer O_S;
	private String solucaoServico;
	private Double valorServico;
	private String tempoGarantia;
	private Date dataInicioServico = new Date();
	private Date previsaoDataFinal = new Date();

	

	public OrdemServico(Integer id, String nomeCliente, Integer numeroTelefone, String enderecoCliente,
			String marcaMaquina, Integer quantKg, String descricaoProblema, String solucaoServico, Double valorServico, String tempoGarantia) {		
		super(id, nomeCliente, numeroTelefone, enderecoCliente, marcaMaquina, quantKg, descricaoProblema);	
		this.O_S = null;
		this.solucaoServico = solucaoServico;
		this.valorServico = valorServico;
		this.tempoGarantia = tempoGarantia;
	
	}
	
	



	@Override
	public String toString() {
		return "OrdemServico [O_S=" + O_S + ", solucaoServico=" + solucaoServico + ", valorServico=" + valorServico
				+ ", tempoGarantia=" + tempoGarantia + ", dataInicioServico=" + dataInicioServico
				+ ", previsaoDataFinal=" + previsaoDataFinal + "]";
	}





	public OrdemServico() {
		this.O_S = null;

	}



	public String getSolucaoServico() {
		return solucaoServico;
	}



	public void setSolucaoServico(String solucaoServico) {
		this.solucaoServico = solucaoServico;
	}



	public Double getValorServico() {
		return valorServico;
	}



	public void setValorServico(Double valorServico) {
		this.valorServico = valorServico;
	}



	public String getTempoGarantia() {
		return tempoGarantia;
	}



	public void setTempoGarantia(String tempoGarantia) {
		this.tempoGarantia = tempoGarantia;
	}



	public Date getDataInicioServico() {
		return dataInicioServico;
	}



	public void setDataInicioServico(Date dataInicioServico) {
		this.dataInicioServico = dataInicioServico;
	}



	public Date getPrevisaoDataFinal() {
		return previsaoDataFinal;
	}



	public void setPrevisaoDataFinal(Date previsaoDataFinal) {
		this.previsaoDataFinal = previsaoDataFinal;
	}



	public Integer getO_S() {
		return O_S;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(O_S);
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrdemServico other = (OrdemServico) obj;
		return Objects.equals(O_S, other.O_S);
	}
	
}
