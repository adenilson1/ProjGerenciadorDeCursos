package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TesteAlunos {
	public static void main(String[] args) {

	Collection<String> alunos = new HashSet<>();

		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Saouza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");

		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);

		alunos.remove("Sergio Lopes");
		System.out.println(alunos);

		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		System.out.println(alunos.size());

		// outra forma de for

		alunos.forEach(aluno -> {

			System.out.println(aluno);
		});
		
		List<String> alunosEmLista = new ArrayList<String>(alunos);
		//ogora podeser ordenar o conjunto
		Collections.sort(alunosEmLista);
		
		System.out.println("----------------------");
		for (String aluno : alunosEmLista) {
			System.out.println(aluno);
		}
		

	}

}
