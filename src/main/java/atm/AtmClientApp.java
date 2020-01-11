package atm;

import java.util.Scanner;

public class AtmClientApp {

	public static void main(String[] args) {
		
		Atm AtmClient = new Atm("1234",1.00);
		int selection = 0;
		
		//Get Pin
		System.out.println("Enter your PIN:");
		Scanner input = new Scanner(System.in);
		String enteredPin = input.next();
		
		if (AtmClient.allowAcess(enteredPin) == false) {
			System.out.println("Incorrect PIN");
		}
		if (AtmClient.allowAcess(enteredPin) == true) {

			do {
				System.out.println("** Welcome to your Family Bank **");
				System.out.println("Choose an option.");
				System.out.println("Press 1 to deposit funds");
				selection = input.nextInt();
				
				if (selection == 1) {
					System.out.println("How much would you like to deposit?");
					AtmClient.deposit(input.nextDouble());
					System.out.println(AtmClient.getBalance());
				}
				
			} while (selection != 4);
		}
	}
}

//	System.out.println("Press 2 to withdrawl funds");
//	System.out.println("Press 3 to check balance");
//	System.out.println("Press 4 to exit");
//	while(intput.)
