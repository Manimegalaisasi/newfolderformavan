package org.bank;

public class BankInfo  {
	public void saving() {
		System.out.println("saving amount:50000");
	}
	public void fixed() {
		System.out.println("fixed deposit is:50000");
	}
	public void deposit() {
		System.out.println("deposit amount:50000");
	}

public static void main(String[]args) {
	BankInfo b1=new BankInfo();
	b1.saving();
	b1.fixed();
	b1.deposit();
}
}
