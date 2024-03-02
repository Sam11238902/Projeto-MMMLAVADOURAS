package aplication;

import java.sql.Connection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import db.DB;
import entities.dao.OrdemServicoDao;
import entities.dao.PreOrdemServicoDao;
import entities.dao.impl.PreOrdemServicoDaoJDBC;
import entities.model.OrdemServico;
import entities.model.PreOrdemServico;
import service.ServiceOrdemServico;
import service.ServicePreOrdem;

public class Program {
	
	public static void main(String[] args) {
		
		Connection conn = DB.getConnection();
		//DB.closeConnection();
		ServicePreOrdem servicePre = new ServicePreOrdem();
		PreOrdemServicoDaoJDBC preOrdemServicoDao = new PreOrdemServicoDaoJDBC(conn);
		
		System.out.println("-----------Bem vindo ao Controle de O.S da MMMLavadouras--------------------\n");
			
		
		boolean navegacao = false;
		boolean nagegacao2 = false;
		Scanner scanner = new Scanner(System.in);
		/*
		
		
		while(navegacao==false) {
		System.out.println("-------------------- Escolha uma opção abaixo :--------------------\n");

			
		System.out.println("1 - Cadastrar Pre-Ordem-Serviço\n"
						  +"2 - Consultar Pre-Ordens de Serviço\n"
						  +"3 - Aprovar/Reprovar Pre-Ordem de Serviço\n"
						  +"4 - Consultar Ordens de serviço\n"							  	
		 				  +"4 - Concluir Serviço\n"
		 				  +"5 - Encerrar Programa\n");
		
		
		int option = scanner.nextInt();
		
		if(option==5) {
			System.out.println("Programa encerrado!!");
			navegacao=true;
		}else if (option==1) {
			servicePre.cadastrarPreOrdem();
		}else if(option==2) {
				servicePre.listarPreOrdemServ();
	             System.out.println("1 - voltar ao menu inical \n"
						+ "2 - Aprovar ordem de Serviço pelo ID ");
	            
	             option = scanner.nextInt();
	             if(option==1) {
	            	 System.out.println("ok voltando ao menu incial");
	             }else if(option == 2 ) {
	            	 System.out.println("Implementacao aprovar pre ordem por id");
	             }	
		}
	}
 
		
		*/
		int option = 0;
		
		
		while
		
		
		
		
		switch (option) {
		case 1:
			
			break;

		default:
			break;
		}
		
		
		/*	
		TESTE PRA VER SE O CRIAR PRE ORDEM ESTA FUNCINANDO 
		
			PreOrdemServico preInsert = new PreOrdemServico(null,"Samuel Holanda",991207939,"Rua C, 174 - Mondubim",
					"Consul",10,"Maquina não lava, roupa saindo muito suja");
			/*
			private Integer id;
			private String nomeCliente;
			private Integer numeroTelefone;
			private String enderecoCliente;
			private String marcaMaquina;
			private Integer quantKg;
			private String descricaoProblema;
			preOrdemServicoDao.criarPreOrdemServico(preInsert);
			
		
		*/
		
		//PreOrdemServico preOrdemServ = new PreOrdemServico();
		//preOrdemServ = preOrdemServicoDao.findById(1);
		
		
		//System.out.println(preOrdemServ);
		
		
		
		ServiceOrdemServico serviceOrdem = new ServiceOrdemServico();

		serviceOrdem.AprovarPreOrdem(3);
		
	}
}
