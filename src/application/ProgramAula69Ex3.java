package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramAula69Ex3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		student.name = sc.nextLine();
		student.firstGrade = sc.nextDouble();
		student.secondGrade = sc.nextDouble();
		student.thirdGrade = sc.nextDouble();

		System.out.println();

		if (student.finalGrade() >= 60.00) {
			System.out.println(student + "PASS");
		}
		else {
			System.out.println(student + "FAILED" + student.missingPoints());
		}

		sc.close();

	}

}
