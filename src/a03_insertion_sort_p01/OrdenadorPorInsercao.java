package a03_insertion_sort_p01;

public class OrdenadorPorInsercao {
	
	public static void ordena(Produto[] produtos) {
		for (int atual = 1; atual < produtos.length; ++atual) {
			int analise = atual;
			System.out.println("Atual: " + atual);

			while (analise > 0 && produtos[analise].valor < produtos[analise - 1].valor) {
				System.out.println("Analise: " + analise);
				System.out.println("Deslocando para trás: " + produtos[analise]);
				moverParaTras(produtos, analise);
				analise--;
			}
		}
	}

	private static void moverParaTras(Produto[] produtos, int posicao) {
		Produto prodAnalise = produtos[posicao];
		produtos[posicao] = produtos[posicao - 1];
		produtos[posicao - 1] = prodAnalise;
	}
}
