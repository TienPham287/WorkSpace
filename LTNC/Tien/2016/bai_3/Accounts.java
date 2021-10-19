package bai_3;

public abstract class Accounts {
	int idName;
	String name;
	double currentBalance;

	public Accounts(int idName, String name, double currentBalance) {
		super();
		this.idName = idName;
		this.name = name;
		this.currentBalance = currentBalance;
	}

	public int getIdName() {
		return idName;
	}

	public void setIdName(int idName) {
		this.idName = idName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

}
