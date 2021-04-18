package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteRevisaoAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("Matematica 1", 20);
		Aula a2 = new Aula("Biologia", 25);
		Aula a3 = new Aula("Fisica", 15);

		ArrayList<Aula> aulas = new ArrayList<Aula>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);

		// imprimindo aulas
		System.out.println("Impirmindo as aulas com o tempo");
		System.out.println(aulas);

		// ordenando as aulas pelo nome
		System.out.println("Impirmindo as aulas pela oredem do nome");
		Collections.sort(aulas);
		System.out.println(aulas);

		// ordenando pelo tempo de aulas
		System.out.println("Impirmindo as aulas pela ordem do tempo de aula");
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
	}

}
