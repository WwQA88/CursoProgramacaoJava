package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Pessoas;

public class ProgramAula90VetorEx3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		Pessoas[] vectNome = new Pessoas[n];
		Pessoas[] vectIdade = new Pessoas[n];
		Pessoas[] vectAltura = new Pessoas[n];

		for (int i = 0; i < n; i++) {

			System.out.printf("Dados da %da pessoa:\n", i + 1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("ALtura: ");
			double altura = sc.nextDouble();

			vectNome[i] = new Pessoas(nome, idade, altura);
			vectIdade[i] = new Pessoas(nome, idade, altura);
			vectAltura[i] = new Pessoas(nome, idade, altura);

		}

		double somaAlt = 0.0;
		double medAlt = 0.0;
		int idadeMenores = 0;

		for (int i = 0; i < vectAltura.length; i++) {

			somaAlt += vectAltura[i].getAltura();

		}

		medAlt = somaAlt / n;
		System.out.printf("Altura Média %.2f: \n", medAlt);

		for (int i = 0; i < vectIdade.length; i++) {

			if (vectIdade[i].getIdade() < 16) {

				idadeMenores++;

			}

		}

		double percentMenores = (((double) idadeMenores / n) * 100.0);

		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentMenores);

		for (int i = 0; i < vectNome.length; i++) {

			if (vectIdade[i].getIdade() < 16) {

				System.out.println(vectNome[i].getNome());

			}
		}

		sc.close();

	}

}
