
public class Atividade13 {

	/* Complete o codigo para verificar se a frase "A dama admirou o rim da amada" 
	 * � um Pal�ndromo.
	 * 
	 * Dicas:
	 * Pal�ndromo, do grego palin (novo) e dromo (percurso), � toda palavra ou 
	 * frase que pode ser lida de tr�s pra frente e que, independente da dire��o, 
	 * mant�m o seu sentido.
	 * - Remova os espa�os entre as palavras. */

	public static void main(String[] args) {

		String frase = "A dama admirou o rim da amada";
		frase = frase.toUpperCase().replace(" ","");
		for(int i = 0; i >= frase.length() - 1; i--) {
			System.out.print(frase.charAt(i)+ " ");
		}
		System.out.println();
		if(frase.equals(frase)) {
			System.out.println("� PAL�DROMO");

		}

	}

}
