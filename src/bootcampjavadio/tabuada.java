package bootcampjavadio;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		int numeroInformado = 0;
		int multiplicador = 1;
		int i = 1;
		System.out.println("===========Seja bem vindo ao gerador de tabuada===============\n");
		System.out.println("Informe um número para gerar a tabuada: ");
		numeroInformado = scan.nextInt();
		System.out.println("Tabuada gerada com sucesso:\n\n O número informado foi: " + numeroInformado);
		
		while(i<=10) {
		System.out.println("---->"+numeroInformado+" x "+multiplicador+" = "+ numeroInformado*multiplicador);
		multiplicador++; i++;
		}
		
		scan.close();
		
		
		
	}
	
}
