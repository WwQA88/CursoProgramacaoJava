package application;

import entities.Account_Aula156;
import entities.BusinessAccount_Aula156;
import entities.SavingsAccount_156;

public class Aula156 {

	public static void main(String[] args) {
		
		Account_Aula156 acc = new Account_Aula156(1001, "Alex", 0.0);
		BusinessAccount_Aula156 bacc = new BusinessAccount_Aula156(1002, "Maria", 0.0, 500.00);
		
		// UPCASTING - Converter objeto da subclass para a superclass
		
		Account_Aula156 acc1 = bacc;
		
		Account_Aula156 acc2 = new BusinessAccount_Aula156(1003, "Bob", 0.0, 200.00);
		
		Account_Aula156 acc3 = new SavingsAccount_156(1004, "Ana", 0.0, 0.01);
		
		// DOWNCASTING - Converter objeto da superclass para a subclass
		
		BusinessAccount_Aula156 acc4 = (BusinessAccount_Aula156) acc2;
		acc4.loan(1000.00);
		
		// BusinessAccount_Aula156 acc5 = (BusinessAccount_Aula156) acc3;
		// -- O casting nao e permitido nesse exemplo porque acc3 e variavel do tipo Account ao inves de SavingsAccount
		
		// Testes para verificar se o casting está correto ou é permitido
		
		if(acc3 instanceof BusinessAccount_Aula156) {
			BusinessAccount_Aula156 acc5 = (BusinessAccount_Aula156) acc3;
			acc5.loan(200.00);
			System.out.println("Loan!");
		}
		else {
			System.out.println("No Loan!");
		}
		
		if(acc3 instanceof SavingsAccount_156) {
			SavingsAccount_156 acc5 = (SavingsAccount_156) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}

	}

}
