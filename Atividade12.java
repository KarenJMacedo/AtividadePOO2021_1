
public class Atividade12 {

	// C�digo para contar quantas vogais existem na frase.

		public static void main(String[] args) {

			int vogais = 0;
			String frase = "Java � Lindo";
			frase = frase.toUpperCase();
			for(int i = 0; i < frase.length(); i++) {
				if("AEIOU�".contains(frase.charAt(i)+"")) {
					vogais++;
				}
			}
			
			System.out.println(vogais);	

	}

}
