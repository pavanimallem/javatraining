package com.hcl.bank;

import java.util.Scanner;

public class SearchAccountMain {
	public static void main(String[] args) {
		int accountNo;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter accountno ");
		accountNo=sc.nextInt();
		AccountDAO dao=new AccountDAO();
		Account account=dao.searchAccount(accountNo);
		if(account!=null) {
			System.out.println("first name " +account.getFirstName());
			System.out.println("last name " +account.getLastName());
			System.out.println("city "+account.getCity());
			System.out.println("state "+account.getState());
			System.out.println("amount"+account.getAmount());
			System.out.println("cheqfacil "+account.getCheqFacil());
			System.out.println("accounttype "+account.getAccountType());
		} else {
			System.out.println("accountno not found.."); 
		}
	}

}
