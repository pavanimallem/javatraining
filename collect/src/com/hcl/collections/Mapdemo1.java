package com.hcl.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Mapdemo1 {
	public static void main(String[] args) {
		Map<String, Double> m=new Hashtable<String,Double>();
		m.put("pavani", 1234.44);
		m.put("suresh", 1234.55);
		m.put("sai", 4567.77);
		m.put("jyothi", 7689.77);
		String key;
		double sal;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter key ");
		key=sc.nextLine();
		sal=m.getOrDefault(key, 0.0);
		System.out.println("Salary is " + sal);
		}

}
