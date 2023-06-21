package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAula90VetorEx4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int vect[] = new int[n];

		for (int i = 0; i < vect.length; i++) {

			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		System.out.println("\nNÚMEROS PARES: ");

		for (int i = 0; i < vect.length; i++) {

			if ((int) vect[i] % 2 == 0) {

				System.out.printf("%d ", vect[i]);

			}

		}

		int qtdePares = 0;

		for (int i = 0; i < vect.length; i++) {

			if ((int) vect[i] % 2 == 0) {

				qtdePares++;

			}
		}

		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n" , qtdePares);

		sc.close();

	}

}
