package a06_revisao_p04;

public class OrdenadorPorSelecao {

	public static void ordena(Comparable[] elementos) {
		for (int i = 0; i < elementos.length; ++i) {
			System.out.println("Estou na casinha " + i);
			Comparable atual = elementos[i];
			System.out.println("atual: " + atual);

			// Encontra o menor
			int indiceMenor = buscaMenor(elementos, i, elementos.length);
			Comparable menor = elementos[indiceMenor];
			System.out.println("menor: " + menor);

			// Faz a troca
			elementos[indiceMenor] = atual;
			elementos[i] = menor;
		}
	}

	private static int buscaMenor(Comparable[] elementos, int inicio, int fim) {
		int indiceDoMenor = inicio;
		for (int atual = inicio;atual < fim; ++atual) {
			if (elementos[atual].compareTo(elementos[indiceDoMenor]) < 0) {
				indiceDoMenor = atual;
			}
		}
		return indiceDoMenor;
	}
}







