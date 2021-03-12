
public class Atividade13 {

	/* Complete o codigo para verificar se a frase "A dama admirou o rim da amada" 
	 * é um Palíndromo.
	 * 
	 * Dicas:
	 * Palíndromo, do grego palin (novo) e dromo (percurso), é toda palavra ou 
	 * frase que pode ser lida de trás pra frente e que, independente da direção, 
	 * mantém o seu sentido.
	 * - Remova os espaços entre as palavras. */

	public static void main(String[] args) {

		String frase = "A dama admirou o rim da amada";
		frase = frase.toUpperCase().replace(" ","");
		for(int i = 0; i >= frase.length() - 1; i--) {
			System.out.print(frase.charAt(i)+ " ");
		}
		System.out.println();
		if(frase.equals(frase)) {
			System.out.println("É PALÍDROMO");

		}

	}

}
