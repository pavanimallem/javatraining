package com.hcl.bank;

import java.util.Scanner;

public class CreateAccountMain {
	public static void main(String[] args) {
		AccountDAO dao=new AccountDAO();
		Account account=new Account();
		int accno=dao.generateAccountNo();
		account.setAccountNo(accno);
		Scanner sc=new Scanner(System.in);
		System.out.println("first name ");
		account.setFirstName(sc.nextLine());
		System.out.println("last name");
		account.setLastName(sc.nextLine());
		System.out.println("city ");
		account.setCity(sc.nextLine());
		System.out.println("state ");
		account.setState(sc.nextLine());
		System.out.println("amount ");
		account.setAmount(Integer.parseInt(sc.nextLine()));
		System.out.println("cheq facil ");
		account.setCheqFacil(sc.nextLine());
		System.out.println("account type ");
		account.setAccountType(sc.nextLine());
		System.out.println(dao.createAccount(account));
		}

}
