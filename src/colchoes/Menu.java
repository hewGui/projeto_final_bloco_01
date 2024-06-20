package colchoes;

import java.util.InputMismatchException;
import java.util.Scanner;
import colchoes.model.Produto;
import colchoes.model.Colchao;
import colchoes.model.Travesseiro;
import conta.Cliente;
import produto.repository.ProdutoRepository;
import produto.repository.ProdutoRepositoryImpl;


public class Menu {

	public static void main(String[] args) {
		
		
		ProdutoRepository repo = new ProdutoRepositoryImpl();
		
		repo.cadastrarProduto(new Colchao("Emma", 500f, 10));
        repo.cadastrarProduto(new Travesseiro("Ortobom", 150f, 3));
        repo.cadastrarProduto(new Colchao("Ortobom", 900f, 15));
        repo.cadastrarProduto(new Travesseiro("Luuna", 200f, 5));
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, senha;
		String email;
		

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
			System.out.println("              4 - FAQ					          ");
			System.out.println("              5 - Sair					          ");
			System.out.println("                                                  ");
			System.out.println("**************************************************");
			System.out.println("Entre com a opção desejada:                       ");
			System.out.println("                                                  ");

			try {
				
				opcao = leia.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nOpção Inválida!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 5) {
				System.out.println("\nColchões Bons Sonhos - Cuidando do seu sono desde 2024");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
                System.out.println("Crie sua Conta\n\n");
                System.out.print("Nome: ");
                leia.nextLine();
                String nome = leia.nextLine();
                System.out.print("Email: ");
                email = leia.nextLine();
                System.out.print("Senha: ");
                senha = leia.nextInt();
                repo.cadastrarConta(new Cliente(nome, email, senha));
                System.out.println("Conta criada com sucesso!\n");
                System.out.println("Conta criada com sucesso!\n");
				
				break;
			case 2:
                System.out.println("Realize o Login\n\n");
                System.out.print("Email: ");
                leia.nextLine();
                email = leia.nextLine();
                System.out.print("Senha: ");
                senha = leia.nextInt();
                if (repo.login(email, senha)) {
                    System.out.println("Login realizado com sucesso!\n");
                } else {
                    System.out.println("Email ou senha incorretos!\n");
                }
				break;
			case 3:
				System.out.println("Visualizar Produtos\n\n");
				repo.visualizarProdutos();
				
				break;			
			case 4:
				System.out.println("Consulte FAQ\n\n");
				//implementar metodo no final do código com a FAQ
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
