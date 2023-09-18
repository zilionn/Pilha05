package view;

import java.util.Scanner;

import controller.HistoricoController;
import model.PilhaString;

public class Principal {
	 public static void main(String[] args) throws Exception {
	        PilhaString historico = new PilhaString();
	        try (Scanner sc = new Scanner(System.in)) {
				while (true) {
				    System.out.println("\nMenu:");
				    System.out.println("1. Inserir novo endereço");
				    System.out.println("2. Remover último endereço");
				    System.out.println("3. Consultar último endereço");
				    System.out.println("4. Sair");

				    System.out.print("Escolha uma opção: ");
				    int escolha = sc.nextInt();
				    sc.nextLine(); 

				    switch (escolha) {
				        case 1:
				            System.out.print("Digite o novo endereço: ");
				            String endereco = sc.nextLine();
				            HistoricoController.inserirEndereco(historico, endereco);
				            break;
				        case 2:
				            HistoricoController.removerUltimoEndereco(historico);
				            break;
				        case 3:
				            HistoricoController.consultarUltimoEndereco(historico);
				            break;
				        case 4:
				            System.out.println("Encerrando o histórico.");
				            System.exit(0);
				            break;
				        default:
				            System.out.println("Opção inválida. Tente novamente.");
				    }
				}
			}
	    }
	}


