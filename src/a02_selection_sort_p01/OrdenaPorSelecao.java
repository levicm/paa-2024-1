package a02_selection_sort_p01;

public class OrdenaPorSelecao {

	public static void main(String[] args) {
		Produto[] produtos = new Produto[5];
		produtos[0] = new Produto("Trator",1000000);
		produtos[1] = new Produto("Jipe",46000);
		produtos[2] = new Produto("Brasilia",16000);
		produtos[3] = new Produto("Smart",44000);
		produtos[4] = new Produto("Fusca",17000);
		
		System.out.print("[");
		for (int i = 0; i < produtos.length; ++i) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(produtos[i]);
		}
		System.out.println("]");

		for (int i = 0; i < produtos.length; ++i) {
			// Encontra o menor
			int indiceMenor = buscaMenor(produtos);
			// Faz a troca
			Produto menor = produtos[indiceMenor];
			Produto atual = produtos[i];
			produtos[indiceMenor] = atual;
			produtos[i] = menor;
		}
		
		System.out.print("[");
		for (int i = 0; i < produtos.length; ++i) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(produtos[i]);
		}
		System.out.println("]");

		System.out.println("O mais barato é " + produtos[0].nome + 
				"(" + produtos[0].valor + ")");
	}

	private static int buscaMenor(Produto[] produtos) {
		int atual = 0;
		int maisBarato = 0;
		for (;atual < produtos.length; ++atual) {
			if (produtos[atual].valor < produtos[maisBarato].valor) {
				maisBarato = atual;
			}
		}
		return maisBarato;
	}

}
