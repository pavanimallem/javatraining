package com.hcl.bank;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {
	static Account account=null;
	@BeforeClass
	public static void setUp() {
		account=new Account();
	}

	@Test
	public void testGettersAndSetters() {
		account=new Account();
		account.setAccountNo(1);
		account.setFirstName("pavani");
		account.setLastName("mallem");
		account.setCity("ongole");
		account.setState("andhra");
		account.setAmount(25000);
		account.setCheqFacil("yes");
		account.setAccountType("savings");
		
		assertEquals(1, account.getAccountNo());
		assertEquals("pavani", account.getFirstName());
		assertEquals("mallem", account.getLastName());
		assertEquals("ongole", account.getCity());
		assertEquals("andhra", account.getState());
		assertEquals(25000, account.getAmount());
		assertEquals("yes", account.getCheqFacil());
		assertEquals("savings", account.getAccountType());
		
	}

}
