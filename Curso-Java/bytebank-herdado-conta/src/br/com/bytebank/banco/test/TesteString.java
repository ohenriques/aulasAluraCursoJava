package br.com.bytebank.banco.test;

public class TesteString {
	public static void main(String[] args) {

		String nome = "Alura"; // Object literal

		String vazio = "         Paulo              ";
		System.out.println(vazio.contains("Pa"));
		
		String outroVazio = vazio.trim();
		System.out.println(outroVazio);

		System.out.println(nome.length());

		for (int i = 0; i < nome.length(); i++) {
			System.out.print(nome.charAt(i) + " ");
		}

//		String sub = nome.substring(1);
//		System.out.println(sub);
//		
//		int  pos = nome.indexOf("ur");
//		System.out.println(pos);
//		
//		char c = 'A';
//		char d = 'a';
//
//		String outra = nome.replace(c, d);
//
//		String outra = nome.toLowerCase();

//		System.out.println(nome);
//		System.out.println(outra);

	}
}