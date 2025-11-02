package Basics;
import java.util.Scanner;

public class JavaVendingMachine {
	String[] items = new String[5];  // Field initialization – allowed
	Scanner sc=new Scanner(System.in);
	int selectedoption;

	
	JavaVendingMachine(){
		items[0] = "Egg puffs - 20Rs"; 
		items[1] = "Tea - 15Rs"; 
		items[2] = "Coffee - 20Rs"; 
		items[3] = "Badam Milk - 35Rs"; 
		items[4] = "Milk kova - 30Rs"; 
		
		System.out.println("Welcome to Ags Health");
		System.out.println("Today's Menu");
		
		for( int i=0; i<items.length;i++) {
			System.out.println(i+1+"  "+items[i]);
		}
			
			System.out.println("Select option to buy the product");
			System.out.println("Press 0 to exit");
			System.out.println();
			selectedoption=getinput();
			Boolean Ischeck=check();
			
			if(Ischeck){
				System.out.println("Do you wanna buy  "+ items[selectedoption-1]+ ": Yes or No");
				System.out.println();
				boolean confirmation=confirm();
				
				if(confirmation) {
					System.out.println("Thanks for shopping with us");
					System.out.println("Want something else?");
					System.out.println();
					boolean secondconfirmation=confirm();
					if(secondconfirmation) {
						System.out.println("Lets make it quick");
						System.out.println();
					}
					else {
						System.out.println("Thanks for shopping with us");
						System.out.println();
					}
				}
				else {
					System.out.println("We hope you come back again");
					System.out.println("Want something else?");
					System.out.println();
				}
				
			}
			else {
				System.out.println("Select a valid option");
				System.out.println();
			}
		} 

	
	
	int getinput() {
		int temporary=sc.nextInt();
		return temporary;
	}
	
	boolean check() {
		return selectedoption != 0;
		
	}
	boolean confirm() {
		String confirmation=sc.next();
		if(confirmation.equals("Yes")) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		/*Task 2:
			Create a menu-driven program for a vending machine:

			Display a list of items and their prices.

			Let the user choose an item and “buy” it.

			After each purchase, ask if they want to buy another one.

			Stop only when the suser says no.*/
		while(true) {
		 JavaVendingMachine obj=new JavaVendingMachine();
		}
	
	}
		

}
