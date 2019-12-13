package com.hcl.collections;

import java.util.Comparator;

public class Cgpcomparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student e1=(Student)o1;
		Student e2=(Student)o2;
		if(e1.cgp >= e2.cgp) {
			return 1;
		}else {
			return -1;
			
		}
		}

}
