package com.hcl.collections;

public class Employ {
	int sno;
	String name;
	double basic;
	public Employ(int sno, String name, double basic) {
		super();
		this.sno = sno;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [sno=" + sno + ", name=" + name + ", basic=" + basic + "]";
	}
	

}
