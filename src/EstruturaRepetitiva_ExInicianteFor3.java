

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitiva_ExInicianteFor3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double p2 = 2.0;
		double p3 = 3.0;
		double p5 = 5.0;

		double n1 = 0;
		double n2 = 0;
		double n3 = 0;

		for (int i = 0; i < n; i++) {

			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();

			double media = (n1 * p2 + n2 * p3 + n3 * p5) / 10;
			System.out.printf("%.1f MÉDIA%n" , media);

		}


		sc.close();

	}

}
