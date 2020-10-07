package br.com.alura.maven;

public class ProdutoTest {

	private final String nome;
	private final double preco;

	public ProdutoTest(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public double getPrecoComImposto() {
		return preco * 1.10;
	}

}