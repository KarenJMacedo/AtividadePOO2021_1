
public class Atividade08 {

	// Imprimir a quantos numeros divisiveis por 3 ou 7 existem entre 1 e 200.

	public static void main(String[] args) {

		int quant = 0;
		for(int i = 1; i <= 200; i++) {
			if(i % 3 == 0 || i % 7 == 0) {
				quant = quant + 1;
			}
		}

		System.out.println(quant);
	
	}
}
