package a06_revisao_p03;

public class Produto implements Comparavel {
	
	String nome;
	double valor;
	
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return nome + "(" + valor + ")";
	}

	@Override
	public double getValorDeComparacao() {
		return valor;
	}
}
