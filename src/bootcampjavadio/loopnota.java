package bootcampjavadio;

import java.util.Scanner;

public class loopnota {

	public static void main(String[] args) {
		
		/*Crie um loop com uma nota de 0 a 10, 
		 * se a nota for diferente repita at� ser de 0 a 10*/
		
		Scanner scan = new Scanner(System.in);
		
		
		float nota;
		System.out.println("Digite uma nota: \n");
		nota = scan.nextFloat();
		
		while (nota<0 || nota>10) {
			System.out.println("A nota tem que ser de 0 a 10, digite uma nota v�lida: ");
			nota = scan.nextFloat();
		}
		
		scan.close();
		
		System.out.println("Nota Cadastrada com sucesso!");
		

	}

}
