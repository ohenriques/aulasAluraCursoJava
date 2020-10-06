package br.com.alura;

public class TestaCursoComAlunos {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 22));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 22));

		Aluno a1 = new Aluno("Paulo Henrique", 346713);
		Aluno a2 = new Aluno("Nico Steppat", 45454);
		Aluno a3 = new Aluno("Linhares Mauricio", 878787);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Alunos nesse curso");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);

		});

		System.out.println("O aluno "+ a1 +" Está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		
		
		Aluno paulo = new Aluno("Paulo Henrique", 346713);
		System.out.println("Paulo Está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(paulo));
		
		System.out.println("o A1 é igual ao Paulo?");
		System.out.println(a1.equals(paulo));
		
//		Obrigatoriamente o seguitne e True;
		
		System.out.println(a1.hashCode() == paulo.hashCode());
	}

}
