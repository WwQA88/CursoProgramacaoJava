import java.util.Scanner;

public class EstruturaRepetitivaEnquanto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int soma = 0;

		while (x != 0) {

			soma = soma + x;
			x = sc.nextInt();

		}

		System.out.println("VOCÊ DIGITOU A SOMA DE: " + soma);

		sc.close();

	}

}
