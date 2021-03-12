
public class Atividade19 {

	/* Declare e inicialize uma lista de Alunos de uma turma com Nome e nota. 
	 * Imprima a lista de alunos e a media da turma. 
	 * Alunos: 
	 *  Jose com nota 6
	 *  Maria com nota 9
	 *  Pedro com nota 10
	 *  Caio com nota 5
	 * 
	 * Saida Esperada:
	 *  Nome: Jose Nota: 6
	 *  Nome: Maria Nota: 9
	 *  Nome: Pedro Nota: 10
	 *  Nome: Caio Nota: 5
	 *  Media da turma: 7.5 */
	
	public static void main(String[] args) {

		double media = 0;
		String[] alunos = new String[4];
		double[] notas = new double[4];
		alunos[0] = "Jose";
		alunos[1] = "Maria";
		alunos[2] = "Pedro";
		alunos[3] = "Caio";

		notas[0] = 6;
		notas[1] = 9;
		notas[2] = 10;
		notas[3] = 5;

		for(int i = 0; i < alunos.length; i++) {
			System.out.println("Nome: " + alunos[i] + " Nota: " + notas[i]); 
			media = media + notas[i];
		}
		media = media/alunos.length;
		System.out.println("Média da turma: " + media);

	}

}
