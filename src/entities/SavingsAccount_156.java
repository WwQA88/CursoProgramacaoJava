package entities;

public final class SavingsAccount_156 extends Account_Aula156 {
	
	// Class com a palavra "final" evita que ela seja herdada, alem de tambem funcionar com metodos.
	
	private Double interestRate;
	
	public SavingsAccount_156(){
		super();
	}

	public SavingsAccount_156(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		
		balance += balance * interestRate;
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	
	

}
