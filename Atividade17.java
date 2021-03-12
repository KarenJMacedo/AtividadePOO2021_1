
public class Atividade17 {

	/* Com base no array que representa um jogo da velha e imprima o 
	 * resultado de acordo com a saida:
	 * 
	 *   X X O
	 *   O X O
	 *   X O X   
	 */

	public static void main(String[] args) {

		String[] array =  {"X","X","O","O","X","O","X","O","X"};
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			if((i + 1) % 3 == 0) {
				System.out.println();
			}

		}

	}

}
