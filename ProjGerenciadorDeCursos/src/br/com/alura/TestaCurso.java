package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominado as coleçẽos do java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayLis", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleçẽos", 22));

		System.out.println(javaColecoes.getAulas());

	}

}
