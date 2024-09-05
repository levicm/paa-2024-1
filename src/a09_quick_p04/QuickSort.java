package a09_quick_p04;

import a08_merge_p12.Aluno;

public class QuickSort {

	public static void main(String[] args) {
		Aluno[] alunos = new Aluno[] {
				new Aluno("André", 4),
				new Aluno("Carlos", 8.5),
				new Aluno("Ana", 10),
				new Aluno("Jonas", 3),
				new Aluno("Juliana", 6.7),
				new Aluno("Lúcia", 9.3),
				new Aluno("Paulo", 9),
				new Aluno("Mariana", 5),
				new Aluno("Gui", 7)
		};
		imprime(alunos);

		ordena(alunos, 0, alunos.length);
		
		imprime(alunos);
	}


	private static void ordena(Aluno[] alunos, int inicio, int fim) {
		int qtd = fim - inicio;
		if (qtd > 1) {
			int pivo = particiona(alunos, inicio, fim);
			ordena(alunos, inicio, pivo);
			ordena(alunos, pivo + 1, fim);
		}
	}


	private static int particiona(Aluno[] alunos, int inicio, int fim) {
		int menoresAteAgora = 0;
		int posicaoPivo = fim - 1;
		
		Aluno pivo = alunos[posicaoPivo];
		for (int i = inicio; i < fim; ++i) {
			if (alunos[i].compareTo(pivo) < 0) {
				troca(alunos, i, inicio + menoresAteAgora);
				menoresAteAgora++;
			}
		}
		troca(alunos, posicaoPivo, inicio + menoresAteAgora);
		System.out.println("menoresAteAgora: " + menoresAteAgora);
		System.out.println("nova posicao pivo: " + (inicio + menoresAteAgora));
		return inicio + menoresAteAgora;
	}


	private static void troca(Aluno[] alunos, int p1, int p2) {
		Aluno temp = alunos[p1];
		alunos[p1] = alunos[p2];
		alunos[p2] = temp;
	}


	private static void imprime(Aluno[] alunos) {
		System.out.print("[");
		for (int i = 0; i < alunos.length; ++i) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(alunos[i]);
		}
		System.out.println("]");
	}
}
