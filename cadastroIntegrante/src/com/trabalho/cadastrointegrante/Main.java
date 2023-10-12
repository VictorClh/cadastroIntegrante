package com.trabalho.cadastrointegrante;

import java.util.Iterator;
import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		   
		Aluno objAluno = new Aluno(null, null);	
		
		int opc;
		   	int qtdProjetos = 0;
	        Scanner entrada;
	        
	        //Construindo a entrada
	        entrada = new Scanner(System.in);
	        
	        do{
	            System.out.println("\n--------------------");
	            System.out.println("      MENU");
	            System.out.println("Escolha uma opção:");
	            System.out.println("1 - Inserir aluno");
	            System.out.println("2 - Listar alunos");
	            System.out.println("3 - Situações");
	            System.out.println("0 - Sair");
	            
	            opc = entrada.nextInt();
	            entrada.nextLine();
	            
	            switch (opc) {
				case 1: 
					
					System.out.println("\nNome: ");
					objAluno.nome = entrada.nextLine();
					System.out.println("\nCPF: ");
					objAluno.cpf = entrada.nextLine();
				
					
					System.out.println("\nQuantos projetos participará?");
					qtdProjetos = entrada.nextInt();
					
					
					for (int i = 0; i < qtdProjetos; i++) {
						
						System.out.println("Projeto " + (i + 1));
						objAluno.projeto = entrada.nextLine();
						
						
					}
					
					
					break;
				case 2:
					break;
				case 3:
					break;
				case 0:
					System.out.println("\nSaindo...");
				default:
					System.out.println("\nOpção invalida");;
				}
	            
	        }while(opc != 0);
	               
	    

	}
}