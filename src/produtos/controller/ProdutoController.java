
package produtos.controller;

import java.util.ArrayList;
import java.util.List;

import conta.Cliente;
import produto.repository.ProdutoRepository;
import produtos.model.Colchao;
import produtos.model.Produto;
import produtos.model.Travesseiro;

public class ProdutoController implements ProdutoRepository {

	private List<Produto> produtos;
	private List<Cliente> clientes;

	public ProdutoController() {
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
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email não pode ser nulo ou vazio");
        }
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
