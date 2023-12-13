package fila_pilha;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio_Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack<String> pilhaLivros = new Stack<>();
	        Scanner scanner = new Scanner(System.in);

	        int opcao;

	        do {
	            exibirMenu();
	            System.out.print("Entre com a opção desejada: ");
	            opcao = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (opcao) {
	                case 1:
	                    adicionarLivro(pilhaLivros, scanner);
	                    break;
	                case 2:
	                    listarLivros(pilhaLivros);
	                    break;
	                case 3:
	                    retirarLivro(pilhaLivros);
	                    break;
	                case 0:
	                    System.out.println("Programa finalizado!");
	                    break;
	            }

	        } while (opcao != 0);
	        
	        scanner.close();
	    }

	    private static void exibirMenu() {
	        System.out.println("\n * Menu * ");
	        System.out.println("1: Adicionar um Livro na pilha");
	        System.out.println("2: Listar todos os livros");
	        System.out.println("3: Retirar Livro da pilha");
	        System.out.println("0: Sair");
	    }

	    private static void adicionarLivro(Stack<String> pilhaLivros, Scanner scanner) {
	        System.out.print("Digite o nome do livro: ");
	        String nomeLivro = scanner.nextLine();
	        pilhaLivros.push(nomeLivro);
	        System.out.println("Livro adicionado à pilha.");
	    }

	    private static void listarLivros(Stack<String> pilhaLivros) {
	        if (pilhaLivros.isEmpty()) {
	            System.out.println("A pilha está vazia!");
	        } else {
	            System.out.println("Livros na pilha!");
	            for (String livro : pilhaLivros) {
	                System.out.println("- " + livro);
	            }
	        }
	    }

	    private static void retirarLivro(Stack<String> pilhaLivros) {
	        if (pilhaLivros.isEmpty()) {
	            System.out.println("A pilha está vazia!");
	        } else {
	            String livroRetirado = pilhaLivros.pop();
	            System.out.println("Livro retirado da pilha! " + livroRetirado);
	        }
	    }
	}

