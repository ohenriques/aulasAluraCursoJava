package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("x");
//		System.out.println(4);
//		System.out.println(false);
//		
		ContaCorrente cc = new ContaCorrente(22, 32);
		ContaPoupanca cp = new ContaPoupanca(44, 44);
		ContaCorrente cliente = new ContaCorrente(22,66);
		System.out.println(cliente.toString());
		System.out.println(cp);
		
		
	}

	static void println() {	}
	static void println(int a) {	}
	static void println(boolean valor) {	}
	static void println(Conta conta) {	}

	
}
