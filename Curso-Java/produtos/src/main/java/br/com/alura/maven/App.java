package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		ProdutoTest produto = new ProdutoTest("Bala Juquinha", 0.15);
		
		System.out.println("A bala que eu gosto é " + produto.getNome() + " E custa " + produto.getPreco());
	}
}
