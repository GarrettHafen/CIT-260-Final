//File Prologue
//Name: Nicole Gillman and Garret Hafen
//Assignment: Final Project
//Date: 4/5/19
//CIT 260
import accounting.*;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.*;
public class MainFinal {

	public static void main(String[] args) throws java.io.IOException {
		//declare variables
		String name = "";
		int accountNumber = 1000;
		int accountType = 0; //1-checking 2-saving
		double startingBalance = 0.0;
		int userInput = 0;
		boolean isError = true;
		int nameVerification = 0;
		int accountTypeVerification = 0;
		
		int startingBalanceVerification = 0;
		
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
				
				accountCreation();
				
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

	public static void accountCreation() {
		//setup scanner
		Scanner in = new Scanner(System.in);
		
		boolean isError = true;
		String name = "";
		//if user input is 1 then direct to new account logic
		
		//get name of new account
		System.out.println("You have chosen to create a new account.");
		
		//
		//
		// DEV NOTE -- CAN THE USER TYPE EXIT TO GO BACK TO THE MAIN MENU?? HOW??
		//
		//
		
		//
		//
		// DEV NOTE -- split up into methods. 
		//
		//
		
		//
		//
		// DEV NOTE -- NEED SEED DATA??
		//
		//
		
		System.out.println("Please enter the name for this new account.");
		name = enterName();
		
		//-------------------------------------name entry---------------------------------------
		//-------------------------------------account type---------------------------------------
		//get account type (1-checking 2-saving)
		System.out.println("Thank you, now to properly calculate the interest, please enter the account "
				+ "type. 1 for checking, 2 for savings.");
		accountType = in.nextInt();
		//reset isError
		isError = true;
		//do/while to ensure proper account type selection
		do {
			try {
				System.out.println("You entered " + accountType + ", is this correct? 1 for yes, 2 for no, 3 to quit.");
				accountTypeVerification = in.nextInt();
				//check if user enters anything other than 1,2,3.
				if (accountTypeVerification !=1 && accountTypeVerification !=2 && accountTypeVerification !=3) {
					System.out.println("Invalid selection. Try again");
					in.nextLine();
					isError = true;
				}
				// if user wants to change the account type, clear account type and try again.
				if(accountTypeVerification == 2) {
					System.out.println("Please re-enter the name");
					accountType = in.nextInt();
					isError = true;
				}
				isError = false;
			}
			catch (InputMismatchException e) {
				System.out.println("Sorry, That response is incorrect, Please Enter an integer: ");
				//clear input
				in.nextLine();
			}
		} while (isError);
		//if they want to quit, then exit the system and go back to the main menu
		if(accountTypeVerification == 3) {
			
		}
		//-------------------------------------account type---------------------------------------
		//-------------------------------------starting balance---------------------------------------
		
		//
		//
		// DEV NOTE -- FORMAT AMOUNT TO HAVE .00
		//
		//
		
		//get starting balance
		System.out.println("Thank you, now please enter the starting balance of this account.");
		startingBalance = in.nextDouble();
		//do/while to ensure proper balance entry
		do {
			try {
				System.out.println("You entered " + startingBalance + ", is this correct? 1 for yes, 2 for no, 3 to quit.");
				startingBalanceVerification = in.nextInt();
				//check if user enters anything other than 1,2,3.
				if (startingBalanceVerification !=1 && startingBalanceVerification !=2 && startingBalanceVerification !=3) {
					System.out.println("Invalid selection. Try again");
					in.nextLine();
					isError = true;
				}
				// if user wants to change the account type, clear account type and try again.
				if(startingBalanceVerification == 2) {
					System.out.println("Please re-enter the name");
					accountType = in.nextInt();
					isError = true;
				}
				isError = false;
			}
			catch (InputMismatchException e) {
				System.out.println("Sorry, That response is incorrect, Please Enter an integer: ");
				//clear input
				in.nextLine();
			}
		} while (isError);
		//if they want to quit, then exit the system and go back to the main menu
		if(startingBalanceVerification == 3) {
			return;
		}
		//-------------------------------------starting balance---------------------------------------
		//generate random account number (or incrementing account number?)
		
		//
		//
		// DEV NOTE -- NEED A WAY TO QUERY THE ARRAYLIST FOR MOST RECENT ACCOUNT NUMBER TO PRESERVE AFTER SESSION ENDS
		//
		//
		
		//
		//
		// DEV NOTE -- CREATE WAY TO DISPLAY CHECKING OR SAVINGS BASED ON accountType
		//
		//
		
		accountNumber = accountNumber + 1;
		System.out.println("Thank you, for your records, the account number will be: " + accountNumber + ".");
		
		//store into arrayList
		accounts.add(new Account(name, accountNumber, accountType, startingBalance));
		//print receipt
		PrintWriter myFile = new PrintWriter(accountNumber + "-Recipt.txt");
		myFile.println("NAME: " + name);
		myFile.println("ACCOUNT NUMBER: " + accountNumber);
		myFile.println("ACCOUNT TYPE: " + accountType);
		myFile.println("$" + startingBalance);
		myFile.close();
		System.out.println("Your account as been created. A receipt has been printed.");
	}
	
	public static String enterName() {
		//setup scanner
		Scanner in = new Scanner(System.in);
		
		int nameVerification = 0;
		boolean isError = true;
		//verify name is correct
		//do/while ensures proper name verification selection
		do {
			try {
				System.out.println("You entered " + name + ", is this correct? 1 for yes, 2 for no, 3 to quit.");
				nameVerification = in.nextInt();
				//check if user enters anything other than 1,2,3.
				if (nameVerification !=1 && nameVerification !=2 && nameVerification !=3) {
					System.out.println("Invalid selection. Try again");
					in.nextInt();
					isError = true;
				}
				// if user wants to change the name, clear name and try again.
				if(nameVerification == 2) {
					System.out.println("Please re-enter the name");
					enterName();
					
				}
				isError = false;
			}
			catch (InputMismatchException e) {
				System.out.println("Sorry, That response is incorrect, Please Enter an integer: ");
				//clear input
				in.nextLine();
			}
		} while (isError);
		// if they want to quit, then exit the system and go back to the main menu
		if(nameVerification == 3) {
			return;
		}
	}
}


