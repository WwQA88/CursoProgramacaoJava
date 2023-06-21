package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAula90VetorEx910 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();

		String[] vetorNome = new String[n];
		double[] vetorNota1 = new double[n];
		double[] vetorNota2 = new double[n];
		double[] vetorSomaNotas = new double[n];
		double[] vetorMedia = new double[n];
		double[] vetorAprovados = new double[n];

		for (int i = 0; i < n; i++) {

			vetorNome[i] = sc.nextLine();
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i + 1);
			vetorNome[i] = sc.nextLine();
			vetorNota1[i] = sc.nextDouble();
			vetorNota2[i] = sc.nextDouble();

		}

		for (int i = 0; i < n; i++) {

			vetorSomaNotas[i] += vetorNota1[i] + vetorNota2[i];
			vetorMedia[i] = vetorSomaNotas[i] / 2.0;
			vetorAprovados[i] = vetorMedia[i];

		}

		System.out.println("Alunos aprovados: ");

		for (int i = 0; i < n; i++) {

			if (vetorAprovados[i] >= 6.0) {

				System.out.println(vetorNome[i]);
			}
		}

		sc.close();

	}

}
