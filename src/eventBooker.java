import java.util.Scanner;

public class eventBooker {

	//Declare variables
	
	static String eventName;
	static double eventPrice;
	static int ticketQuantity;
	
	//Variables for process
	
	static double totalPrice;
	static double discountPrice;
	
	public static void getInput() {
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("Enter the event name: ");
		eventName = myScan.nextLine();
		
boolean isValid;
		
		do {
		System.out.println("Enter the ticket quantity: ");
		ticketQuantity = myScan.nextInt();
		
		if(ticketQuantity >= 1 && ticketQuantity <= 5) {
			isValid = true;
			
		} else {
			System.out.println("You can only purchase up to 5 tickets at once");
			isValid = false;
		}
		
		} while(isValid==false);
			
		do {
		System.out.println("Enter the event price: ");
		eventPrice = myScan.nextDouble();
		
		if(eventPrice >= 1 && eventPrice <= 1000) {
			isValid = true;
			
		} else {
			System.out.println("Total price only limits to 1000");
			isValid = false;
		}
		
		} while(isValid==false);
		
	}
	
	public static void calculateTotal() {
		
		totalPrice = ticketQuantity * eventPrice;
	}

	public static void calculatedDiscount() {
		
		if(totalPrice >= 1 && totalPrice <= 100) {
			discountPrice = totalPrice - 5;
			
		} else if (totalPrice >= 101 && totalPrice <= 500) {
			discountPrice = totalPrice - 10;
			
		} else if (totalPrice >= 501) {
			discountPrice = totalPrice - 20;
		}
	}


	public static void displayOutput () {
		
		System.out.println("Event name: " + eventName);
		System.out.println("Ticket quantity: " + ticketQuantity);
		System.out.println("Event price: " + eventPrice);
		
		System.out.println("Total price: " + totalPrice);
		System.out.println("Discounted price: " + discountPrice);
	}
	
	
	public static void main(String[] args) {
		
		final int maxNumber = 10;
		
		for(int i=1; i<=maxNumber;i++) {
		
		getInput();
		calculateTotal();
		calculatedDiscount();
		displayOutput();
		
		String choice;
		Scanner choiceScanner = new Scanner(System.in);
		System.out.println("Do you want to continue?");
		choice = choiceScanner.nextLine();
		
		if(choice.equalsIgnoreCase("Yes")) {
			
		} else {
			break;	
		}
			
		}

	}

}
