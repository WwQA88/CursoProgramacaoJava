package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee_Aula99;

public class ProgramAula99Ex1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee_Aula99> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Employee #" + (i + 1));

			System.out.print("Id: ");
			int id = sc.nextInt();

			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}

			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			list.add(new Employee_Aula99(id, name, salary));

			// outra maneira

			// Employee_Aula99 emp = new Employee_Aula99(id, name, salary);
			// list.add(emp)

			System.out.println();

		}

		System.out.print("Enter the id that will have the salary increase: ");
		int id = sc.nextInt();
		Employee_Aula99 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("Id not found");
			System.out.println();

		} else {

			System.out.print("Enter the percentage: ");
			emp.increseSalary(sc.nextDouble(), emp.getSalary());
			System.out.println();
		}

		System.out.println("List of employees:");
		for (Employee_Aula99 employeeList : list) {
			System.out.println(employeeList);
		}

		sc.close();

	}

	public static boolean hasId(List<Employee_Aula99> list, int id) {
		Employee_Aula99 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		return emp != null;

	}
}
