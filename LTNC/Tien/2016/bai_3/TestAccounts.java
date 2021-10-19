package bai_3;

import java.util.ArrayList;

import bai3.main;

public class TestAccounts {
	ArrayList<Accounts> listAccounts = new ArrayList<Accounts>();

	public TestAccounts() {
		// TODO Auto-generated constructor stub
		create();
	}

	public void create() {
		listAccounts.add(new CheckingAccount(3555, "Pham Thuy Tien",  50000, 3.5));
		listAccounts.add(new CertificateOfDeposit(2877, "Pham Thuy Tien", 1000000, 5.5, "5/5/2021"));
		listAccounts.add(new SavingAccount(8533, "Pham Thuy Tien", 1000000, 3.3));
		listAccounts.add(new CheckingAccount(3555, "Pham Thuy Tien",  50000, 3.5));
		listAccounts.add(new CertificateOfDeposit(2877, "Pham Thuy Tien", 1000000, 5.5, "5/5/2021"));
		listAccounts.add(new SavingAccount(8533, "Pham Thuy Tien", 1000000, 3.3));
		listAccounts.add(new CheckingAccount(3555, "Pham Thuy Tien", 50000, 3.5));
		listAccounts.add(new CertificateOfDeposit(2877, "Pham Thuy Tien", 1000000, 5.5, "5/5/2021"));
		listAccounts.add(new SavingAccount(8533, "Pham Thuy Tien", 1000000, 3.3));
		listAccounts.add(new CheckingAccount(3555, "Pham Thuy Tien", 50000, 3.5));
		listAccounts.add(new CertificateOfDeposit(2877, "Pham Thuy Tien", 1000000, 5.5, "5/5/2021"));
		listAccounts.add(new SavingAccount(8533, "Pham Thuy Tien", 1000000, 3.3));
		listAccounts.add(new CheckingAccount(3555, "Pham Thuy Tien", 50000, 3.5));
		listAccounts.add(new CertificateOfDeposit(2877, "Pham Thuy Tien", 1000000, 5.5, "5/5/2021"));
		listAccounts.add(new SavingAccount(8533, "Pham Thuy Tien", 1000000, 3.3));

	}

	public void prin() {
		for (Accounts accounts : listAccounts) {
			System.out.println(accounts);
		}
	}

	public static void main(String[] args) {
		TestAccounts testAccounts = new TestAccounts();
		testAccounts.prin();
	}
}
