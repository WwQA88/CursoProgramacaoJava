import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial_ExIniciante4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int numFunc = sc.nextInt();
		double qtdeHoraFunc = sc.nextDouble();
		double valHoraFunc = sc.nextDouble();

		double salFunc = qtdeHoraFunc * valHoraFunc;

		System.out.println("NUMBER = " + numFunc);
		System.out.printf("SALARY = U$ %.2f%n", salFunc);

		sc.close();

	}

}
