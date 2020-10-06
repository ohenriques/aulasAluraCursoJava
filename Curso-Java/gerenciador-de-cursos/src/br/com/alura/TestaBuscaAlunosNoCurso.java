package br.com.alura;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 22));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 22));

		Aluno a1 = new Aluno("Paulo Henrique", 34672);
		Aluno a2 = new Aluno("Nico Steppat", 5617);
		Aluno a3 = new Aluno("Linhares Mauricio", 17645);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem é o aluno com matricula 5617?");
		Aluno aluno = javaColecoes.buscaMatriculado(5612);
		System.out.println("Aluno: " + aluno);
		
	}
	
}
