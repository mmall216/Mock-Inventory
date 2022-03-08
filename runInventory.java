import java.util.Scanner;
public class runInventory {
	public static void main(String[] args) {
		
		
		Inventory storeInventory = new Inventory();
		storeInventory.loadInventory();
		Scanner userInput = new Scanner (System.in);
		
		int userChoice=0;
		
		do {
			System.out.println("Inventory Management Program:");
			System.out.println("1- Display Inventory");
			System.out.println("2- Update Inventory Quantity");
			System.out.println("3- Add New Item");
			System.out.println("4- Remove Item");
			System.out.println("5- Exit Program");
			
			//do tryncatch
			System.out.println("Enter Your Choice:");
			userChoice = userInput.nextInt();
			
			switch(userChoice) {
			case 1:
				storeInventory.printInventory();
				System.out.println(" ");
				break;
				
			case 2:
				storeInventory.updateInventory();
				System.out.println(" ");
				break;
				
			case 3:
				storeInventory.createItem();
				System.out.println(" ");
				break;
				
			case 4:
				storeInventory.removeItem();
				System.out.println(" ");
				break;
				
			case 5:
				userInput.close();
				System.out.println("Exiting Program... ");
				System.out.println("Changes Successfully Uploaded!");
				break;
			
			
			}
		} while (userChoice != 5);

	}
}
