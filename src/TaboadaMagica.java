import java.util.Scanner;

public class TaboadaMagica {

	public static void main(String[] args) {

		System.out.println("BEM VINDO(A) AO TABOADA MÁGICA");
		System.out.println();
		System.out.print("POR FAVOR, INFORME O SEU NOME: ");

		Scanner sc = new Scanner(System.in);

		String nome = sc.next();
		System.out.println();

		System.out.println("OLÁ " + nome);
		System.out.println();
		System.out.println("DIGITE UM NÚMERO QUALQUER E VEJA A TABOADA MÁGICA ACONTECER!");
		System.out.println();

		int n = sc.nextInt();
		int j = 10;

		for (int i = 1; i <= j; i++) {

			System.out.println(n + " X " + "" + i + " = " + i * n);

		}

		sc.close();
		System.out.println();

		System.out.println("OBRIGADO POR USAR A TABOADA MÁGICA!");

	}

}
