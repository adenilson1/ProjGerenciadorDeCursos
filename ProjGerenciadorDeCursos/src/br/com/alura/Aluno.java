package br.com.alura;

public class Aluno {
	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		if (nome == null)
			throw new NullPointerException("Nome não pode ser null");
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public boolean equals(Object obj) {// metodo que compracoes de objetos, porem deve-s criar um condição de compracao
		Aluno outro = (Aluno) obj; // criando o objeto de comparação
		return this.nome.equals(outro.nome); // retornando o metodo de comparação
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode(); // identificando o objeto pelo da soma de todos os caractes da string
	}

	@Override
	public String toString() {

		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}
	

	

}
