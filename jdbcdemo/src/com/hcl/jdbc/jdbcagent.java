package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcagent {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/sqlpractice",
						"root","root");
				System.out.println("Connected..");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from Agent");
				while(rs.next()) {
					System.out.println("AgentID " +rs.getInt("AgentID"));
					System.out.println("firstname " +rs.getString("Firstname"));
					System.out.println("MI " +rs.getString("MI"));
					System.out.println("lastname " +rs.getString("Lastname"));
					System.out.println("Gender " +rs.getString("Gender"));
					System.out.println("Address1 " +rs.getString("Address1"));
					System.out.println("--------------");
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
