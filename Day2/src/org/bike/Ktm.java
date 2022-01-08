package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
		// TODO Auto-generated method stub
		System.out.println("cost method");
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("speed method");
	}
	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.cost();
		k.speed();
	}
	
}
