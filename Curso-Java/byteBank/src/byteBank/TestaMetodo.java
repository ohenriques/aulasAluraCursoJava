package byteBank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta pauloConta = new Conta();
		pauloConta.saldo = 100;
		pauloConta.deposita(50);
		System.out.println(pauloConta.saldo);

		boolean conseguiuRetirar = pauloConta.saca(20);
		System.out.println(pauloConta.saldo);
		System.out.println(conseguiuRetirar);

		Conta marcelaConta = new Conta();
		marcelaConta.saldo = 1000;
		
		
		marcelaConta.transfere(300, pauloConta);
		
		System.out.println(marcelaConta.saldo);
		System.out.println(pauloConta.saldo);
		
		
	}

}
