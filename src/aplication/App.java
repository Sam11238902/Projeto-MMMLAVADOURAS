package aplication;

import java.sql.Connection;
import java.util.Scanner;

import db.DB;
import entities.dao.impl.PreOrdemServicoDaoJDBC;
import service.ServiceOrdemServico;
import service.ServicePreOrdem;

public class App {
	
	Connection conn = DB.getConnection();
	static ServicePreOrdem servicePre = new ServicePreOrdem();
	//PreOrdemServicoDaoJDBC preOrdemServicoDao = new PreOrdemServicoDaoJDBC(conn);
	static ServiceOrdemServico serviceOrdem = new ServiceOrdemServico();
	
	
	public static boolean  subMenu() {	
		System.out.println("-------------------- Escolha uma opção abaixo :-------------------------------\n");			
		
		System.out.println("1 - Voltar ao menu inicial\n"
						  +"------------------------------------------------------------------------------\n"
						  +"2 - Encerrar programa\n"
						  +"------------------------------------------------------------------------------\n");
		Scanner scanner = new Scanner(System.in);
		int option2 = scanner.nextInt();
		if (option2==1) {
			iniciarApp();	
			return true;
		}else if (option2==2){			
			System.out.println("--------------------PROGRAMA ENCERRADO--------------------\n");
			return false;
		}
		return true;
		
	}
	
	
	
	public static void  iniciarApp() {

		System.out.println("------------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("-----------Bem vindo ao Controle de O.S da MMMLavadouras----------------------");
		System.out.println("------------------------------------------------------------------------------");
	
		System.out.println("-------------------- Escolha uma opção abaixo :-------------------------------\n");

		Scanner scanner = new Scanner(System.in);
		boolean nav  = true;
		int option ; 
		
		
		
		while (nav) {
			
		
		
			
		System.out.println("1 - Cadastrar Pre-Ordem-Serviço\n" 
						  +("------------------------------------------------------------------------------\n")
						  +"2 - Consultar Pre-Ordens de Serviço\n"
						   +("------------------------------------------------------------------------------\n")
						  +"3 - Aprovar/Reprovar Pre-Ordem de Serviço\n"
						   +("------------------------------------------------------------------------------\n")
						  +"4 - Consultar Ordens de serviço\n"
						   +("------------------------------------------------------------------------------\n")
		 				  +"4 - Concluir Serviço\n"
		 				   +("------------------------------------------------------------------------------\n")
		 				  +"5 - Encerrar Programa\n"
						   +"------------------------------------------------------------------------------\n");
		
		option = scanner.nextInt();
		int option2;
		
			switch (option) {
			
			case 1: 
				servicePre.cadastrarPreOrdem();
				
				
				
				
				nav = subMenu();			
				break;
			
			case 2: 
				servicePre.listarPreOrdemServ();
				nav = subMenu();	
			break;
			case 3:
				System.out.println( "------------------------------------------------------------------------------\n"
						+ "DIGITE O ID DA ORDEM SERVICO A SER APROVADA :\n"
						 +"------------------------------------------------------------------------------\n");
				int idAprovar = scanner.nextInt();
				
				serviceOrdem.AprovarPreOrdem(idAprovar);
				nav = subMenu();
			break;
			
			case 4: 
				break;
			case 5: System.out.println("--------------------PROGRAMA ENCERRADO---------------------------------\n");
			nav = false;
			break;
			
			default:
				break;
			}
		
		}
		
	
		
		
		
	}

	public static void main(String[] args) {
		
		
		

	iniciarApp();
	
	
	
	}
	
}
