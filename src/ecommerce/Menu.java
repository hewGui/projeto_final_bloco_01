package ecommerce;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println("**************************************************");
			System.out.println("                                                  ");
			System.out.println("            Colchões Bons Sonhos                  ");
			System.out.println("                                                  ");
			System.out.println("**************************************************");
			System.out.println("                                                  ");
			System.out.println("              1 - Criar Conta	                  ");
			System.out.println("              2 - Login			                  ");
			System.out.println("              3 - Visualizar Produtos	          ");
			System.out.println("              4 - Consultar Rastreio		      ");
			System.out.println("              5 - Visualizar Carrinho		      ");
			System.out.println("              6 - Sobre Nós				          ");
			System.out.println("              7 - FAQ					          ");
			System.out.println("              8 - Sair					          ");
			System.out.println("                                                  ");
			System.out.println("**************************************************");
			System.out.println("Entre com a opção desejada:                       ");
			System.out.println("                                                  ");

			opcao = leia.nextInt();

			if (opcao == 8) {
				System.out.println("\nColchões Bons Sonhos - Cuidando do seu sono desde 2024");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar uma Conta\n\n");

				break;
			case 2:
				System.out.println("Realize o Login\n\n");

				break;
			case 3:
				System.out.println("Visualizar Produtos\n\n");

				break;
			case 4:
				System.out.println("Consultar rastreio\n\n");

				break;
			case 5:
				System.out.println("Visualizar carrinho\n\n");

				break;
			case 6:
				System.out.println("Sobre nós\n\n");

				break;
			case 7:
				System.out.println("Consulte FAQ\n\n");

				break;
			default:
				System.out.println("\nOpção Inválida");
				break;

			}
		}

	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Guilherme Soares ");
		System.out.println("guilhermesoaresilvat@gmail.com");
		System.out.println("github.com/hewGui");
		System.out.println("*********************************************************");

	}

}
