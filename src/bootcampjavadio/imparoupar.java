package bootcampjavadio;

import java.util.Scanner;

public class imparoupar {
	public static void main(String[] args) {

		/* Digite a quantidade de vezes, e quantos numeros impar e par tiveram */

		Scanner scan = new Scanner(System.in);

		int qntVezez;
		int numDigitado = 0;
		int numOrdinal = 1;
		int qntNumImpar = 0, qntNumPar = 0;

		System.out.println("Quantas vezes quer digitar um n�mero?: ");
		qntVezez = scan.nextInt();

		int count = 1;

		while (count <= qntVezez) {

			System.out.println("Digite o " + numOrdinal + "� valor: ");
			numDigitado = scan.nextInt();

			if (numDigitado % 2 == 0) {
				qntNumPar++;
			} else {
				qntNumImpar++;
			}
			count++;
			numOrdinal++;

		}

		System.out.println("A quantidade de vezes escolhida foram: " + qntVezez + "\n Foram digitados " + qntNumImpar
				+ " N�mero �mpar(es).\n" + "Foram digitados " + qntNumPar + " N�meros Par(es)");
		
		scan.close();

	}

}
