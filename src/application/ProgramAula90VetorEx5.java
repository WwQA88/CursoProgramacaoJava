package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAula90VetorEx5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {

			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}

		double maior = vetor[0];
		int posicao = 0;

		for (int i = 1; i < vetor.length; i++) {

			if (vetor[i] > maior) {

				maior = vetor[i];
				posicao = i;
			}
		}

		System.out.printf("MAIOR VALOR  = %.1f\n", maior);
		System.out.print("POSICAO DO MAIOR VALOR = " + posicao);

		sc.close();

	}

}
