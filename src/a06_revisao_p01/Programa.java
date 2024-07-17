package a06_revisao_p01;

public class Programa {

	public static void main(String[] args) {
		Aluno[] alunos = new Aluno[] { 
				new Aluno("Paulo", 5.7), 
				new Aluno("Maria", 2.3), 
				new Aluno("Joao", 7.8),
				new Aluno("Carlos", 9.3), 
				new Aluno("Carla", 1.9), 
				new Aluno("Julia", 3.2) };
		
		imprime(alunos);
			
		OrdenadorPorSelecao.ordena(alunos);
		
		imprime(alunos);

		// Busca o maior:
		System.out.println("Maior:");
		Aluno maior = alunos[alunos.length - 1];
		System.out.println(maior);

		// Busca o menor:
		System.out.println("Menor:");
		Aluno menor = alunos[0];
		System.out.println(menor);
		
		// Busca os 3 maiores:
		System.out.println("3 Maiores:");
		int maiores = 0;
		for (int i = alunos.length - 1; i >= 0 && maiores < 3; --i) {
			System.out.println(alunos[i]);
			maiores++;
		}
		
		// Busca os 3 menores:
		System.out.println("3 Menores:");
		int menores = 0;
		for (int i = 0; i < alunos.length && menores < 3; ++i) {
			System.out.println(alunos[i]);
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
