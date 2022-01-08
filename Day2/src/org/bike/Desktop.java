package org.bike;

public class Desktop implements HardWare,Software {

	@Override
	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("softwareResources");
	}

	@Override
	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("hardwareResources");
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.hardwareResources();
		d.softwareResources();
	}

}
