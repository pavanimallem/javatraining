package com.hcl.emp;

import java.util.List;

public class CreateAccountMain {
	public static void main(String[] args) {
		EmployDAO dao=new EmployDAO();
		List<Employ> employList=dao.showEmploy();
		for (Employ employ : employList) {
			System.out.println("employno "+employ.getEmpno());
			System.out.println("employ name "+employ.getName());
			System.out.println("department "+employ.getDept());
			System.out.println("designation "+employ.getDesig());
			System.out.println("salary "+employ.getBasic());
			System.out.println("------------------------");
		}
	}

}
