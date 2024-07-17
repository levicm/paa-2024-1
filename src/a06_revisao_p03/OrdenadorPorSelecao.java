package a06_revisao_p03;

public class OrdenadorPorSelecao {

	public static void ordena(Comparavel[] elementos) {
		for (int i = 0; i < elementos.length; ++i) {
			System.out.println("Estou na casinha " + i);
			Comparavel atual = elementos[i];
			System.out.println("atual: " + atual);

			// Encontra o menor
			int indiceMenor = buscaMenor(elementos, i, elementos.length);
			Comparavel menor = elementos[indiceMenor];
			System.out.println("menor: " + menor);

			// Faz a troca
			elementos[indiceMenor] = atual;
			elementos[i] = menor;
		}
	}

	private static int buscaMenor(Comparavel[] elementos, int inicio, int fim) {
		int indiceDoMenor = inicio;
		for (int atual = inicio;atual < fim; ++atual) {
			if (elementos[atual].getValorDeComparacao() < 
					elementos[indiceDoMenor].getValorDeComparacao()) {
				indiceDoMenor = atual;
			}
		}
		return indiceDoMenor;
	}
}







