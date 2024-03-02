package entities.model;

import java.util.Objects;

public class PreOrdemServico {
	private Integer id;	
	private String nomeCliente;
	private Integer numeroTelefone;
	private String enderecoCliente;
	private String marcaMaquina;
	private Integer quantKg;
	private String descricaoProblema;
	
	public PreOrdemServico() {
		
	}

	
	public PreOrdemServico(Integer id, String nomeCliente, Integer numeroTelefone, String enderecoCliente,
			String marcaMaquina, Integer quantKg, String descricaoProblema) {
		super();
		
		this.id = id;
		this.nomeCliente = nomeCliente;
		this.numeroTelefone = numeroTelefone;
		this.enderecoCliente = enderecoCliente;
		this.marcaMaquina = marcaMaquina;
		this.quantKg = quantKg;
		this.descricaoProblema = descricaoProblema;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Integer getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(Integer numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public String getMarcaMaquina() {
		return marcaMaquina;
	}

	public void setMarcaMaquina(String marcaMaquina) {
		this.marcaMaquina = marcaMaquina;
	}

	public Integer getQuantKg() {
		return quantKg;
	}

	public void setQuantKg(Integer quantKg) {
		this.quantKg = quantKg;
	}

	public String getDescricaoProblema() {
		return descricaoProblema;
	}

	public void setDescricaoProblema(String descricaoProblema) {
		this.descricaoProblema = descricaoProblema;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PreOrdemServico other = (PreOrdemServico) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		 return String.format(
				  	"------------------------------------------------------\n"+
			        "---------- PRE-ORDEM-SERVIÇO  ID : = %d----------------\n" +
			        
			      //  "------------------------------------------------------\n"+
			        "  NOME CLIENTE = %s\n" +
			      //  "------------------------------------------------------\n"+
			        "  TELEFONE =%s \n" +
			      //  "------------------------------------------------------\n"+
			        "  ENDEREÇO = %s \n" +
			       // "------------------------------------------------------\n"+
			        "  MARCA MÁQUINA = %s \n" +
			      //  "------------------------------------------------------\n"+
			        "  QUANTIDADE KG = %s \n" +
			      //  "------------------------------------------------------\n"+
			        "  DESCRIÇÃO PROBLEMA = %s \n" +
			        "------------------------------------------------------\n"+
			        "",
			        id, nomeCliente, numeroTelefone, enderecoCliente, marcaMaquina, quantKg, descricaoProblema
			    );
	
	
	}
	
}
