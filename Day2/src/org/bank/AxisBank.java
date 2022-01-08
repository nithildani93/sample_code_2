package org.bank;

public class AxisBank extends BankInfo {
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("deposit in AxisBank");
	}
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.fixed();
		a.saving();
		a.deposit();
	}
}
