package a03_insertion_sort_p01;

public class OrdenadorPorSelecao {

	public static void ordena(Produto[] produtos) {
		for (int i = 0; i < produtos.length; ++i) {
			System.out.println("Estou na casinha " + i);
			Produto atual = produtos[i];
			System.out.println("atual: " + atual);

			// Encontra o menor
			int indiceMenor = buscaMenor(produtos, i, produtos.length);
			Produto menor = produtos[indiceMenor];
			System.out.println("menor: " + menor);

			// Faz a troca
			produtos[indiceMenor] = atual;
			produtos[i] = menor;
		}
	}

	private static int buscaMenor(Produto[] produtos, int inicio, int fim) {
		int maisBarato = inicio;
		for (int atual = inicio;atual < fim; ++atual) {
			if (produtos[atual].valor < produtos[maisBarato].valor) {
				maisBarato = atual;
			}
		}
		return maisBarato;
	}
}
