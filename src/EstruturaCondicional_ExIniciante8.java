import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional_ExIniciante8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sal;
		double imposto;
		
		sal = sc.nextDouble();

		if(sal <= 2000.00) {
			
			imposto = 0.00;
			System.out.println("Isento de imposto");
		}
		else if(sal <= 3000.00) {
			
			imposto = (sal - 2000.00) * 0.08;
			System.out.printf("Imposto de 8 por cento R$ %.2f%n", imposto);			
		}
		else if(sal <=4500.00) {
			imposto = (sal - 3000.00) * 0.18 + 1000.00 * 0.08;
			System.out.printf("Imposto de 18 por cento R$ %.2f%n", imposto);	
		}

		else {
			imposto = (sal - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
			System.out.printf("Imposto de 28 por cento R$ %.2f%n" , imposto);

		sc.close();

	}
		
	}
	
}
