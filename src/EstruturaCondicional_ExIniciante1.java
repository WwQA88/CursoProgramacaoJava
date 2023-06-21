import java.util.Scanner;

public class EstruturaCondicional_ExIniciante1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		
		System.out.print("Informe o número: ");		
		num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("POSITIVO");
		}
		
		sc.close();

	}

}
