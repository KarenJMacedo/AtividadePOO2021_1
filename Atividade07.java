
public class Atividade07 {

	// Imprimir a soma dos numeros pares de 1 a 15.

	public static void main(String[] args) {

		int numerPar = 0;
		for(int numer = 1; numer <= 15;numer++) {
			if(numer % 2 == 0) {
				numerPar = numerPar + numer;
			}
		}
		System.out.println(numerPar);

	}

}
