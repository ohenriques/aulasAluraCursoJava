package byteBank;

public class TesteReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo Primeira Conta: R$" + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo segunda conta: R$" + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo segunda conta: R$" + segundaConta.saldo);
		
	}

}
