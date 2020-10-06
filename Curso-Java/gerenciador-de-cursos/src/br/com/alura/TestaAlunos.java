package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();

		alunos.add("Paulo H");
		alunos.add("Albertin Souza");
		alunos.add("Jokas Oks");
		alunos.add("Luis Felips");
		alunos.add("Mauricio Linhares");
		alunos.add("Linhares Macedo ");

		boolean contains = alunos.contains("Paulo H");
		alunos.remove("Jokas Oks"); //removendo o elemento
		System.out.println(contains);
		
		System.out.println(alunos.size());

		for (String string : alunos) {
			System.out.println(string);
		}	
		
		alunos.forEach(aluno -> {System.out.println(aluno);});
		
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<String>(alunos);

		System.out.println(alunosEmLista.indexOf("Luis Felips"));
	
	}

}
