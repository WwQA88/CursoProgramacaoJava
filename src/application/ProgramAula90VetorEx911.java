package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAula90VetorEx911 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		char[] vetorGenero = new char[n];
		double[] vetorAltura = new double[n];
		double[] vetorMenorAlt = new double[n];

		for (int i = 0; i < n; i++) {

			System.out.printf("Altura da %da pessoa: ", i + 1);
			vetorAltura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			vetorGenero[i] = sc.next().charAt(0);

		}

		double maiorAlt = vetorAltura[0];
		double menorAlt = vetorAltura[0];
		int somaMenor = 0;
		int numM = 0;
		double somaVetor = 0.0;

		for (int i = 0; i < n; i++) {

			if (vetorAltura[i] > maiorAlt) {

				maiorAlt = vetorAltura[i];

			} else if (vetorAltura[i] < menorAlt) {

				menorAlt = vetorAltura[i];

			}

		}

		for (int i = 0; i < n; i++) {

			if (vetorGenero[i] == 'F') {
				somaMenor++;

			} else if (vetorGenero[i] == 'M') {
				numM++;

			}
		}

		for (int i = 0; i < n; i++) {

			if (vetorMenorAlt[i] < vetorAltura[i] && vetorGenero[i] == 'F') {
				vetorMenorAlt[i] = vetorAltura[i];
				somaVetor += (double) vetorMenorAlt[i];

			}
		}

		double mediaM = (double) somaVetor / somaMenor;

		System.out.printf("Menor altura = %.2f\n" , menorAlt);
		System.out.printf("Maior altura = %.2f\n" , maiorAlt);
		System.out.printf("Media das alturas das mulheres = %.2f\n" , mediaM);
		System.out.print("Numero de homens = " + numM);

		sc.close();

	}

}
