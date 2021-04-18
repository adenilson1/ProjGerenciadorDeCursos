package br.com.alura;

public class ExecicicoColecoes {

	public static void main(String[] args) {
		
		Curso javaCursos = new Curso("Curso de revisao", "Adenilson");
		
		javaCursos.adiciona(new Aula("Matematica basica", 30));
		javaCursos.adiciona(new Aula("Fisica basica", 15));
		
		System.out.println(javaCursos.getAulas());
		

	}

}
