import java.util.Scanner;

public class EstruturaWhileEx3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("INFORME UM NÚMERO DE 1 A 4 PARA CADA TIPO DE COMBUSTÍVEL;"
				+ "SENDO QUE: ALCOOL: 1, GASOLINA: 2, DIESEL: 3 E 4 PARA ENCERRAR!");

		int x = sc.nextInt();
		int comb1 = 0;
		int comb2 = 0;
		int comb3 = 0;

		if (x == 4) {
			System.out.println("MUITO OBRIGADO");
			System.out.println("Alcool: " + comb1);
			System.out.println("Gasolina: " + comb2);
			System.out.println("Diesel: " + comb3);

		}

		else {

			while (x <= 0 || x >= 5) {

				System.out.println("FORA DA FAIXA DE 1 A 5");
				x = sc.nextInt();

			}

			while (x <= 3 || x > 4) {

				if (x == 1) {
					comb1 = comb1 + 1;
					x = sc.nextInt();
				} else if (x == 2) {
					comb2 = comb2 + 1;
					x = sc.nextInt();
				} else if (x == 3) {
					comb3 = comb3 + 1;
					x = sc.nextInt();
				} else if (x <= 0 || x >= 5) {
					System.out.println("FORA DA FAIXA DE 1 A 5");
					x = sc.nextInt();
				} else {

				}

			}

			if (x == 4) {
				System.out.println("MUITO OBRIGADO");
				System.out.println("Alcool: " + comb1);
				System.out.println("Gasolina: " + comb2);
				System.out.println("Diesel: " + comb3);

			}

		}

		sc.close();
	}

}
