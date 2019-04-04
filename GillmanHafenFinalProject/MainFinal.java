//File Prologue
//Name: Nicole Gillman and Garret Hafen
//Assignment: Final Project
//Date: 4/5/19
//CIT 260

		//
		//
		// DEV NOTE -- CAN THE USER TYPE EXIT IN enterName() TO GO BACK TO THE MAIN MENU?? HOW??
		//
		//
			
		//
		//
		// DEV NOTE -- NEED SEED DATA??
		//
		//

		//
		//
		// DEV NOTE -- NEED METHOD DESCRIPTION THINGYS
		//
		//

import accounting.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.*;
public class MainFinal {

	public static void main(String[] args) throws java.io.IOException {
		//declare variables
		String name = "";
		int accountNumber = 1000;
		String accountType = ""; 
		double startingBalance = 0.0;
		int userInput = 0;
		boolean isError = true;
		
		//declare constants
		
		//setup scanner
		Scanner in = new Scanner(System.in);
		
		//start ArrayList
		ArrayList<Account> accounts = new ArrayList<> ();
		
		//-------------------------------------start---------------------------------------
		System.out.println("Welcome to OOP Bank");
		
		//first do/while is to keep the system open till the user is done. terminate with '4' selection
		//second do/while is the initial menu. 1 for add, 2 for list, 3 for balance
		do {
			//-------------------------------------main menu---------------------------------------
			do {
				try {
					
					System.out.println("Please press 1 to add a new account, 2 to check the list of accounts"
							+ " and 3 to print the balance of an existing account. Press 4 to exit.");
					userInput = in.nextInt();
					//check if user enters anything other than 1,2,3,4.
					if (userInput !=1 && userInput !=2 && userInput !=3 && userInput !=4) {
						System.out.println("Invalid selection. Try again");
						in.nextLine();
						isError = true;
					}
					//if user enters valid input, exit first do/while and proceed with program
					isError = false;
				}
				catch (InputMismatchException e) {
					System.out.println("Sorry, That response is incorrect, Please Enter an integer: ");
					//clear input
					in.nextLine();
				}
			}while(isError);
			//-------------------------------------main menu---------------------------------------

			//check for user input then direct to right system
			if(userInput == 1) {
				
				//get name of new account
				System.out.println("You have chosen to create a new account.");

				// get name
				System.out.println("Please enter the name for this new account.");	
				name = enterName();		

				//get account type 
				System.out.println("Thank you, now to properly calculate the interest, please enter the account type: "
						+ "1 for checking or 2 for savings.");
				accountType = enterAccountType();
					
				//get starting balance
				System.out.println("Thank you, now please enter the starting balance of this account.");
				startingBalance = enterStartingBalance();
				
				//generate random account number (or incrementing account number?)
				
				//
				//
				// DEV NOTE -- NEED A WAY TO QUERY THE ARRAYLIST FOR MOST RECENT ACCOUNT NUMBER TO PRESERVE AFTER SESSION ENDS
				//
				//
				
				accountNumber = accountNumber + 1;
				System.out.println("Thank you, for your records, the account number will be: " + accountNumber + ".");
				//store into arrayList
				accounts.add(new Account(name, accountNumber, accountType, startingBalance));
				//print receipt
				PrintWriter myFile = new PrintWriter(accountNumber + "-Recipt.txt");
				myFile.println(accounts.get(accounts.size()-1).toString());
				myFile.close();
				System.out.println("Your account as been created. A receipt has been printed.");
				for(int i = 0; i<accounts.size(); i++) {
					System.out.println(accounts.get(i).toString());
				}
				
			}else if (userInput == 2) {
				//if user input is 2 then direct to list of all accounts, redirect back to menu
				//print out all the accounts stored in array list: account name, number, type, balance. 
				//print out total accounts, total in assets and how many of each type
			}else if (userInput == 3) {
				//if user input is 3 then direct user for account number, check account number and print file
				// get account number
				// console thank you and to check the directory for *file name*
				//print 'recipt' with file name *accountnumber-name-recipt*;
			}
			
			
			//name = in.nextLine();
			//accountNumber = in.nextInt();
			//accountType = in.nextInt();
			
			//Account a1 = new Account(name, accountNumber, accountType);
			//System.out.println(a1.getName());
			//PrintWriter myFile = new PrintWriter("Recipt.txt");
			//myFile.println(a1.getName());
			//myFile.println(a1.getAccountNumber());
			//myFile.println(a1.getAccountType());
			//myFile.close();
		}while(userInput != 4);

	}
	
	public static String enterName() {
		//setup scanner
		Scanner in = new Scanner(System.in);
		//enter name
		String name =in.next();
				
		return name;
	}
	
	public static String enterAccountType() throws IOException{
		//setup scanner
		Scanner in = new Scanner(System.in);
		
		
		boolean isError = true;
		String accountTypeWord = "";
		
		
		//do/while to ensure proper account type selection
		do {
			try {
				//get accountType
				int accountType = in.nextInt();
				if(accountType != 1 && accountType != 2 ) {
					System.out.println("Invalid entry, please try again. 1 for Checking or 1 for Savings");
					enterAccountType();
				}
				//convert number to word and store.
				if(accountType == 1) {
					accountTypeWord = "Checking";
				}else {
					accountTypeWord = "Savings";
				}
				isError = false;
			}
			catch (InputMismatchException e) {
				System.out.println("Sorry, That response is incorrect, Please Enter an integer: ");
				//clear input
				in.nextLine();
			}
		} while (isError);
		
		return accountTypeWord;
	}
	
	public static double enterStartingBalance() throws IOException{
		//setup scanner
		Scanner in = new Scanner(System.in);
		double startingBalance = 0.0;
		boolean isError = true;
		
		do {
			try {
				startingBalance = in.nextDouble();
				isError = false;
			}
			catch (InputMismatchException e) {
				System.out.println("Sorry, That response is incorrect, Please Enter an integer: ");
				//clear input
				in.nextLine();
			}
		} while (isError);
		
		return startingBalance;
	}
}


