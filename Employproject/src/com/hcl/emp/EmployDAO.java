package com.hcl.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployDAO {
	Connection connection;
	PreparedStatement pst;
	public String deleteEmploy(int empno) {
		connection=DaoConnection.getConnection();
		Employ employ=searchEmploy(empno);
		String result="";
		if(employ!=null) {
			String cmd="delete from Employ where Empno=?";
			try {
				pst=connection.prepareStatement(cmd);
				pst.setInt(1, empno);
				pst.executeUpdate();
				result="record deleted..";
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			result="record not found..";
		}
		return result;
	}
	public Employ searchEmploy(int empno) {
		connection=DaoConnection.getConnection();
		String cmd="select * from Employ where Empno=?";
		Employ employ=null;
		try {
			pst=connection.prepareStatement(cmd);
			pst.setInt(1, empno);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				employ=new Employ();
				employ.setName(rs.getString("name"));
				employ.setDept(rs.getString("dept"));
				employ.setDesig(rs.getString("desig"));
				employ.setBasic(rs.getInt("basic"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employ;
	}
	public String addEmploy(Employ employ) {
		connection=DaoConnection.getConnection();
		String cmd="insert into employ(empno,name,dept,desig,basic) "
                  + " values(?,?,?,?,?) ";
		String result="";
		try {
			pst=connection.prepareStatement(cmd);
			pst.setInt(1, employ.getEmpno());
			pst.setString(2,employ.getName());
			pst.setString(3,employ.getDept());
			pst.setString(4,employ.getDesig());
			pst.setInt(5, employ.getBasic());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result=e.getMessage();
		}
		return result;
	}
	public int generateEmployno() {
		connection=DaoConnection.getConnection();
		String cmd="select case when max(empno) is null then 1 "
				+ " else max(empno)+1 end empno from employ";
		int empno=0;
		try {
			pst=connection.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			empno=rs.getInt("empno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empno;
	}
	public List<Employ> showEmploy() {
		connection=DaoConnection.getConnection();
		String cmd="select * from Employ";
		Employ employ=null;
		List<Employ>employList=new ArrayList<>();
		try {
			pst=connection.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				employ=new Employ();
				employ.setEmpno(rs.getInt("empno"));
				employ.setName(rs.getString("name"));
				employ.setDept(rs.getString("dept"));
				employ.setDesig(rs.getString("desig"));
				employ.setBasic(rs.getInt("basic"));
				employList.add(employ);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employList;

}
}

