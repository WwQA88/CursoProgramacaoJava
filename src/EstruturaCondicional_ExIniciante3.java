import java.util.Scanner;

public class EstruturaCondicional_ExIniciante3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;
		int b;


		a = sc.nextInt();
		b = sc.nextInt();


		if (a % b == 0 || b % a == 0) {
			System.out.println("São Múltiplos");
		}
		else {
			System.out.println("Não são Múltiplos");
		}

		sc.close();
	}

}
