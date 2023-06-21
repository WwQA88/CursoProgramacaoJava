import java.util.Scanner;

public class EntradaDeDadosPtI2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		String s1, s2, s3;
//		
//		// Ler o texto até a quebra de linha
//		
//		s1 = sc.nextLine();
//		s2 = sc.nextLine();
//		s3 = sc.nextLine();
//		
//		System.out.println("DADOS DIGITADOS:");
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		
		
		//----------------------------------
		
//		int x;
//		String s1, s2, s3;
//		
//		// Quebra de linha pendente (problema)
//		
//		x = sc.nextInt();
//		s1 = sc.nextLine();
//		s2 = sc.nextLine();
//		s3 = sc.nextLine();
//		
//		System.out.println("DADOS DIGITADOS:");
//		System.out.println(x);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		
		int x;
		String s1, s2, s3;
		
		// Quebra de linha pendente (solução)
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);


		sc.close();

	}

}
