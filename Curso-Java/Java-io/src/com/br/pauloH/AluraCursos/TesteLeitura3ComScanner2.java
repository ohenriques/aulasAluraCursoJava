package com.br.pauloH.AluraCursos;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura3ComScanner2 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"));

		while (scanner.hasNext()) {
			String linha = scanner.nextLine();
			System.out.println(linha);

			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US); // Usando padr�o de pontos e virgulas Americano
			linhaScanner.useDelimiter(","); // os delimitadores s�o virgulas

			String valor1 = linhaScanner.next();
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			double valor5 = linhaScanner.nextDouble();
			
			String valorFormatado = String.format("%s %s %s %s %s %s", valor1, valor2, valor3, valor4, valor5);
			System.out.println(valorFormatado);

//			String[] valores = linha.split(",");
//			System.out.println((valores[3]));		
		}
		scanner.close();
	}

}
