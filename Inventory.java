
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
	
	Scanner userInput = new Scanner(System.in);
	ArrayList<Item> items = new ArrayList<Item>();
	//When adding items to inventory, the order follows as: sku, description, quantity, and price.
	
	public void createItem() {
		int sku = 0;
		String description = null;
		int quantity = 0;
		double price = 0;
		
		System.out.println("Add New Item");
		
		sku = -1;
		
		while (sku < 0) {
			System.out.println("Enter Correct Item SKU");
			String input = userInput.nextLine();
			
			try {
				sku = Integer.valueOf(input);
			} catch (NumberFormatException e) {
				System.out.println("Input Not Recongnized! Try Again");
				sku = -1;
			}
		}
		
		for (int i=0; i<items.size();i++) {
			if (items.get(i).getSku() == sku) {
				
				System.out.println("SKU ALREADY EXISTS, PLEASE UPDATE QUANTITY!");
			
				quantity = -1;
				
				while (quantity < 0) {
					System.out.println("Enter Valid Quantity Please!");
					String input = userInput.nextLine();
					
					try {
						quantity = Integer.valueOf(input);
						items.get(i).setQuantity(quantity);
						return;
						
					} catch (NumberFormatException e) {
						System.out.println("Input Not Recongnized! Try Again");
						quantity = -1;
					}
				}
			
				
			}
		}
		
		
		description = null;
		while(description == null) {
			System.out.println("Enter Item Description:");
			description = userInput.nextLine();
		}
	
		quantity = -1;
		while (quantity < 0) {
			System.out.println("Enter the Quantity.");
			String input = userInput.nextLine();
			
			try {
				quantity = Integer.valueOf(input);
			} catch (NumberFormatException e) {
				System.out.println("Input Not Recongnized! Try Again");
				quantity = -1;
			}
		}
		
		
		price = -1;
		
		while (price < 0) {
			System.out.println("Enter Price Of Item.");
			String input = userInput.nextLine();
			
			try {
				price = Double.valueOf(input);
			} catch (NumberFormatException e) {
				System.out.println("Input Not Recongnized! Try Again");
				price = -1;
			}
		}
		
		
		Item newItem = new Item (sku, description, quantity, price);
		items.add(newItem);
		
		System.out.println("Item Was Successfully Added.");
		
		return;
		
		
	}
	
	public void updateInventory() {
		System.out.println("Update Inventory Menu:");
		
		int updatesku = -1;
		
		while (updatesku < 0) {
			System.out.println("Enter The SKU You Would Like To Update:");
			String input = userInput.nextLine();
			
			try {
				updatesku = Integer.valueOf(input);
				
			} catch (NumberFormatException e) {
				System.out.println("Input Not Recongnized! Try Again");
				updatesku = -1;
			}
		}
		
		int amount = -1;

		for(int i=0; i<items.size();i++){
			if (updatesku == items.get(i).getSku()) {
				while (amount < 0) {
					System.out.println("Enter New Quantity:");
					String input1 = userInput.nextLine();
					
					try {
						amount = Integer.valueOf(input1);
						
					} catch (NumberFormatException e) {
						System.out.println("Input Not Recongnized! Try Again");
						updatesku = -1;
					}
				}
				
				items.get(i).setQuantity(amount);
				return;
			}
		}
		
		System.out.println("SKU DOES NOT EXIST, TRY AGAIN!");
		System.out.println("If you would like to exit, Type 'exit, else type anything to proceed.");
		String userChoice = userInput.next();

		if (!(userChoice.equals("exit"))) {
			updateInventory();
		}
		return;
	}
	
	public void removeItem() {
		System.out.println("Removing Item Screen:");
		
		int deletesku = -1;
		
		while (deletesku < 0) {
			System.out.println("Enter Correct Item SKU");
			String input = userInput.nextLine();
			
			try {
				deletesku = Integer.valueOf(input);
				
			} catch (NumberFormatException e) {
				System.out.println("Input Not Recongnized! Try Again");
				deletesku = -1;
			}
		}
		
		//finds the index of the item that has the following sku to delete the item of the arraylist.

		for(int i=0; i<items.size();i++){
			if (deletesku == items.get(i).getSku()) {
				items.remove(i);
				System.out.println("Item Was Successfully Removed.");
				return;
			}
			
		}
		
		System.out.println("SKU DOES NOT EXIST!");
		System.out.println("If you would like to exit, type 'exit', else enter any key to proceed");
		String userChoice = userInput.next();
   
		if (!(userChoice.equals("exit"))) {
			removeItem();
		}
		
		return;
					
	}
	
	
	
	public void printInventory() {
		System.out.printf("%-22s%-42s%-32s%-32s\n","SKU","DESCRIPTION","QUANTITY", "PRICE");
		for(int i = 0; i<items.size();i++) {
			System.out.printf("%-22s%-42s%-32s%-32s\n",items.get(i).getSku(), items.get(i).getDesc(), items.get(i).getQuantity(), "$" + items.get(i).getPrice());
		}
		
	}
	
	public void loadInventory() {
	//just a sample of preloaded items within the inventory.	
	
		Item items0= new Item(32145, "Pencils", 100, 1.99);
		Item items1= new Item(32445, "Marble Notebook", 200, 2.99);
		Item items2= new Item(12145, "Folder", 50, 0.99);
		Item items3= new Item(22145, "iPad Pro 5th Generation", 10, 1099.99);
		Item items4= new Item(42145, "Macbook 2022 Pro", 5, 1999.99);
		Item items5= new Item(52145, "HP 9015 Printer", 9, 299.99);
		Item items6= new Item(62145, "Epson XP 4100 Printer", 1, 109.99);
		Item items7= new Item(31145, "Apple Pencil 1st Generation", 2, 99.99);
		Item items8= new Item(32145, "Apple Pencil 2nd Generation", 100, 129.99);
		Item items9= new Item(33145, "HP Pavilion", 1, 599.99);
		Item items10= new Item(34145, "Staples Corner Desk", 6, 79.99);
		
		items.add(items0);
		items.add(items1);
		items.add(items2);
		items.add(items3);
		items.add(items4);
		items.add(items5);
		items.add(items6);
		items.add(items7);
		items.add(items8);
		items.add(items9);
		items.add(items10);
	}
	
	
	
	
}
