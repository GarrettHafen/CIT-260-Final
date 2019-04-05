//File Prologue
//Name: Nicole Gillman and Garrett Hafen
//Assignment: Final Project
//Date: 4/5/19
//CIT 260
package accounting;

import java.util.Date;

public class Savings extends Account{
	
	
	private double interestEarned;
	
	private final double INTEREST_RATE = .003;
	private final double MONTHS = 12;
	
	/**
	 * default no-arg contructor
	 * @return none
	 */
	public Savings() {
		super();
		interestEarned= 0.0;
	}
	
	/**
	 * constructor for Checking
	 * @param balance
	 * @return 
	 */
	public Savings(String name, int AccountNumber, String AccountType, double startingBalance, java.util.Date dateCreated) {
		super(name, AccountNumber, AccountType, startingBalance, dateCreated);
		
		
	}
	
	/**
	 * method for getting the savings starting balance
	 * @return balance
	 */
	public double getstartingBalance() {
		return super.getStartingBalance();
	}
	
	/**
	 * method for getting the interest earned
	 * @return balance
	 */
	public double getInterestEarned() {
		interestEarned = super.getStartingBalance() * (INTEREST_RATE/100);
		return interestEarned;
	}
	
	/**
	 * Method for getting the interest rate
	 * @return
	 */
	public double getInterestRate () {
		return INTEREST_RATE;
	}
	
	/** Return monthly interest rate */
	public double getMonthlyInterestRate() {
		return INTEREST_RATE / MONTHS;
	}
	
	/**
	 * Method for getting monthly interest for current amount
	 * @return calculated interest earned
	 */
	public double getMonthlyInterest() {
		return super.getStartingBalance() * (getMonthlyInterestRate() / 100);
	}
	
	/**
	 * toStringNew method
	 * Purpose: creating the data to print in the receipt for new accounts
	 */
	public String toStringNew() {
		return "Name: " + super.getName() + "\nAccount Number: " + super.getAccountNumber() + "\nAccount Type: Savings" 
			    + "\nStarting Balance: " + super.getStartingBalance();
		
	}
	/**
	 * toStringList method
	 * Purpose: creating the data to print to the console for all existing accounts, or for when printing individual existing accounts
	 */
	@Override
	public String toStringList() {
		return String.format("Name: %-10s | Account Number: %-6d | Account Type: %-8s | Current Balance: %-10.2f | With %3.2f earned in interest."
				, super.getName(), super.getAccountNumber(), "Savings", (super.getStartingBalance() + getInterestEarned()), getInterestEarned());
			
	}

}
