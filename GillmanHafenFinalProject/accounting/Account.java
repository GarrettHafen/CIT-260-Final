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
	private String dateCreated;
	
	/**
	 * default no-arg contructor
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
	public Account(String name, int AccountNumber, String AccountType) {
		this.name = name;
		this.AccountNumber = AccountNumber;
		this.AccountType = AccountType;
		
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
	 * @return 10 digit account number
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
	 * toString method
	 */
	public String toString() {
		String test = "";
		return test;
	}
	
}
