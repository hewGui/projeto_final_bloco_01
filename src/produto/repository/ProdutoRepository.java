package produto.repository;

import colchoes.model.Produto;
import conta.Cliente;

public interface ProdutoRepository {

	//CRUD
	
    void cadastrarProduto(Produto produto);
    void visualizarProdutos();
    boolean login(String email, int senha);
    void cadastrarConta(Cliente cliente);
    Cliente obterConta(String email);
	
}
