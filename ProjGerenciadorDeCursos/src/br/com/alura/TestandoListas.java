package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String curso1 = "JAVA";
		String curso2 = "Modelagem BD";
		String curso3 = "Banco de Dados Oracle";

		ArrayList<String> cursos = new ArrayList<String>();

		System.out.println("Adicionando cursos a lista:");
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		System.out.println(cursos.toString());

		// removendo
		System.out.println("Removendo cursos a lista:");
		cursos.remove(0);
		System.out.println(cursos.toString());

		// nome do primeiro curso
		System.out.println("Nome do primeiro curso da lista:");
		System.out.println(cursos.get(0));

		// erro ao acessar um elemento da lista que não exite, caso o indice for igual
		// ao tamanho da lisa
		System.out.println("Erro na lista:");
		for (int i = 0; i < cursos.size(); i++) {
			System.out.println(cursos.get(i));
		}

		// ordenando a lista
		System.out.println("Ordenando a lista:");
		cursos.add("Machine Learnig");
		Collections.sort(cursos);
		System.out.println(cursos);
	}

}
