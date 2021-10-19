package bai_3;

public class CheckingAccount extends Accounts {
	double minimumBalance;
	double interestRate;

	public CheckingAccount(int idName, String name, double currentBalance, double minimumBalance) {
		super(idName, name, currentBalance);
		this.minimumBalance = minimumBalance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}


	@Override
	public String toString()  {
		return this.idName +"\t\t"+ this.name +"\t\t"+ this.currentBalance +"\t\t"+ this.minimumBalance ;
	}

}
