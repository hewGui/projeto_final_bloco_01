package produto.repository;

import conta.Cliente;
import produtos.model.Produto;

public interface ProdutoRepository {

	//CRUD
	
    void cadastrarProduto(Produto produto);
    void visualizarProdutos();
    boolean login(String email, int senha);
    void cadastrarConta(Cliente cliente);
    Cliente obterConta(String email);
	
}
