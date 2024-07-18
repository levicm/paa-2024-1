package a06_revisao_p05_lista02;

public class OrdenadorPorInsercao {
	
	public static void ordena(Comparable[] elementos) {
		for (int atual = 1; atual < elementos.length; ++atual) {
			int analise = atual;
			System.out.println("Atual: " + atual);

			while (analise > 0 && elementos[analise].compareTo(elementos[analise - 1]) < 0) {
				System.out.println("Analise: " + analise);
				System.out.println("Deslocando para trás: " + elementos[analise]);
				moverParaTras(elementos, analise);
				analise--;
			}
		}
	}

	private static void moverParaTras(Comparable[] elementos, int posicao) {
		Comparable prodAnalise = elementos[posicao];
		elementos[posicao] = elementos[posicao - 1];
		elementos[posicao - 1] = prodAnalise;
	}
}
