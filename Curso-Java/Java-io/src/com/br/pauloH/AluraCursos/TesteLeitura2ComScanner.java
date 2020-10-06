package com.br.pauloH.AluraCursos;

import java.io.File;
import java.util.Scanner;

public class TesteLeitura2ComScanner {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"));

		while (scanner.hasNext()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
		}
		scanner.close();
	}

}
