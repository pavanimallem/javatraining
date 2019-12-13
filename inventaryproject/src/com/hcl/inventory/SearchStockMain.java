package com.hcl.inventory;

import java.util.Scanner;


public class SearchStockMain {
	public static void main(String[] args) {
		String stockId;;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter stockId ");
		stockId=sc.nextLine();
		InventoryDAO dao=new InventoryDAO();
		Inventory inventory=dao.searchStock(stockId);
		if(inventory != null) {
			System.out.println("StockId " +inventory.getStockid());
			System.out.println("Item Name " +inventory.getItemName());
			System.out.println("Price " +inventory.getPrice());
			System.out.println("QuantityAvail " +inventory.getQuantityAvail());
			
		}else {
			System.out.println("StockId Not Found...");
		}
	}

}
