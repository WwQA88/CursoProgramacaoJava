import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional_ExIniciante6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double val;
		
		val = sc.nextDouble();
		
		if(val > 25.00 && val <= 50.00) {
		
			System.out.println("Intervalo (25,50]");
		}
		else if(val >= 0.00 && val <= 25.00) {
			
			System.out.println("Intervalo [0,25]");
		}
		else if(val >= 50.01 && val <= 100.00) {
			
			System.out.println("Intervalo (75,100]");
		}
		else		
		{			
			System.out.println("Fora de intervalo");
			
		}
		

		sc.close();

	}
}
