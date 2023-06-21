import java.util.Locale;
import java.util.Scanner;

public class EstruturaDoWhileEx1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resp;

		do {

			System.out.print("Digite a temperatuta em Celsius: ");

			double c = sc.nextDouble();
			double f = 9.0 * c / 5.0 + 32;
			System.out.printf("Equivalente em Farenheit: %.1f%n", f);

			System.out.print("Deseja repetir (s/n)?: ");
			resp = sc.next().charAt(0);

		} while (resp != 'n');

		sc.close();

	}

}