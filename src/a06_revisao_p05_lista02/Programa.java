package a06_revisao_p05_lista02;

public class Programa {

	public static void main(String[] args) {
		Aluno[] alunos = new Aluno[] { 
				new Aluno("Paulo", 5.7), 
				new Aluno("Maria", 2.3), 
				new Aluno("Joao", 7.8),
				new Aluno("Carlos", 9.3), 
				new Aluno("Carla", 1.9), 
				new Aluno("Julia", 3.2) };
			
		System.out.println("Processando Alunos...");
		processa(alunos);
		System.out.println();
		
		
		Produto[] produtos = new Produto[5];
		produtos[0] = new Produto("Trator",1000000);
		produtos[1] = new Produto("Jipe",46000);
		produtos[2] = new Produto("Brasilia",16000);
		produtos[3] = new Produto("Smart",44000);
		produtos[4] = new Produto("Fusca",17000);
		
		System.out.println("Processando Produtos...");
		processa(produtos);
		System.out.println();
	}

	private static void processa(Comparable[] elementos) {
		imprime(elementos);
		OrdenadorPorInsercao.ordena(elementos);
		imprime(elementos);

		buscaMaior(elementos);

		buscaMenor(elementos);
		
		buscaMaiores(elementos);
		
		buscaMenores(elementos);
	}

	private static void buscaMaior(Comparable[] elementos) {
		// Busca o maior:
		System.out.println("Maior:");
		Comparable maior = elementos[elementos.length - 1];
		System.out.println(maior);
	}

	private static void buscaMenor(Comparable[] elementos) {
		// Busca o menor:
		System.out.println("Menor:");
		Comparable menor = elementos[0];
		System.out.println(menor);
	}

	private static void buscaMaiores(Comparable[] elementos) {
		// Busca os 3 maiores:
		System.out.println("3 Maiores:");
		int maiores = 0;
		for (int i = elementos.length - 1; i >= 0 && maiores < 3; --i) {
			System.out.println(elementos[i]);
			maiores++;
		}
	}

	private static void buscaMenores(Comparable[] elementos) {
		// Busca os 3 menores:
		System.out.println("3 Menores:");
		int menores = 0;
		for (int i = 0; i < elementos.length && menores < 3; ++i) {
			System.out.println(elementos[i]);
			menores++;
		}
	}

	private static void imprime(Object[] elementos) {
		System.out.print("[");
		for (int i = 0; i < elementos.length; ++i) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(elementos[i].toString());
		}
		System.out.println("]");
	}

}
