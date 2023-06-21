package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAula90VetorEx2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos Números você vai digitar? ");

		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {

			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();

		}

		System.out.println();

		double sum = 0.0;
		double med = 0.0;

		for (int i = 0; i < n; i++) {

			sum += vect[i];

		}

		med = sum / n;

		System.out.print("VALORES = ");

		for (int i = 0; i < n; i++) {

			System.out.printf("%.1f ", vect[i]);

		}

		System.out.printf("\nSOMA = %.2f\n", sum);
		System.out.printf("MEDIA = %.2f\n", med);

		sc.close();

	}

}
