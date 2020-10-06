package com.br.pauloH.AluraCursos.Desafio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {

//		Lendo um arquivo
		InputStream fis = new FileInputStream("loren2.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

//		Verificando se o Arquivo está pronto p/ Leitura
		boolean StatusArquivo = br.ready();
		System.out.println("Arquivo Lido: " + StatusArquivo);

//		Gravando os dados de um arquivo em outro
		OutputStream fos = new FileOutputStream("Novo.txt");
		Writer opw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(opw);

//		Verificando se o Arquivo está pronto p/ gravação
		boolean StatusArquivogWriter = br.ready();
		System.out.println("Arquivo Escrito: " + StatusArquivogWriter);
		String linha = br.readLine();

//		Laço pra gravar uma linha de cada vez e logo após a outra e depois 
//		criar uma linha nova.
		while (linha != null) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine(); // ler uma nova linha
		}
		bw.close();
		br.close();
	}
}