package com.br.pauloH.AluraCursos;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
public class TesteEscrita2FileWriter {

	public static void main(String[] args) throws IOException {
		
//		Fluxo de entrada com arquivo
		OutputStream fos = new FileOutputStream("loren2.txt");
		Writer opw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(opw);

		bw.write("Que saudade desse cheiro de cigarro e desse álcool puro\r\n"
				+ "Rita eu desculpo tudo\r\n"
				+ " ");
//		bw.newLine();
		bw.newLine();
		bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
		bw.close();
	}
}