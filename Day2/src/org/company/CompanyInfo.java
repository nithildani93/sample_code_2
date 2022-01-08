package org.company;

public class CompanyInfo {
	private void companyName(String cname) {
		// TODO Auto-generated method stub
		System.out.println(cname);
	}
	private void companyName(String cname, int comcode) {
		// TODO Auto-generated method stub
		System.out.println("Company name is "+cname + "\n code is"+comcode);
	}
	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyName("Greens");
		c.companyName("Greens", 1001);
		
	}
}
