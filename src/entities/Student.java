	package entities;

public class Student {

	public String name;
	public double firstGrade;
	public double secondGrade;
	public double thirdGrade;
	public double goal;

	public double finalGrade() {

		return firstGrade + secondGrade + thirdGrade;
	}

	public String missingPoints() {

		goal = 60.00;

		return " MISSING " + String.format("%.2f ", goal - finalGrade()) + "POINTS";
	}

	public String toString() {

		return "FINAL GRADE = " + String.format("%.2f ", finalGrade());
	}

}
