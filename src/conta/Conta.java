package conta;

public abstract class Conta {
	
	String nome;
	String email;
	int senha;
	
	public Conta(String nome, String email, int senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public int getSenha() {
		return senha;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
}
