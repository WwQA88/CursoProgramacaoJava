package entities;

public class BusinessAccount_Aula156 extends Account_Aula156 {
	
	private Double loanLimit;
	
	public BusinessAccount_Aula156() {
		super();
	}

	public BusinessAccount_Aula156(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance =+ amount - 10.00;	
		}
		
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
	
	
	

}
