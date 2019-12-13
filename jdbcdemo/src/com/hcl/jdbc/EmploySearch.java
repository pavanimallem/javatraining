package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class EmploySearch {
	public static void main(String[] args) {
		int empno;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Employ no ");
		empno=sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/sqlpractice",
						"root","root");
				String cmd="select * from Employ Where Empno=?";
				PreparedStatement pst=con.prepareStatement(cmd);
				pst.setInt(1, empno);
				ResultSet rs=pst.executeQuery();
				if(rs.next()) {
					System.out.println("Name " +rs.getString("name"));
					System.out.println("Department "+rs.getString("dept"));
					System.out.println("Designation " +rs.getString("desig"));
					System.out.println("Salary " +rs.getInt("basic"));
				} else {
					System.out.println("record not found..");
				}
					
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
