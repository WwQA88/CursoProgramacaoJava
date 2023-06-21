package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;

	public double netSalary() {
		return grossSalary - tax;

	}

	public void increaseSalary(double percentage) {
		
		this.percentage = (grossSalary * percentage) / 100;

	}

	public String toString() {
		return name + ", " + "$ " + String.format("%.2f", netSalary() + percentage);

	}

}
