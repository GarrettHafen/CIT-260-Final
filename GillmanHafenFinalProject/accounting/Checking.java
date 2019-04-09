//File Prologue
//Name: Nicole Gillman and Garrett Hafen
//Assignment: Final Project
//Date: 4/5/19
//CIT 260
package accounting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class Checking extends Account{
	
	
	private double interestEarned;
	
	private final double INTEREST_RATE = 0.3;
	private final double MONTHS = 12;
	
	/**
	 * default no-arg contructor
	 * Author: Garrett
	 * @return none
	 */
	public Checking() {
		super();
		interestEarned= 0.0;
	}
	
	/**
	 * constructor for Checking
	 * Author: Garrett and Nicole
	 * @param balance
	 * @return 
	 */
	public Checking(String name, int AccountNumber, String AccountType, double startingBalance, java.util.Date dateCreated) {
		super(name, AccountNumber, AccountType, startingBalance, dateCreated);	
	}
	
	/**
	 * method for getting the savings starting balance
	 * Author: Nicole
	 * @return balance
	 */
	public double getstartingBalance() {
		return super.getStartingBalance();
	}
	
	/**
	 * method for getting the interest earned
	 * Author: Nicole
	 * @return balance
	 */
	public double getInterestEarned() {
		interestEarned = super.getStartingBalance() * (INTEREST_RATE/100);
		return interestEarned;
	}
	
	/**
	 * Method for getting the interest rate
	 * Author: Nicole
	 * @return
	 */
	public double getInterestRate () {
		return INTEREST_RATE;
	}
	
	/** Return monthly interest rate
	 * Author: Nicole */
	public double getMonthlyInterestRate() {
		return INTEREST_RATE / MONTHS;
	}
	
	/**
	 * Method for getting monthly interest for current amount
	 * Author: Nicole
	 * @return calculated interest earned
	 */
	public double getMonthlyInterest() {
		return super.getStartingBalance() * (getMonthlyInterestRate() / 100);
	}
	
	/**
	 * toStringNew method
	 * Author: Garrett
	 * Purpose: creating the data to print in the receipt for new accounts
	 */
	public String toStringNew() {
		return "Name: " + super.getName() + "\nAccount Number: " + super.getAccountNumber() + "\nAccount Type: Checking" 
			    + "\nStarting Balance: " + super.getStartingBalance();
	}
	
	/**
	 * toStringExisting method
	 * Author: Garrett
	 * Purpose: creating the data to print in the receipt for new accounts
	 */
	public String toStringExisting() {
		return String.format("Name: %-10s\n Account Number: %-6d\n Account Type: %-8s\n Current Balance: %-10.2f\n With %3.2f earned in interest."
				, super.getName(), super.getAccountNumber(), "Checking", (super.getStartingBalance() + getInterestEarned()), getInterestEarned());
	}
	
	/**
	 * toStringList method
	 * Author: Garrett
	 * Purpose: creating the data to print to the console for all existing accounts, or for when printing individual existing accounts
	 */
	@Override
	public String toStringList() {
		return String.format("Name: %-10s | Account Number: %-6d | Account Type: %-8s | Current Balance: %-10.2f | With %3.2f earned in interest."
				, super.getName(), super.getAccountNumber(), "Checking", (super.getStartingBalance() + getInterestEarned()), getInterestEarned());
			
	}

}
