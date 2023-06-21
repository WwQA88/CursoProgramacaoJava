package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;



public class ProgramAula72_Ex1 {

	public static final void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double quotePrice = sc.nextDouble();


		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f " , CurrencyConverter.iof(quotePrice, amount));

		sc.close();

	}

}
