package a07_merge_p06;

public class Intercala {

	public static void main(String[] args) {
		Aluno[] alunos = new Aluno[] {
				new Aluno("André", 4),
				new Aluno("Mariana", 5),
				new Aluno("Carlos", 8.5),
				new Aluno("Paulo", 9),
				new Aluno("Jonas", 3),
				new Aluno("Juliana", 6.7),
				new Aluno("Gui", 7),
				new Aluno("Lúcia", 9.3),
				new Aluno("Ana", 10)
		};
		imprime(alunos);

		Aluno[] intercalado = intercala(alunos, 1, 4, 7);
		imprime(intercalado);
	}

	private static Aluno[] intercala(Aluno[] alunos, int inicio, int meio, int fim) {
		Aluno[] resultado = new Aluno[fim - inicio];
		int atual1 = inicio, atual2 = meio, atual = 0;
		
		while (atual1 < meio && atual2 < fim) {
			if (alunos[atual1].nota < alunos[atual2].nota) {
				resultado[atual++] = alunos[atual1++];
			} else {
				resultado[atual++] = alunos[atual2++];
			}
			System.out.println("atual1: " + atual1 + ". atual2: " + atual2 + ". meio: " + meio + ". alunos.length: " + alunos.length);
		}
		
		while (atual1 < meio) {
			resultado[atual++] = alunos[atual1++];
		}
		while (atual2 < fim) {
			resultado[atual++] = alunos[atual2++];
		}
		
		return resultado;
	}

	private static void imprime(Aluno[] alunos) {
		for (int i = 0; i < alunos.length; ++i) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(alunos[i]);
		}
		System.out.println();
	}
}
