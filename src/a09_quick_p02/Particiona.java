package a09_quick_p02;

import a08_merge_p12.Aluno;

public class Particiona {

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

		particiona(alunos);
		
		imprime(alunos);
	}


	private static void particiona(Aluno[] alunos) {
		int inicio = 0;
		int fim = alunos.length;
		int menoresAteAgora = 0;
		int posicaoPivo = fim - 1;
		
		Aluno pivo = alunos[posicaoPivo];
		for (int i = inicio; i < fim; ++i) {
			if (alunos[i].compareTo(pivo) < 0) {
				troca(alunos, i, menoresAteAgora);
				menoresAteAgora++;
			}
		}
		troca(alunos, posicaoPivo, menoresAteAgora);
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
