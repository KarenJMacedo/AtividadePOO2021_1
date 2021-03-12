
public class Atividade09 {

	/* Complete o codigo para imprimir a figura.
	 *  
	 *   * 
	 *   * *
	 *   * * * 
	 *   * * * * 
	 *   * * * * *
	 *   * * * * * * 
	 *   * * * * * * * 
	 *   * * * * * * * * 
	 *   * * * * * * * * * 
	 *   * * * * * * * * * *   */

	public static void main(String[] args) {

		for(int i = 0; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
