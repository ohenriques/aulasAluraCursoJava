package com.br.pauloH.AluraCursos;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscrita3FileWriter {

	public static void main(String[] args) throws IOException {

//		Fluxo de entrada com arquivo
		// Fluxo de Entrada com Arquivo
		// OutputStream fos = new FileOutputStream("lorem2.txt");
		// Writer osw = new OutputStreamWriter(fos);
		// Buff3eredWriter bw = new BufferedWriter(osw);

		// BufferedWriter bw = new BufferedWriter( new FileWriter("lorem2.txt"));

		PrintStream ps = new PrintStream("lorem2.txt");
		ps.println("texto textotexto textotexto texto");
		ps.println();
		ps.println("texto texto texto texto texto texto");
		ps.close();
		
		System.out.println();
	}
}