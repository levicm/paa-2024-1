package a01_intro_p04;

public class EncontraMenor {

	public static void main(String[] args) {
		Produto[] produtos = new Produto[5];
		produtos[0] = new Produto("Trator",1000000);
		produtos[1] = new Produto("Jipe",46000);
		produtos[2] = new Produto("Brasilia",16000);
		produtos[3] = new Produto("Smart",44000);
		produtos[4] = new Produto("Fusca",17000);
		
		int atual = 0;
		int maisBarato = 0;
		
		for (;atual < 5; ++atual) {
			if (produtos[atual].valor < produtos[maisBarato].valor) {
				maisBarato = atual;
			}
		}
		
		System.out.println("O mais barato é " + produtos[maisBarato].nome + 
				"(" + produtos[maisBarato].valor + ")");
	}

}
