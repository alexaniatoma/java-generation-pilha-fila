package exerciciosFilaEPilha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * Escreva um programa contendo uma Collection Queue (Fila) de Objetos do tipo string, para organizar uma fila por ordem de chegada dos 
 * Clientes de um Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
2: Listar todos os Clientes na fila
3: Chamar (retirar) uma pessoa da fila 
0: O programa deve ser finalizado. 
Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila.

 */

public class ClienteFila {
	
	public static void main(String[] args) {		
		
		Queue<String> nomeCliente = new LinkedList<String>();
		Scanner scan = new Scanner(System.in);
		
		
		int opcao;				
			
			do{
				System.out.println("\n************************************");
				System.out.println("MENU");
				System.out.println("1- Adicionar Cliente na Fila");
				System.out.println("2- Listar todos os clientes");
				System.out.println("3- Retirar Cliente da Fila");
				System.out.println("0- Sair");
				
				System.out.println("\n************************************\n");
				
				System.out.print("Entre com a opção desejada: ");
				opcao = scan.nextInt();
				scan.nextLine();
				
			switch(opcao) {
			case 1:
		
				System.out.println("Digite o nome do cliente:");
				String nome = scan.nextLine();	
				nomeCliente.add(nome);
				System.out.println("Cliente " + nome + " adicionado!");						
							
				break;
				
			case 2:				
				System.out.println("Lista de Clientes na Fila: \n");
				for(String nomes : nomeCliente) {
					System.out.println(nomes);					
				}
				
				break;
				
			case 3:
				if(nomeCliente.isEmpty()) {
					System.out.println("A fila está vazia!");
				}
				else {
					String clienteChamado = nomeCliente.poll();
					System.out.println("Cliente " + clienteChamado + " foi chamado.\n");				
									
				}
					
				for(String nomesClientes : nomeCliente) {
					System.out.println("Está na fila: " + nomesClientes);
				}		
			
				break;
				
			case 0:
				System.out.println("Finalizando o programa....");
				break;
				
				default:
					System.out.println("Opção inválida!");
			}			
			
			
		}while(opcao != 0);
			
			scan.close();
			
	}

}
