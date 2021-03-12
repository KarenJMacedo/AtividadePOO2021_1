
public class Atividade03 {
	
	/* Complete o codigo para imprimir:
	 * média aritmética dos números 8,9 e 7.
	 * média dos números 4, 5 e 6.
	 * soma das duas médias.
	 * média das médias. */

	public static void main(String[] args) {
		float media1 = (8+9+7)/3;
		float media2 = (4+5+6)/3;
		float mediaSoma = media1+media2;
		float media3 = (media1+media2)/2;

		System.out.println(media1);
		System.out.println(media2);
		System.out.println(mediaSoma);
		System.out.println(media3);
		
	}

}
