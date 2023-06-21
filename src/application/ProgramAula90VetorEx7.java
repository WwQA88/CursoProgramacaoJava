package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAula90VetorEx7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {

			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}

		double somaVetor = 0.0;

		for (int i = 0; i < vetor.length; i++) {

			somaVetor += vetor[i];
		}

		double media = somaVetor / n;

		System.out.println();
		System.out.println("MEDIA DO VETOR = " + media);

		double abaixoMed = vetor[0];

		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] < media) {
				abaixoMed = vetor[i];
				System.out.println(abaixoMed);

			}

		}

		sc.close();

	}

}
