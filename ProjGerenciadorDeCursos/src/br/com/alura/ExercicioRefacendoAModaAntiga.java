package br.com.alura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExercicioRefacendoAModaAntiga {

	public static void main(String[] args) {
		List<String> letras = new ArrayList<String>();
		letras.add("A");
		letras.add("B");
		letras.add("C");
		
		System.out.println("Forma atual de percorre lista. Java 8");
		letras.forEach(letra ->{
			System.out.println(letra);
		});
		
		System.out.println("Forma antiga de percorre lista. Antes do Java 8");
		Iterator<String> iterador = letras.iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}

	}

}
