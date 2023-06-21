package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramAula69Ex2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		employee.name = sc.nextLine();
		employee.grossSalary = sc.nextDouble();
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee);		
		System.out.println();
		
		System.out.println("Which percentage to increase salary? ");
		System.out.println();
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.print("Updated data: " + employee);


		sc.close();

	}

}
