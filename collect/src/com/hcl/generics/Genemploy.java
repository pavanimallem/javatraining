package com.hcl.generics;

import java.util.ArrayList;
import java.util.List;

public class Genemploy {
	public static void main(String[] args) {
		List<Employ> employ = new ArrayList<Employ> ();
		employ.add(new Employ(1,"pavani", 1234));
		employ.add(new Employ(2,"mallem", 4567));
		employ.add(new Employ(3,"suresh", 7891));
		employ.add(new Employ(4,"nagan", 2345));
		employ.add(new Employ(5,"sai", 6789));
		for (Employ emp : employ) {
			System.out.println(emp);
			
		}
	}

}
