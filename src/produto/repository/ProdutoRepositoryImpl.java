
package produto.repository;

import java.util.ArrayList;
import java.util.List;
import colchoes.model.Produto;
import colchoes.model.Colchao;
import colchoes.model.Travesseiro;
import conta.Cliente;

public class ProdutoRepositoryImpl implements ProdutoRepository {

	private List<Produto> produtos;
	private List<Cliente> clientes;

	public ProdutoRepositoryImpl() {
		produtos = new ArrayList<>();
		clientes = new ArrayList<>();
	}

	@Override
	public void cadastrarProduto(Produto produto) {
		produtos.add(produto);
	}

	@Override
	public void visualizarProdutos() {
		for (Produto produto : produtos) {
			System.out.println("Marca: " + produto.getMarca() + ", Preço: " + produto.getPreco() + ", Garantia: "
					+ produto.getGarantia() + " meses");
		}
	}

	@Override
	public boolean login(String email, int senha) {
		for (Cliente cliente : clientes) {
			if (cliente.getEmail().equals(email) && cliente.getSenha() == senha) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void cadastrarConta(Cliente cliente) {
		clientes.add(cliente);
	}

	@Override
	public Cliente obterConta(String email) {
		for (Cliente cliente : clientes) {
			if (cliente.getEmail().equals(email)) {
				return cliente;
			}
		}
		return null;
	}
}
