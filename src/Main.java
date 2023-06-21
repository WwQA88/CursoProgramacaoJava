import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		int y = 32;
//		double x = 10.35784;
//
//		String nome = "Maria";
//		int idade = 31;
//		double renda = 4000.0;
//		System.out.println(y);
//		System.out.println(x);
//		System.out.println("Bom dia!");
//		System.out.printf("%.2f%n", x);
//		System.out.printf("%.4f%n", x);
//		Locale.setDefault(Locale.US);
//		System.out.printf("%.4f%n", x);
//
//		System.out.println("RESULTADO = " + x + " METROS");
//
//		System.out.printf("RESULTADO = %.2f metros%n", x);
//
//		System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, renda);
//	
		
		//-------------------------------------------
		
		
//		String product1 = "Computer";
//		String product2 = "Office Desk";
//
//		byte age = 30;
//		int code = 5290;
//		char gender = 'F';
//
//		double price1 = 2100.0;
//		double price2 = 650.0;
//		double measure = 53.234567;
//
//		System.out.println("Products: ");
//		System.out.printf("%s, which price is $ %.2f %n", product1, price1);
//		System.out.printf("%s, which price is $ %.2f %n", product2, price2);
//
//		System.out.println();
//
//		System.out.printf("Record: %d years old, code %s and gender: %c %n", age, code, gender);
//		System.out.println();
//
//		System.out.printf("Measure with eight decimal places: %.8f %n", measure);
//		System.out.printf("Rouded (three decimal places): %.3f %n", measure);
//
//		Locale.setDefault(Locale.US);
//		System.out.printf("US decimal point: %.3f %n", measure);
		
		//-------------------------------------------------------
		
		//
//		 * 
//		 * String product1 = "Computer"; String product2 = "Office Desk";
//		 * 
//		 * int age = 30; int code = 5290; char gender = 'F';
//		 * 
//		 * double price1 = 2100.0; double price2 = 650.0; double measure = 53.234567;
//		 * 
//		 * 
//		 * System.out.printf("%s , which price is %.2f %n", product1, price1);
//		 * 
		
		//--------------------------------------------------
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas hora?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		}
		
		else {
			if(hora <= 18) {
				System.out.println("Boa tarde");
			}
			else {
				System.out.println("Boa noite");
			}
			
		}

		sc.close();
	}



}
