//File Prologue
//Name: Nicole Gillman and Garrett Hafen
//Assignment: Final Project
//Date: 4/5/19
//CIT 260
package accounting;

import java.util.Date;

public class Checking extends Account{
	
	private double startingBalance;
	private double interestEarned;
	private Date createdDate;
	
	private final double INTEREST_RATE = .003;
	
	/**
	 * default no-arg contructor
	 * @return none
	 */
	public Checking() {
		super();
		interestEarned= 0.0;
	}
	
	/**
	 * constructor for Checking
	 * @param balance
	 * @return 
	 */
	public Checking(String name, int AccountNumber, String AccountType, double startingBalance, java.util.Date dateCreated) {
		super(name, AccountNumber, AccountType, startingBalance, dateCreated);
		this.startingBalance = startingBalance;
		
	}
	
	/**
	 * method for getting the savings starting balance
	 * @return balance
	 */
	public double getstartingBalance() {
		return startingBalance;
	}
	
	/**
	 * method for getting the savings starting balance
	 * @return balance
	 */
	public double getInterestEarned() {
		return startingBalance;
	}
	
	
	
	/**
	 * toString method
	 */
	@Override
	public String toString() {
		
		return "Name: " + super.getName() + "\nAccount Number: " + super.getAccountNumber() + "\nAccount Type: " 
		+ super.getAccountType() + "\nStarting Balance: " + super.getStartingBalance();
	}

}
