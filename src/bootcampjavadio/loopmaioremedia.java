package bootcampjavadio;

import java.util.Scanner;

public class loopmaioremedia {

	public static void main(String[] args) {
		/*
		 * Crie um programa em loop que receba 5 numeros, e informe o maior n�mero e a
		 * m�dia dos 5
		 */

		Scanner scan = new Scanner(System.in);
		

		int numeroMaior = 0;
		int numeroDigitado = 0;
		int soma = 0;
		int i = 1;

		while(i<=5) {
		System.out.println("Digite um n�mero: ");
		numeroDigitado = scan.nextInt();
		soma += numeroDigitado;
		if(numeroDigitado>numeroMaior) numeroMaior = numeroDigitado;
		i++;
		}
		
		System.out.println("Numero maior: "+ numeroMaior);
		System.out.println("Soma: " + soma);
		System.out.println("M�dia: "+ (soma/5));

		scan.close();
	}

}
