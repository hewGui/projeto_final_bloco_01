package colchoes.model;

public abstract class Produto {

	private String marca;
	private double preco;
	private int garantia;
	private String tipo;
	
	public Produto(String marca, double preco, int garantia) {
		this.marca = marca;
		this.preco = preco;
		this.garantia = garantia;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public double getPreco() {
		return preco;
	}

	public int getGarantia() {
		return garantia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void CalcularValorPrazo() {
		
		preco = (float) (preco + (preco * 0.5));
	}
	

}
