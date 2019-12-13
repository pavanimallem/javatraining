package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AgentSearch {
	public static void main(String[] args) {
		int agentID;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Agent ID ");
		agentID=sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/sqlpractice",
						"root","root");
				String cmd="select * from Agent Where AgentID=?";
				PreparedStatement pst=con.prepareStatement(cmd);
				pst.setInt(1, agentID);
				ResultSet rs=pst.executeQuery();
				if(rs.next()) {
					System.out.println("firstname " +rs.getString("Firstname"));
					System.out.println("MI " +rs.getString("MI"));
					System.out.println("lastname " +rs.getString("Lastname"));
					System.out.println("Gender " +rs.getString("Gender"));
					System.out.println("Address1 " +rs.getString("Address1"));
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
