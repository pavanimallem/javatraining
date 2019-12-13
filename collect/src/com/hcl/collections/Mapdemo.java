package com.hcl.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapdemo {
	public static void main(String[] args) {
		Map names=new HashMap();
		names.put("1", "pavani");
		names.put("2", "suresh");
		names.put("3", "sai");
		names.put("4", "mom");
		names.put("5", "jyothi");
		String key,value;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter key ");
		key=sc.nextLine();
		value=(String)names.getOrDefault(key, "not found");
		System.out.println(value);
	}

	
}
