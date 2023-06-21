package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator_Static;

// Versao do programa com classe, com metodos estaticos (constantes)
//Nao ha necessidade de instanciar, sendo possivel utilizar sem a necessidade de qualquer objeto

public class ProgramAula70_v3 {

	public static final void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");

		double radius = sc.nextDouble();

		double c = Calculator_Static.circumference(radius);

		double v = Calculator_Static.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator_Static.PI);

		sc.close();

	}

}
