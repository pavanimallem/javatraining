package com.hcl.bank;

import java.util.Scanner;

public class WithdrawAccountMain {
	public static void main(String[] args) {
		int accountNo,withdrawAmount;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter accountno ");
		accountNo=sc.nextInt();
		System.out.println("enter withdrawAmount ");
		withdrawAmount=sc.nextInt();
		AccountDAO dao=new AccountDAO();
		System.out.println(dao.WithdrawAccount(accountNo, withdrawAmount));
	}

}
