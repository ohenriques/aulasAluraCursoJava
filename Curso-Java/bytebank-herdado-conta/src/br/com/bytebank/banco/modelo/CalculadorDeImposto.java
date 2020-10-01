package br.com.bytebank.banco.modelo;

public class CalculadorDeImposto {
//	 Full Qualified Name ou FQN.
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
