package application;

import entities.Account_Aula156;
import entities.BusinessAccount_Aula156;
import entities.SavingsAccount_156;

public class ProgramAula158 {
	
	public static void main (String[] args) {
		
		Account_Aula156 acc1 = new Account_Aula156(1001, "Alex", 1000.00);
		acc1.withdraw(200.00);
		System.out.println(acc1.getBalance());
		
		Account_Aula156 acc2 = new SavingsAccount_156(1002, "Maria", 1000.00, 0.01);
		acc2.withdraw(200.00);
		System.out.println(acc2.getBalance());
		
		Account_Aula156 acc3 = new BusinessAccount_Aula156(1003, "Bob", 1000.00, 500.00);
		acc3.withdraw(200.00);
		System.out.println(acc3.getBalance());
	}

}
