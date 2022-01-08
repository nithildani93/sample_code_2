package org.emp;

public class Employee {
	private void empId(int eid) {
		// TODO Auto-generated method stub
		System.out.println(eid);
	}
	private void empId(String eid) {
		// TODO Auto-generated method stub
		System.out.println(eid);
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId(10012);
		e.empId("MID001");
	}
}
