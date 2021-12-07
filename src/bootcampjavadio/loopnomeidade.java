package bootcampjavadio;
import java.util.Scanner; // importa a classe Scanner

public class loopnomeidade {
	
	
	/*Crie um programa em loop que leia o nome e a idade,
	 *  se a idade for 0 finalize o programa*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int idade=1;
		
		while (idade!=0){
			System.out.println("Digite seu nome: ");
			nome = scan.next();
			nome += scan.nextLine();
			System.out.println("Digite sua idade: ");
			idade=scan.nextInt();
			
			System.out.println("Seu nome é: "+nome);
			System.out.println("Sua idade é: "+idade+"\n\n\n");
			
			
			if(idade==0) {
				System.out.println("Idade 0 não é permitida, fim do programa.");
			}
			
			scan.close();
		}
		
		
		
		

	}

}
