package a06_revisao_p01;

public class Aluno implements Comparavel {
	
	protected String nome;
	protected double nota;

	public Aluno(String nome, double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}

	@Override
	public double getValorDeComparacao() {
		return nota;
	}
	
	@Override
	public String toString() {
		return nome + " (" + nota + ")";
	}
}
