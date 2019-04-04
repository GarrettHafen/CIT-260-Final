//File Prologue
//Name: Nicole Gillman and Garrett Hafen
//Assignment: Final Project
//Date: 4/5/19
//CIT 260
package accounting;

public class Account {

	//data fields
	private String name;
	private int AccountNumber;
	private String AccountType;
	private double startingBalance;
	private java.util.Date dateCreated;
	
	/**
	 * default no-arg contructor
	 * @param object 
	 * @return none
	 */
	public Account() {
		
	}
	
	/**
	 * constructor for Account
	 * @param name
	 * @param AccountNumber
	 * @param AccountType
	 */
	public Account(String name, int AccountNumber, String AccountType, double startingBalance, java.util.Date dateCreated) {
		this.name = name;
		this.AccountNumber = AccountNumber;
		this.AccountType = AccountType;
		this.startingBalance = startingBalance;
		this.dateCreated = dateCreated; 
		
	}
	
	/**
	 * method for getting name
	 * @return name
	 */
	public String getName() {
		
		return name;
	}
		
	/**
	 * method for setting new account holder name
	 * @param name
	 * @return none
	 */
	public void setName(String name) {
		
	}
	
	/**
	 * method for setting account number
	 * @return new account number
	 */
	public int getAccountNumber(){
		
		return AccountNumber;
	}
	
	/**
	 * method for getting account type
	 * @return type
	 */
	public String getAccountType(){
		
		return AccountType;
	}
	
	/**
	 * method for setting account type
	 * @param type
	 * @return none
	 */
	public void setAccountType(String type) {
		
	}
	
	/**
	 * method for getting account type
	 * @return type
	 */
	public double getStartingBalance(){
		
		return startingBalance;
	}
	
	/** the getDateCreated() method
	 * Purpose: return the date the object was created
	 * @param void
	 * @returns: a java.util.Date object
	 */
	public java.util.Date getDateCreated( ) {
		return dateCreated;
	}
	
	/** the getDateCreated() method
	 * Purpose: return the date the object was created
	 * @param void
	 * @returns: a java.util.Date object
	 */
	public void setDateCreated(java.util.Date createdDate) {
		dateCreated = createdDate;
	}
	
	/**
	 * toStringNew method
	 */
	public String toStringNew() {
		
		return "Name: " + name + "\nAccount Number: " + AccountNumber + "\nAccount Type: " + AccountType + "\nStarting Balance: " + startingBalance;
	}
	/**
	 * toStringList method
	 */
	public String toStringList() {
		
		return "Name: " + name + " | Account Number: " + AccountNumber + " | Account Type: " + AccountType + 
				" | Starting Balance: " + startingBalance + " | Creation Date: " + dateCreated;
	}
	
	
	
}
