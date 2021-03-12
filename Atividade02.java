
public class Atividade02 {
	
	/* Imprimir a quantidade e meses e dias de um numero de anos, que esta na variavel anos;
	 * Leve em consideração: 1 ano = 365 dias;
	 * Saida Esperada:
	 *  84 meses
	 *  2555 dias  */

	public static void main(String[] args) {
		int anos = 7;
		int meses = 12 * anos;
		int dias = 365 * anos;

		System.out.println(meses + " meses");
		System.out.println(dias + " dias");

	}

}
