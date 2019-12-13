package com.hcl.collections;

public class Student {
	int sno;
	String firstname;
	String lastname;
	double cgp;
	public Student(int sno, String firstname, String lastname, double cgp) {
		super();
		this.sno = sno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", firstname=" + firstname + ", lastname=" + lastname + ", cgp=" + cgp + "]";
	}
	
	

}
