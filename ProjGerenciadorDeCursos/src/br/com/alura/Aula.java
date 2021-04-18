package br.com.alura;

public class Aula implements Comparable<Aula> {// preciso implementar a classe comparable a minha classe

	private String titulo;
	private int tempo;

	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	// rescrevendo a string para se apresentar com o titulo e o tempo
	@Override
	public String toString() {
		return "[ Aula: " + this.titulo + " , " + this.tempo + " minutos]";
	}

	// Medoto de comparação implementada da classe comparable
	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}

}
