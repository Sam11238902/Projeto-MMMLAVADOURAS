package service;

import java.sql.Connection;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import db.DB;
import entities.dao.PreOrdemServicoDao;
import entities.dao.impl.PreOrdemServicoDaoJDBC;
import entities.model.PreOrdemServico;

public class ServicePreOrdem {
	Connection conn = DB.getConnection();
	PreOrdemServicoDaoJDBC preOrdemServicoDao = new PreOrdemServicoDaoJDBC(conn);

	
	public void cadastrarPreOrdem() {
		
		
		try {
      	Scanner scan = new Scanner(System.in);
		PreOrdemServico cadastrarPre = new PreOrdemServico();
		/*
		private Integer id;
		private String nomeCliente;
		private Integer numeroTelefone;
		private String enderecoCliente;
		private String marcaMaquina;
		private Integer quantKg;
		private String descricaoProblema;
		*/
		System.out.println("-----------Digite o dados a seguir para cadastrar pre ordem--------------------"
				+ "\n");
		System.out.println("Nome do cliente :\n");
		cadastrarPre.setNomeCliente(scan.nextLine());
		
		System.out.println("Numero de telefone:\n");
		cadastrarPre.setNumeroTelefone(scan.nextInt());
		scan.nextLine();
		System.out.println("Endereco :\n");
		cadastrarPre.setEnderecoCliente(scan.nextLine());
	
		System.out.println("Marca da Maquina :\n");
		cadastrarPre.setMarcaMaquina(scan.nextLine());
		
		System.out.println("Quantidade de kg da maquina:\n");
		cadastrarPre.setQuantKg(scan.nextInt());
		scan.nextLine();
		System.out.println("Descreva o problema:\n");
		cadastrarPre.setDescricaoProblema(scan.nextLine());
		
		preOrdemServicoDao.criarPreOrdemServico(cadastrarPre);
		
		System.out.println("Pre ordem de servico cadastrada com sucesso !!\n");
	
		} catch (InputMismatchException e) {
		    System.out.println("Entrada de Dados invalida, tente cadatrar novamente.\n");
		    cadastrarPreOrdem();
		} catch (Exception e) {
		    System.out.println("Erro desconhecido: " + e.getMessage()+"\n");
		}
		
	}
	
	public void listarPreOrdemServ() {
		
		
		List<PreOrdemServico> list = preOrdemServicoDao.listarPreOrdensServicos();
			
		//System.out.println(list);
			
			for(PreOrdemServico e : list) {
				System.out.println(e);
			}
	}	
}
