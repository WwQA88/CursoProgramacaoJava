import java.util.Scanner;

public class EstruturaRepetitiva_ExInicianteFor5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int fat = n * (n - 1);
		
		
		if(n==1 || n==0) {
			
			fat = 1;
		}

		for (int i = 2; i < n; i++) {

			fat = fat * (n - i);

		}

		System.out.println(fat);

		sc.close();

	}

}
