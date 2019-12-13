package com.hcl.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Scanfile {
	public static void main(String[] args) {
		try {
			FileInputStream fin=new 
					FileInputStream("C:/Users/DELL/Desktop/pavani/collect/src/com/hcl/collections/Employ.java");
			Scanner sc=new Scanner(fin);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
