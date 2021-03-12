
public class Atividade16 {

	/* Em uma competição o resultado foi dado em uma lista de nomes 
	 * ordenada pela posição que os atletas ficaram na corrida. */

	public static void main(String[] args) {

		String[] array =  {"ANA","JOAO","MARIA","PEDRO","EDUARDO","CAIO","JOSE"};
		int posicao = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i].equals("PEDRO")) {
				posicao = i + 1;
			}
		}
		System.out.println(posicao + "ª" + "posição");
		
	}

}
