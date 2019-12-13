package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedstudent {
	public static void main(String[] args) {
		Comparator c=new Cgpcomparator();
		SortedSet s=new TreeSet(c);
		s.add(new Student(1,"mallem","pavani",8.5));
		s.add(new Student(2,"sai","ram",9.5));
		s.add(new Student(1,"nagan","suri",7.5));
		for (Object object : s) {
			Student e= (Student)object;
			System.out.println(e);
			
		}
		
	}

}
