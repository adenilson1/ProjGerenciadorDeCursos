package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestePerformace {
	public static void main(String[] args) {
		
		Collection<Integer> numeros = new ArrayList<Integer>();
		
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i<= 50000; i++) {
			numeros.add(i);
		}
		
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
		
		long fim = System.currentTimeMillis();
		
		long tempoDeexecucao = fim - inicio;
		
		System.out.println(tempoDeexecucao);
		
		// nuemros sem array
		Collection<Integer> numerosSemArray = new HashSet<Integer>();
		
		long inicio2 = System.currentTimeMillis();
		
		for(int i = 0; i<= 50000; i++) {
			numerosSemArray.add(i);
		}
		
		for (Integer numero : numerosSemArray) {
			System.out.println(numero);
		}
		
		long fim2 = System.currentTimeMillis();
		
		long tempoDeexecucao2 = fim2 - inicio2;
		
		System.out.println(tempoDeexecucao2);
	}

}
