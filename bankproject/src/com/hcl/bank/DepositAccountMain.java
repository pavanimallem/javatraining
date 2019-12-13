package com.hcl.bank;

import java.util.Scanner;

public class DepositAccountMain {
	public static void main(String[] args) {
		int accountNo,depositAmount;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter accountno ");
		accountNo=sc.nextInt();
		System.out.println("enter depositeAmount ");
		depositAmount=sc.nextInt();
		AccountDAO dao=new AccountDAO();
		System.out.println(dao.depositAccount(accountNo, depositAmount));
	}

}
