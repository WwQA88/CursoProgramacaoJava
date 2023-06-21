import java.util.Scanner;

public class EntradaDeDadosPtI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		// para entrada de letras
//		String x;
//		x = sc.next();
//		
//		System.out.println("Você digitou: " + x);
//		
//		//-------------
//		
//		// para entrada de números inteiros
//		int y;
//		y = sc.nextInt();
//		
//		System.out.println("Você digitou: " + y);
//		
//		
//		//-------------
//		
//		// para entrada de números com pontos flutuante
//		double z;
//		z = sc.nextDouble();
//		
//		System.out.println("Você digitou: " + z);
//		System.out.printf("Você digitou: %.2f%n", z); // Casas decimais com vírgula
//		
//		//-------------
//		
//		// para entrada de caracteres
//		char c;
//		c = sc.next().charAt(0); // Pega a primeira letra da palavra digitada
//		
//		System.out.println("Você digitou: " + c);
		
		//-------------
		
		// para entrada de vários dados na mesma linha
		
		String d;
		int e;
		double f;
		
		d = sc.next();
		e = sc.nextInt();
		f = sc.nextDouble();
		
		System.out.println("Dados digitados:");
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

		
		
		sc.close();

	}

}
