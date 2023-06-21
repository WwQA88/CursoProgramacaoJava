package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class AccountMovementing {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double depositValue = 0;
		double withdrawValue = 0;

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine(); // Limpar o buffer de leitura da quebra de linha anterior.
		String accountHolder = sc.nextLine();
		

		System.out.print("Is there any initial deposit (y/n)? ");
		char depositConfirmation = sc.next().charAt(0);
		
		Account account = new Account(accountNumber, accountHolder, depositValue, withdrawValue);

		if (depositConfirmation == 'y') {

			System.out.print("Enter initial deposit value: ");
			account.setDeposit(sc.nextDouble());
			account.addCurrentBalance();

			System.out.println();
			System.out.println("Account data: ");
			System.out.printf("Account "
			+ account.getAccountNumber()
			+ ","
			+ " Holder: "
			+ account.getAccountHolder()
			+ ","
			+ " Balance: $ %.2f"
			, account.getCurrentBalance());

		} else {

			System.out.println();
			System.out.println("Account data: ");
			System.out.printf("Account "
			+ account.getAccountNumber()
			+ ","
			+ " Holder: "
			+ account.getAccountHolder()
			+ ","
			+ " Balance: $ %.2f"
			, account.getCurrentBalance());

		}

		System.out.println();
		System.out.print("Enter a deposit value: ");
		account.setDeposit(sc.nextDouble());
		account.addCurrentBalance();
		System.out.println("Updated account data: ");
		System.out.printf("Account "
		+ account.getAccountNumber()
		+ ","
		+ " Holder: "
		+ account.getAccountHolder()
		+ ","
		+ " Balance: $ %.2f"
		, account.getCurrentBalance());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		account.setWithdrawValue(sc.nextDouble());
		account.removeCurrentBalance();
		System.out.println("Updated account data: ");
		System.out.printf("Account "
		+ account.getAccountNumber()
		+ ","
		+ " Holder: "
		+ account.getAccountHolder()
		+ ","
		+ " Balance: $ %.2f"
		, account.getCurrentBalance());

		sc.close();

	}

}
