package bai_3;

public class CertificateOfDeposit extends Accounts {
	double intersetRate;
	String maturity;

	public CertificateOfDeposit(int idName, String name, double currentBalance, double intersetRate, String maturity) {
		super(idName, name, currentBalance);
		this.intersetRate = intersetRate;
		this.maturity = maturity;
	}

	public double getIntersetRate() {
		return intersetRate;
	}

	public void setIntersetRate(double intersetRate) {
		this.intersetRate = intersetRate;
	}

	public String getMaturity() {
		return maturity;
	}

	public void setMaturity(String maturity) {
		this.maturity = maturity;
	}

	@Override
	public String toString() {
		return this.idName +"\t\t"+ this.name +"\t\t"+ this.currentBalance +"\t\t"+ this.intersetRate +"\t\t"+ this.maturity;
	}

}
