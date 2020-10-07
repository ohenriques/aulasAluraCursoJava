package br.com.alura.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteVerific {

	@Test
	public void verificaPrecoComImposto() {
		ProdutoTest bala = new ProdutoTest("juquinha", 0.10);
		assertEquals(0.11, bala.getPrecoComImposto(), 0.00001);
	}
}