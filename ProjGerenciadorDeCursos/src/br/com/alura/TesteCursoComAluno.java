package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TesteCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominado as coleçẽos do java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayLis", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleçẽos", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Todos os alunos matriculados: ");
		
		//forma antiga de busca com iterator, usando no java 5. percorre todos os elementos do conjunto. a lista tam
		//bem tem o iterator
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			Aluno proximo  = iterador.next();
			System.out.println(proximo);
		}
		
		
//		javaColecoes.getAlunos().forEach(a -> {
//			System.out.println(a.toString());
//		});

		System.out.println("O aluno " + a1 + " está matriculado ?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E ess turini esta matriculado ?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("Os alunos a1 e turini são iguais ?");
		System.out.println(a1.equals(turini));
		
		
		//Obrigatoriamene o seguinte true
		
		System.out.println(a1.hashCode() == turini.hashCode());
		
		
		
		
		
		
		

	}

}
