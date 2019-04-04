//File Prologue
//Name: Nicole Gillman and Garrett Hafen
//Assignment: Final Project
//Date: 4/5/19
//CIT 260
package accounting;
public class Checking extends Account{
	
	private double startingBalance;
	
	/**
	 * default no-arg contructor
	 * @return none
	 */
	public Checking() {
		
	}
	
	/**
	 * constructor for Checking
	 * @param balance
	 * @return 
	 */
	public void Checking(double startingBalance) {
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
	 * toString method
	 */
	@Override
	public String toString() {
		
		return "Name: " + name + "\nAccount Number: " + AccountNumber + "\nAccount Type: " + AccountType + "\nStarting Balance: " + startingBalance;
	}

}
