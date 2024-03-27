package a03_insertion_sort_p01;

public class Produto {
	
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
}
