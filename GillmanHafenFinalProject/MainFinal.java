//File Prologue
//Name: Nicole Gillman and Garrett Hafen
//Assignment: Final Project
//Date: 4/5/19
//CIT 260


		//
		//
		// DEV NOTE -- NEED METHOD DESCRIPTION THINGYS
		//
		//

import accounting.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class MainFinal {

	public static void main(String[] args) throws FileNotFoundException {
		//declare variables
		String name = "";
		int accountNumber = 1000;
		String accountType = ""; 
		double startingBalance = 0.0;
		int userInput = 0;
		boolean isError = true;
		Account accountToPrint;
		
		
		//declare constants
		
		//setup scanner
		Scanner in = new Scanner(System.in);
		
		//start ArrayList
		ArrayList<Account> accounts = new ArrayList<> ();
		//-------------------------------------start---------------------------------------
		System.out.println("Welcome to OOP Bank");
		
		accountNumber = seedData(accounts, accountNumber);
		
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
				//     use accounts.get(accounts.size()-1).getAccountNumber + 1;
				//     add logic to create accounts.add(new Checking/Saving)
				//
				//
				
				accountNumber = accountNumber + 1;
				System.out.println("Thank you, for your records, the account number will be: " + accountNumber + ".");
				//store into arrayList
				java.util.Date date = new Date();
				createAccount(name, accountNumber, accountType, startingBalance, date, accounts);
				System.out.println("Your account as been created. A receipt has been printed.");
				
				
			}else if (userInput == 2) {
				//if user input is 2 then direct to list of all accounts, redirect back to menu
				//print out all the accounts stored in array list: account name, number, type, balance. 
				//print out total accounts, total in assets and how many of each type
				
				for(int i = 0; i<accounts.size(); i++) {
					System.out.println(accounts.get(i).toStringList());
				}
			}else if (userInput == 3) {
				//if user input is 3 then direct user for account number, check account number and print file
				// get account number
				// console thank you and to check the directory for *file name*
				//print 'recipt' with file name *accountnumber-name-recipt*;
				System.out.println("Please enter the account number you want details for.");
				accountToPrint = accountToPrint(accounts);
				try (Scanner existingFile = new Scanner( new File(accountToPrint.getAccountNumber() + "-Recipt.txt"))){
					System.out.println(accountToPrint.toStringExisting());
					existingFile.close();
				}
				catch(FileNotFoundException e) {
					System.out.println("Could not open the file, program is terminating.");
				}
				
				
			}else if (userInput == 4) {
				//if user input is 4, display exit message and end program
				System.out.println("Thank you. You're session has ended.");
			}

		}while(userInput != 4);

	}
	/**
	 * Method for adding new account name
	 * Author: Garrett
	 * @return account name
	 */
	public static String enterName() {
		//setup scanner
		Scanner in = new Scanner(System.in);
		//enter name
		String name =in.next();
				
		return name;
	}
	
	/**
	 * Method for new Account type
	 * Author: Garrett
	 * @return account type
	 */
	public static String enterAccountType() {
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
	
	/**
	 * Method for new starting balance amount
	 * Author: Garrett
	 * @return starting balance
	 */
	public static double enterStartingBalance() {
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
	
	/**
	 * Method for array of existing accounts
	 * Author: Garrett
	 * @param accounts
	 * @param accountNumber
	 * @return 
	 * @throws FileNotFoundException 
	 */
	public static int seedData(ArrayList<Account> accounts, int accountNumber) throws FileNotFoundException {
		java.util.Date date = new Date();
		accountNumber = accountNumber + 1;
		createAccount("Garrett", accountNumber, "Checking", 100.00, date, accounts);
		accountNumber = accountNumber + 1;
		createAccount("Anna", accountNumber, "Savings", 1230.33, date, accounts);
		accountNumber = accountNumber + 1;
		createAccount("Miles", accountNumber, "Checking", 0.01, date, accounts);
		accountNumber = accountNumber + 1;
		createAccount("Brandan", accountNumber, "Savings", 100.00, date, accounts);
		accountNumber = accountNumber + 1;
		createAccount("Jordan", accountNumber, "Checking", 17510.00, date, accounts);
		return accountNumber;
	}
	
	/**
	 * Method for printing a specific account
	 * Author: Garrett
	 * @param accounts
	 * @return specific account that matches the userInput account number
	 */
	public static  Account accountToPrint(ArrayList<Account> accounts) {
		//setup scanner
				Scanner in = new Scanner(System.in);
				//enter name
				int accountToPrint = 0;
				int accountPlaceHolder = 0;
				int accountVerification = 0;
				boolean isError = true;
				do {
					do {
						try {
							accountToPrint = in.nextInt();
							accountVerification = 0;
							//check if user enters numbers
							isError = false;
						}
						catch (InputMismatchException e) {
							System.out.println("Sorry, That response is incorrect, Please Enter an integer: ");
							//clear input
							in.nextLine();
						}
					}while(isError);
					
					isError = true;
					
					for(int i = 0; i<accounts.size(); i++) {
						if(accounts.get(i).getAccountNumber() == accountToPrint) {
							isError = false;
						}else {
							accountVerification++;
						}
					}
					if(accountVerification == accounts.size()) {
						System.out.println("Please Enter an existing account number. "
								+ "Enter 1001 if you cant remember the account number "
								+ "and go back to print out the list of accounts.");
						in.hasNextLine();
					}
					
					
					
				}while(isError);
				
				for(int i = 0; i<accounts.size(); i++) {
					if(accounts.get(i).getAccountNumber() == accountToPrint) {
						accountPlaceHolder = i;
					}
				}
				return accounts.get(accountPlaceHolder);
	}
	
	/**
	 * Method for creating an account
	 * Author: Garrett
	 * @param name, account number, account type, starting balance, date, accounts
	 * @return nothing
	 */
	public static void createAccount(String name, int accountNumber, String accountType, double startingBalance, Date date, ArrayList<Account> accounts) throws FileNotFoundException {
		if(accountType == "Checking") {
			accounts.add(new Checking(name, accountNumber, accountType, startingBalance, date));
		}else {
			accounts.add(new Savings(name, accountNumber, accountType, startingBalance, date));
		}
		//print receipt
		PrintWriter myFile = new PrintWriter(accountNumber + "-Recipt.txt");
		myFile.println(accounts.get(accounts.size()-1).toStringNew());
		myFile.close();
		
	}
}


