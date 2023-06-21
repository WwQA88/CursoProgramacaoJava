package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAula90VetorEx9 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();

		String[] vetorNome = new String[n];
		int[] vetorIdade = new int[n];

		for (int i = 0; i < n; i++) {

			System.out.printf("Dados da %da pessoa:\n", i + 1);
			sc.nextLine();
			System.out.print("Nome: ");
			vetorNome[i] = sc.nextLine();
			System.out.print("Idade: ");
			vetorIdade[i] = sc.nextInt();
		}

		int maisVelho = vetorIdade[0];
		String nome = vetorNome[0];

		for (int i = 0; i < n; i++) {

			if (vetorIdade[i] > maisVelho) {

				maisVelho = vetorIdade[i];
				nome = vetorNome[i];

			}

		}

		System.out.println("PESSOAS MAIS VELLHA " + nome);

		sc.close();

	}

}
