import java.util.Scanner;

public class EstruturaRepetitiva_ExInicianteFor4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			if (num2 == 0) {
				System.out.println("Divisão Impossível");
			}
			else {
				double resultado = (double) num1 / num2;
				System.out.printf("%.1f", resultado);
			}
		}

		sc.close();

	}

}
