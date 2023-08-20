package org.bank;

public class AxisBank extends BankInfo {
	long a=25000l;
	public void deposit( long a) {
		System.out.println("deposit amount:"+a);
	}


public static void main(String[]args) {
	AxisBank b1=new AxisBank();
	b1.saving();
	b1.fixed();
	b1.deposit(80000);
}
}
  
