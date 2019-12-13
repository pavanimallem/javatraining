package com.hcl.emp;

import java.util.Scanner;

public class SearchEmployMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employ no ");
		empno=sc.nextInt();
		EmployDAO dao=new EmployDAO();
		Employ employ=dao.searchEmploy(empno);
		if(employ!=null) {
			System.out.println("name "+employ.getName());
			System.out.println("Department "+employ.getDept());
			System.out.println("designation "+employ.getDesig());
		} else {
			System.out.println("record not found..");
		}
	}

}
