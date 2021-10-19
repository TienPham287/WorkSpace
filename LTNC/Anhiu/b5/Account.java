package b5;

import java.text.NumberFormat;
import java.util.Scanner;

import Baitap.Numberformat;

public class Account {
private long stk;
private String tenTK;
private double sotientrongTK;
Scanner sc = new Scanner(System.in);
public Account() {
	
}
public Account(long stk, String tenTK, double sotientrongTK, Scanner sc) {
	super();
	this.stk = stk;
	this.tenTK = tenTK;
	this.sotientrongTK = sotientrongTK;
	this.sc = sc;
}
public long getStk() {
	return stk;
}
public void setStk(long stk) {
	this.stk = stk;
}
public String getTenTK() {
	return tenTK;
}
public void setTenTK(String tenTK) {
	this.tenTK = tenTK;
}
public double getSotientrongTK() {
	return sotientrongTK;
}
public void setSotientrongTK(double sotientrongTK) {
	this.sotientrongTK = sotientrongTK;
}
public Scanner getSc() {
	return sc;
}
public void setSc(Scanner sc) {
	this.sc = sc;
}
@Override
public String toString() {
	NumberFormat curren =NumberFormat.getCurrencyInstance();
	String str1 = curren.format(sotientrongTK);
	return stk+ "_" +tenTK+"_"+str1;
}
public double naptien() {
	double nap;
	System.out.println("Nhập số tiền bạn cần nạp:");
	nap = sc.nextDouble();
	if (nap >= 0) {
		sotientrongTK = nap + sotientrongTK;
		NumberFormat curren =NumberFormat.getCurrencyInstance();
		String str1 = curren.format(nap);
		System.out.println("Bạn vừa nạp "+str1+"vào tài khoản");
	}else {
		System.out.println("Số tiền vừa nạp không hợp lệ !");
		
	}
	return nap;
	
	}
public double ruttien() {
	double phi = 5;
	double rut;
	System.out.println("Nhập số tiền bạn cần rút :");
	rut = sc.nextDouble();
	if (rut <= (sotientrongTK-phi)) {
		sotientrongTK = sotientrongTK-(rut+phi);
		NumberFormat curren =NumberFormat.getCurrencyInstance();
		String str1 = curren.format(rut);
		System.out.println("Bạn vừa rút"+str1+"từ tài khoản ,phí là 5$");
		
	}else {
		System.out.println("Số tiền rút không hợp lệ!");
		return ruttien();
	}
	return rut;
}
public double daohanB() {
	double laisuat = 0.035;
	sotientrongTK = sotientrongTK + sotientrongTK*laisuat;
	NumberFormat curren =NumberFormat.getCurrencyInstance();
	String str1 = curren.format(sotientrongTK);
	System.out.println("Bạn vừa được" + str1+"từ dáo hạn 1 tháng");
	return sotientrongTK;
}
 void inTK() {
	NumberFormat curren =NumberFormat.getCurrencyInstance();
	String str1 = curren.format(sotientrongTK);
	System.out.printf("%-10d %-20s %-20s \n", stk, tenTK, str1);
	
}

}
