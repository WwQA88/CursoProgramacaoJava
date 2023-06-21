import java.util.Scanner;

public class EstruturaSequencial_ExIniciante2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double pi = 3.14159;
		double raio = sc.nextDouble();

		double area = pi * raio * raio;

		System.out.printf("ÁREA = %.4f%n", area);

		sc.close();

	}

}
