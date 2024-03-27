package a03_insertion_sort_p01;

public class Programa {

	public static void main(String[] args) {
		OrdenadorPorInsercao.ordena(new Produto[] {});

		Produto[] produtos = new Produto[5];
		produtos[0] = new Produto("Trator",1000000);
		produtos[1] = new Produto("Jipe",46000);
		produtos[2] = new Produto("Brasilia",16000);
		produtos[3] = new Produto("Smart",44000);
		produtos[4] = new Produto("Fusca",17000);
		
		imprime(produtos);
		
//		OrdenadorPorSelecao.ordena(produtos);
		OrdenadorPorInsercao.ordena(produtos);

		imprime(produtos);

		System.out.println("O mais barato é " + produtos[0].nome + 
				"(" + produtos[0].valor + ")");
	}
	
	private static void imprime(Produto[] produtos) {
		System.out.print("[");
		for (int i = 0; i < produtos.length; ++i) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(produtos[i]);
		}
		System.out.println("]");
	}

}
