package com.hcl.inventory;

import java.util.Scanner;

public class AddStockMain {
	public static void main(String[] args) {
		InventoryDAO dao=new InventoryDAO();
		Inventory inventory=new Inventory();
		String stockid=dao.generateStockId();
		inventory.setStockid(stockid);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the item Name");
		inventory.setItemName(sc.nextLine());
		System.out.println("enter the price");
		inventory.setPrice(sc.nextInt());
		System.out.println("enter the Quantity Available");
		inventory.setQuantityAvail(sc.nextInt());
		System.out.println(dao.addStock(inventory));
	}
}

