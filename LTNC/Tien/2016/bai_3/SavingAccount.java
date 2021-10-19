package bai_3;

public class SavingAccount extends Accounts {
	double interestRate;

	public SavingAccount(int idName, String name, double currentBalance, double interestRate) {
		super(idName, name, currentBalance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return this.idName +"\t\t"+ this.name +"\t\t"+ this.currentBalance +"\t\t"+ this.interestRate;
	}

}
