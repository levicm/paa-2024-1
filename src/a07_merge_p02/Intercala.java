package a07_merge_p02;

public class Intercala {

	public static void main(String[] args) {
		Aluno[] alunosAniche = new Aluno[] {
				new Aluno("André", 4),
				new Aluno("Mariana", 5),
				new Aluno("Carlos", 8.5),
				new Aluno("Paulo", 9)
		};
		imprime(alunosAniche);

		Aluno[] alunosAlberto = new Aluno[] {
				new Aluno("Jonas", 3),
				new Aluno("Juliana", 6.7),
				new Aluno("Gui", 7),
				new Aluno("Lúcia", 9.3),
				new Aluno("Ana", 10)
		};
		imprime(alunosAlberto);

		Aluno[] intercalado = intercala(alunosAniche, alunosAlberto); 
		imprime(intercalado);
	}

	private static Aluno[] intercala(Aluno[] alunos1, Aluno[] alunos2) {
		Aluno[] resultado = new Aluno[alunos1.length + alunos2.length];
		int atual1 = 0, atual2 = 0, atual = 0;
		
		while (atual1 < alunos1.length && atual2 < alunos2.length) {
			if (alunos1[atual1].nota < alunos2[atual2].nota) {
				resultado[atual++] = alunos1[atual1++];
			} else {
				resultado[atual++] = alunos2[atual2++];
			}
			System.out.println("atual1: " + atual1 + ". atual2: " + atual2 + ". alunos1.length: " + alunos1.length + ". alunos2.length: " + alunos2.length);
		}
		
		while (atual1 < alunos1.length) {
			resultado[atual++] = alunos1[atual1++];
		}
		while (atual2 < alunos2.length) {
			resultado[atual++] = alunos2[atual2++];
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
