package com.hcl.lms;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class LmsDAO {
	Connection connection;
	PreparedStatement pst;
	public  searchLms(String empName) {
		Lms lms=null;
		String cmd="select * from lms where empName=?";
		connection=DaoConnection.getConnection();
		pst=connection.prepareStatement(cmd);
		
	}

}
