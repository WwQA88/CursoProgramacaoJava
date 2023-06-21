import java.util.Scanner;

public class EstruturaSequencial_ExIniciante1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1;
		int n2;

		n1 = sc.nextInt();
		n2 = sc.nextInt();

		int resultado = n1 + n2;

		System.out.printf("SOMA = " + resultado);

		sc.close();

	}

}
