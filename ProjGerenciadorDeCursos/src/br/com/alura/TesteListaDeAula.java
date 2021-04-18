package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revisando as ArrayList", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

		ArrayList<Aula> aulas = new ArrayList<Aula>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
	

		System.out.println(aulas);

		Collections.sort(aulas); // comparando pelo nome, ordem alfabetica
		System.out.println(aulas);

		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));// comparando aulas pelo tempo
		System.out.println(aulas);
		
		// desde java 8, ja existe um metodo comparation
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);

	}

}
