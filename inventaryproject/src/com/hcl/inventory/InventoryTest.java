package com.hcl.inventory;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class InventoryTest {
	static Inventory inventory=null;
	@BeforeClass
	public static void setUp() {
		inventory=new Inventory();
	}

	@Test
	public void testGettersAndSetters() {
		inventory=new Inventory();
		inventory.setStockid("S00");
		inventory.setItemName("pen");
		inventory.setPrice(250);
		inventory.setQuantityAvail(13);
		
		assertEquals("S00", inventory.getStockid());
		assertEquals("pen", inventory.getItemName());
		assertEquals(250, inventory.getPrice());
		assertEquals(13, inventory.getQuantityAvail());
		
	}

}
