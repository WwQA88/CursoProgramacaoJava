import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial_ExIniciante5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		String codPeca1 = sc.next();
		int qtdePeca1 = sc.nextInt();
		double valUnitPeca1 = sc.nextDouble();

		String codPeca2 = sc.next();
		int qtdePeca2 = sc.nextInt();
		double valUnitPeca2 = sc.nextDouble();

		double totPecas = qtdePeca1 * valUnitPeca1 + qtdePeca2 * valUnitPeca2;

		System.out.printf("VALOR A PAGAR PELAS PECAS " + codPeca1 + " E " + codPeca2 + " É: R$ " + totPecas);

		sc.close();

	}

}
