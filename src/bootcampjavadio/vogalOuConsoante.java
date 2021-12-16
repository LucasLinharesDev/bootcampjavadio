/*Crie um programa que leia do teclado 6 letras,
Mostre na tela somente as consoantes,
depois mostre quantas consoantes foram digitadas.*/

package bootcampjavadio;

import java.util.Scanner;

public class vogalOuConsoante {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String[] consoantes = new String[6]; // objeto vetor de String com 6 posições.
		int qntdConsoantes = 0;
		int contador = 0;

		while (contador < consoantes.length) {
			System.out.println("Digite uma letra: ");
			String letraDigitada = teclado.next();

			if (!(letraDigitada.equalsIgnoreCase("a") || letraDigitada.equalsIgnoreCase("e")
					|| letraDigitada.equalsIgnoreCase("i") || letraDigitada.equalsIgnoreCase("o")
					|| letraDigitada.equalsIgnoreCase("u"))) {
				consoantes[contador] = letraDigitada;
				qntdConsoantes++;
			}

			contador++;
		}

		for (String cadaConsoante : consoantes) {
			if (cadaConsoante != null) {
				System.out.println(cadaConsoante);
			}
		}

		System.out.println("Número de consoantes digitadas: " + qntdConsoantes);
		teclado.close();

	}

}