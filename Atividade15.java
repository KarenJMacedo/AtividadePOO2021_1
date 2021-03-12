import java.util.*;

public class Atividade15 {

	// Complete o codigo para imprimit o array de numeros em ordem cresente.

	public static void main(String[] args) {

		int[] array = {2,8,1,7,4,3,5,9,6};
		Arrays.sort(array, 0, 9);
		for(int num  : array) {
			System.out.println(num + " ");
		}

	}

}
