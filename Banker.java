// Bridget Brigadoi
// Ch. 1, Problem 24
// I did not copy code from other people or sources other than our CIS-221 textbook. 
// I did not use any AI software to help write code.

import java.util.Scanner;

public class Banker {
	public static void main(String[] args) {
		
		BankAccount myAccount = new BankAccount();
		Scanner scanner = new Scanner(System.in);
		Boolean runTime = true;
		
		while (runTime == true) {
			System.out.println("Enter 'D' to deposit, 'W' to withdraw, 'T' to get total amount, or"
				+ " 'Q' to quit: ");
			String option = scanner.nextLine();
			
			if (option.equals("D")) {
				System.out.println("Enter amount to deposit: ");
				int amount = Integer.parseInt(scanner.nextLine());
				try {
					myAccount.deposit(amount);
				} catch(BankAccountException e){
					System.out.println("Invalid amount. Amount must be positive");
				}	
			} else if (option.equals("W")) {
				System.out.println("Enter amount to withdraw");
				int amount = Integer.parseInt(scanner.nextLine());
				try {
					myAccount.withdraw(amount);
				} catch (BankAccountException e) {
					if (amount < 0) {
						System.out.println("Invalid amount. Amount must be positive");
					} else {
						System.out.println("Cannot withdraw. You do not have enough money in your account");
					}
					
				}
			} else if (option.equals("T")) {
				System.out.println(myAccount.toString());
				
			} else if (option.equals("Q")) {
				System.out.println("Goodbye");
				runTime = false;
			} else {
				System.out.println("Incorrect option. Please try again.");
			}
			
				
		}
	}
}
