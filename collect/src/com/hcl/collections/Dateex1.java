package com.hcl.collections;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateex1 {
	public static void main(String[] args) {
		Date obj=new Date();
		System.out.println(obj);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(obj));
	}

}
