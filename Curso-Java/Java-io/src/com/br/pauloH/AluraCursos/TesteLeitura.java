package com.br.pauloH.AluraCursos;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
	public static void main(String[] args) throws IOException {

//		Fluxo de entrada com arquivo
		InputStream fis = new FileInputStream("loren.txt"); // Pega o
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		String linha = br.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine(); // ler uma nova linha
		}
		br.close();
	}
}