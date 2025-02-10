package exerciciosFilaEPilha;

import java.util.Scanner;
import java.util.Stack;

/*
 * Escreva um programa contendo uma Collection Stack (Pilha) de Objetos string, para organizar a retirada de livros de uma pilha. 
 * O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
2: Listar todos os livros da Pilha
3: Retirar um livro da pilha 
0: O programa deve ser finalizado. 
Caso a pilha esteja vazia, ao tentar retirar um livro da pilha, o programa deverá informar que a pilha está vazia.

 */
public class AdicionaLivroPilha {
	public static void main(String[] args) {
		
		Stack<String> livros = new Stack<String>();
		
		Scanner scan = new Scanner(System.in);
		
		int opcao;				
		
		do{
			System.out.println("\n************************************");
			System.out.println("MENU");
			System.out.println("1- Adicionar Livro na pilha");
			System.out.println("2- Listar todos os Livros");
			System.out.println("3- Retirar o Livro da Pilha");
			System.out.println("0- Sair");
			
			System.out.println("\n************************************\n");
			
			System.out.print("Entre com a opção desejada: ");
			opcao = scan.nextInt();
			scan.nextLine();
			
		switch(opcao) {
		case 1:
	
			System.out.print("Digite o nome do livro:");
			String nomeLivro = scan.nextLine();	
			livros.push(nomeLivro);
			System.out.println("Livro " + nomeLivro + " foi adicionado!");						
						
			break;
			
		case 2:				
			System.out.println("Lista de Livros na Pilha:\n ");
			for(String livro : livros) {
				System.out.println(livro);					
			}
			
			break;
			
		case 3:
			if(livros.isEmpty()) {
				System.out.println("A pilha está vazia!");
			}
			else {
				String retiraLivro = livros.pop();
				System.out.println("Livro: " + retiraLivro + " foi retirado da Pilha.\n");				
								
			}
				
			for(String livrosPilha : livros) {
				System.out.println(livrosPilha);
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
	


