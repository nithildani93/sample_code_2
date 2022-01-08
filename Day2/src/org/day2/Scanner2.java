package org.day2;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Studentid");
		int Studentid = sc.nextInt();
		System.out.println("studentName");
		String studentName = sc.next();
		System.out.println("Mark1");
		int Mark1 = sc.nextInt();
		System.out.println("Mark2");
		int Mark2 = sc.nextInt();
		System.out.println("Mark3");
		int Mark3 = sc.nextInt();
		System.out.println("Mark4");
		int Mark4 = sc.nextInt();
		System.out.println("Mark5");
		int Mark5 = sc.nextInt();
		int tot = Mark1+Mark2+Mark3+Mark4+Mark5;
		System.out.println("Total is "+ tot);
		System.out.println("Average is "+tot/5);
		
	}

}
