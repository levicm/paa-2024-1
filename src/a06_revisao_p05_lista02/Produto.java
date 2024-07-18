package a06_revisao_p05_lista02;

public class Produto implements Comparable {
	
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
	public int compareTo(Object o) {
		if (o instanceof Produto) {
			Produto outro = (Produto) o;
			if (valor < outro.valor) {
				return -1;
			} else if (valor > outro.valor) {
				return 1;
			} 
		}
		return 0;
	}
}
