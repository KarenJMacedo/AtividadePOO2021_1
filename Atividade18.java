
public class Atividade18 {

	/* Com base no array multidimensional que representa um jogo da velha e 
	 * imprima o resultado de acordo com a saida:
	 * 
	 *  X X O
	 *  O X O
	 *  X O X  */

	public static void main(String[] args) {

		String[][] array =  new String[3][];
		array[0] = new String[]{"X","X","O"};
		array[1] = new String[]{"O","X","O"};
		array[2] = new String[]{"X","O","X"};
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++){
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}