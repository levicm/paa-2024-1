package a01_intro_p03;

public class EncontraMenor {

	public static void main(String[] args) {
		double precos[] = new double[5];
		precos[0] = 1000000;
		precos[1] = 46000;
		precos[2] = 16000;
		precos[3] = 44000;
		precos[4] = 17000;

		String nomes[] = new String[5];
		nomes[0] = "Trator";
		nomes[1] = "Jipe";
		nomes[2] = "Brasilia";
		nomes[3] = "Smart";
		nomes[4] = "Fusca";
		
		int atual = 0;
		int maisBarato = 0;
		
		for (;atual < 5; ++atual) {
			if (precos[atual] < precos[maisBarato]) {
				maisBarato = atual;
			}
		}
		
		System.out.println("O mais barato é " + nomes[maisBarato] + "(" + precos[maisBarato] + ")");
	}

}
