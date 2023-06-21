import java.util.Scanner;

public class EstruturaSequencial_ExInicianteVideoResolvido {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double comp;
		double larg;
		double mtQuad;

		comp = sc.nextDouble();
		larg = sc.nextDouble();
		mtQuad = sc.nextDouble();

		double area = comp * larg;
		double preco = area * mtQuad;

		System.out.printf("ÁREA = %.2f %n", area);
		System.out.printf("PREÇO = %.2f %n", preco);

		sc.close();

	}

}
