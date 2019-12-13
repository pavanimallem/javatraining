package com.hcl.generics;

import java.util.ArrayList;
import java.util.List;

public class Genintex {
	public static void main(String[] args) {
		List<Integer> num=new ArrayList<Integer>();
		num.add(new Integer(56));
		num.add(new Integer(12));
		num.add(new Integer(67));
		num.add(new Integer(35));
		num.add(new Integer(31));
		int sum=0;
		for (Integer i : num) {
			sum+=i;
			
		}
		System.out.println("sum is " +sum);
		
	}

}
