package entities;

public class Account {

	private int accountNumber;
	private String accountHolder;
	private double depositValue;
	private double withdrawValue;
	private double balance;

	public Account(int accountNumber, String accountHolder, double depositValue, double withdrawValue) {

		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.depositValue = depositValue;
		this.withdrawValue = withdrawValue;

	}

	public int getAccountNumber() {

		return accountNumber;
	}

	public String getAccountHolder() {

		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {

		this.accountHolder = accountHolder;
	}

	public void setDeposit(double depositValue) {

		this.depositValue = depositValue;
	}

	public void setWithdrawValue(double withdrawValue) {

		this.withdrawValue = withdrawValue;
	}

	public double addCurrentBalance() {

		return balance = balance + depositValue;
	}

	public double removeCurrentBalance() {

		return balance = balance - withdrawValue - 5.00;
	}

	public double getCurrentBalance() {

		return balance;
	}

}
