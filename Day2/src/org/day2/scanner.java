package org.day2;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter empid");
	int empid = sc.nextInt();
	System.out.println("empName");
	String empName = sc.next();
	System.out.println("empEmail");
	String empEmail = sc.next();
	System.out.println("empPhoneno");
	long empPhoneno = sc.nextLong();
	System.out.println("empSalary");
	float empSalary = sc.nextFloat();
	System.out.println("empGender");
	String empGender = sc.next();
	System.out.println("empCity");
	String empCity = sc.next();
	System.out.println(empid+"\n"+
			 empName+"\n"+
			 empEmail+"\n"+
			 empPhoneno+"\n"+
			 empSalary+"\n"+
			 empGender+"\n"+
			 empCity);
}
}
