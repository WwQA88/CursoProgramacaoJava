package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductAula89;

public class ProgramAula89 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ProductAula89[] vect = new ProductAula89[n];

		for (int i = 0; i < vect.length; i++) { // trocada a variavel n por vect.length para ser mais coeso e deixar o eclipse gerenciar o tamanho do vetor

			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();

			vect[i] = new ProductAula89(name, price);
		}

		double sum = 0.0;

		for (int i = 0; i < vect.length; i++) { // trocada a variavel n por vect.length para ser mais coeso e deixar o eclipse gerenciar o tamanho do vetor

			sum += vect[i].getPrice();

		}

		double avg = sum / n;
		System.out.printf("AVERAGE PRICE: %.2f%n", avg);

		sc.close();

	}
}