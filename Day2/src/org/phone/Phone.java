package org.phone;

public class Phone {
	private void phoneInfo(int num) {
		// TODO Auto-generated method stub
		System.out.println("Phone Number is "+num);
	}
	private void phoneInfo(String model) {
		// TODO Auto-generated method stub
		System.out.println("Phone Model is "+model);
	}
	private void phoneInfo(boolean Touch) {
		// TODO Auto-generated method stub
		if (Touch) {
			System.out.println("Phone has Touch Display");
		}else {
			System.out.println("Phone does not has Touch Display");
		}
	}
	public static void main(String[] args) {
		Phone p = new Phone();
		p.phoneInfo("Samsung");
		p.phoneInfo(989879162);
		p.phoneInfo(true);
	}
}
