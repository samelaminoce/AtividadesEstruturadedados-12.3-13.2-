package fila_pilha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio_Fila {

	public static void main(String[] args) {
		   Queue<String> filaClientes = new LinkedList<>();
	        Scanner scanner = new Scanner(System.in);

	        int opcao;
	        do {
	            exibirMenu();
	            opcao = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (opcao) {
	                case 1:
	                    System.out.println("Insira O Nome:");
	                    String nomeCliente = scanner.nextLine();
	                    adicionarCliente(filaClientes, nomeCliente);
	                    break;
	                case 2:
	                    listarClientes(filaClientes);
	                    break;
	                case 3:
	                    chamarCliente(filaClientes);
	                    break;
	                case 0:
	                    System.out.println("Programa Encerrado!");
	                    break;
	            }

	        } while (opcao != 0);

	        scanner.close();
	    }

	    private static void exibirMenu() {
	        System.out.println("\n*Menu*");
	        System.out.println("1: Adicionar Cliente na Fila");
	        System.out.println("2: Listar Todos Os Clientes");
	        System.out.println("3: Retirar Cliente Da Fila");
	        System.out.println("0: Sair");
	        System.out.print("\nEntre Com a Opção Desejada: ");
	    }

	    private static void adicionarCliente(Queue<String> fila, String nomeCliente) {
	        fila.add(nomeCliente);
	        System.out.println(nomeCliente + " Foi Adicionado!.");
	    }

	    private static void listarClientes(Queue<String> fila) {
	        if (fila.isEmpty()) {
	            System.out.println("A fila está vazia.");
	        } else {
	            System.out.println("\nClientes na fila:");
	            for (String cliente : fila) {
	                System.out.println(cliente);
	            }
	        }
	    }

	    private static void chamarCliente(Queue<String> fila) {
	        if (fila.isEmpty()) {
	            System.out.println("A fila está vazia!");
	        } else {
	            String clienteChamado = fila.poll();
	            System.out.println("O " + clienteChamado + " Foi Chamado! ");
	        }
	    }

	}

