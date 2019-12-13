package com.hcl.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {
	Connection connection;
	PreparedStatement pst;
	
	public String WithdrawAccount(int accountNo,
			                       int withdrawAmount) {
		connection=DaoConnection.getConnection();
		String result="";
		Account account=searchAccount(accountNo);
		if(account!=null) {
			int amount=account.getAmount();
			if(amount-withdrawAmount >=1000) {
				String cmd="Update Accounts set Amount=Amount-? "
						+ " where AccountNo=?";
				try {
					pst=connection.prepareStatement(cmd);
					pst.setInt(1, withdrawAmount);
					pst.setInt(2, accountNo);
					pst.executeUpdate();
					cmd="Insert into Trans(AccountNo,TransAmount,"
							+ "TransType) values(?,?,?)";
					pst=connection.prepareStatement(cmd);
					pst.setInt(1,  accountNo);
					pst.setInt(2, withdrawAmount);
					pst.setString(3, "D");
					pst.executeUpdate();
					result="amount debited..";
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} else {
				result="insufficient funds..";
			}
		} else {
			result="accountno not found..";
		}
		return result;
	}
	public String depositAccount(int accountNo,
			int depositAmount) {
		connection=DaoConnection.getConnection();
		String result="";
		String cmd=" Update Accounts set Amount=amount+? "
				+ " where AccountNo=?";
		try {
			pst=connection.prepareStatement(cmd);
			pst.setInt(1, depositAmount);
			pst.setInt(2, accountNo);
			pst.executeUpdate();
			cmd=" Insert into Trans(AccountNo, TransAmount,"
					+ " TransType) values(?,?,?)";
			pst=connection.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.setInt(2, depositAmount);
			pst.setString(3, "C");
			pst.executeUpdate();
			result="amount credited..";			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	public String closeAccount(int accountNo) {
		connection=DaoConnection.getConnection();
		String result="";
		String cmd="update Accounts set Status='inactive' "
				+ " where accountno=?";
		try {
			pst=connection.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.executeUpdate();
			result="Account closed..";
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	public String updateAccount(int accountNo, String city,
			String state) {
		connection=DaoConnection.getConnection();
		String result="";
		String cmd="update Accounts set city=?, state=? "
				+ " where AccountNo=?";
		try {
			pst=connection.prepareStatement(cmd);
			pst.setString(1, city);
			pst.setString(2,state);
			pst.setInt(3, accountNo);
			pst.executeUpdate();
			result="account Updated..";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public Account searchAccount(int accountNo) {
		Account account=null;
		String cmd="select * from Accounts where AccountNo=?";
		connection=DaoConnection.getConnection();
		try {
			pst=connection.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				account=new Account();
				account.setFirstName(rs.getString("firstname"));
				account.setLastName(rs.getString("lastname"));
				account.setCity(rs.getString("city"));
				account.setState(rs.getString("state"));
				account.setAmount(rs.getInt("amount"));
				account.setCheqFacil(rs.getString("cheqfacil"));
				account.setAccountType(rs.getString("accounttype"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return account;
	}
	public String createAccount(Account account) {
		connection=DaoConnection.getConnection();
		String cmd="insert into Accounts(AccountNo,FirstName,"
				+ "LastName,City,State,Amount,Cheqfacil,"
				+ "AccountType) values(?,?,?,?,?,?,?,?) ";
		String result="";
		try {
			pst=connection.prepareStatement(cmd);
			pst.setInt(1, account.getAccountNo());
			pst.setString(2,account.getFirstName());
			pst.setString(3, account.getLastName());
			pst.setString(4, account.getCity());
			pst.setString(5, account.getState());
			pst.setInt(6, account.getAmount());
			pst.setString(7, account.getCheqFacil());
			pst.setString(8, account.getAccountType());
			pst.executeUpdate();
			result="account created successfully.."
					+account.getAccountNo();
					} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public int generateAccountNo() {
		connection=DaoConnection.getConnection();
		String cmd="select case when max(AccountNo) is null then 1 "
                 + "else max(AccountNo)+1 end AccountNo "
                 + " from Accounts";
		int accountNo=0;
		try {
			pst=connection.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			accountNo=rs.getInt("AccountNo");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accountNo;
	}

}
