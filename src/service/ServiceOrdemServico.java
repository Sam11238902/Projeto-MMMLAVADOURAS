package service;

import java.sql.Connection;
import java.util.Scanner;

import db.DB;
import entities.dao.impl.OrdemServicoDaoJDBC;
import entities.dao.impl.PreOrdemServicoDaoJDBC;
import entities.model.OrdemServico;
import entities.model.PreOrdemServico;

public class ServiceOrdemServico {
	Connection conn = DB.getConnection();
	PreOrdemServicoDaoJDBC preOrdemServicoDao = new PreOrdemServicoDaoJDBC(conn);
	OrdemServicoDaoJDBC OrdemServicoDao = new OrdemServicoDaoJDBC(conn);
	
	public void AprovarPreOrdem(Integer idPreOrdem) {
		PreOrdemServico preOrdemServ = new PreOrdemServico();
		
		
		preOrdemServ = preOrdemServicoDao.findById(idPreOrdem);

		
		if (preOrdemServ == null) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("-----------------------------------------------------------");
			System.out.println("DIGITE UM ID VALIDO: ");
			System.out.println("-----------------------------------------------------------\n");
			AprovarPreOrdem(scanner.nextInt());
		}else {
			
			String solucaoSer;
			Double valorServico;
			String garantiaServicos = "3 Meses";
		
			Scanner scan = new Scanner(System.in);
			System.out.println("-----------------------------------------------------------");
			System.out.println("Informe a solução do servico : ");
			System.out.println("-----------------------------------------------------------");
			solucaoSer = scan.nextLine();
			System.out.println("-----------------------------------------------------------");
			System.out.println("Informe o valor do Servico : ");
			System.out.println("-----------------------------------------------------------");
			valorServico= scan.nextDouble();		
				
		    
			OrdemServico ordemServico = new OrdemServico(preOrdemServ.getId()
			,preOrdemServ.getNomeCliente(),preOrdemServ.getNumeroTelefone(),
			preOrdemServ.getEnderecoCliente(),preOrdemServ.getMarcaMaquina(),
					preOrdemServ.getQuantKg(),preOrdemServ.getDescricaoProblema(),
					solucaoSer,valorServico,garantiaServicos);

			OrdemServicoDao.cadastrarOrdemServico(ordemServico);;		
			System.out.println(ordemServico);
			
			
		}
		
		
		
		
	}
}
