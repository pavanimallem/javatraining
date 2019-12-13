package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sortemploy {
	public static void main(String[] args) {
		Comparator c=new BasicComparator();
		SortedSet s=new TreeSet(c);
		s.add(new Employ(1,"pavani",12345));
		s.add(new Employ(2,"suresh",12346));
		s.add(new Employ(3,"sai",12347));
		for (Object object : s) {
			Employ e=(Employ)object;
			System.out.println(e);
			
		}
	}

}
