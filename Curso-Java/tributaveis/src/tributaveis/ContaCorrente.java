package tributaveis;

public class ContaCorrente implements Tributavel {

	private int saldo;

	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return saca(valorASacar);
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 0;
	}

}
