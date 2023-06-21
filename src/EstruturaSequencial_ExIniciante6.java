import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial_ExIniciante6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double TRIANGULO = A * C / 2.0;
		double CIRCULO = pi * C * C;
		double TRAPEZIO = (A + B) / 2.0 * C ;
		double QUADRADO = B * B ;
		double RETANGULO = A * B ;
		
		System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
		System.out.printf("CIRCULO: %.3f%n", CIRCULO);
		System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
		System.out.printf("QUADRADO: %.3f%n", QUADRADO);
		System.out.printf("RETANGULO: %.3f%n", RETANGULO);


		sc.close();

	}

}
