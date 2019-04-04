package accounting;

public class Savings extends Account{
	
	private double InterestRate;
	private double TotalAmount;
	
	/**
	 * default no-arg contructor
	 * @return none
	 */
	public Savings() {
		
	}
	/**
	 * constructor for Savings
	 * @param TotalAmount
	 * @return none
	 */
	public Savings(double TotalAmount) {
		
	}
	
	/**
	 * Method for setting interest rate
	 * @param InterestRate
	 */
	public void setInterestRate(double InterestRate) {
		this.InterestRate = InterestRate;
	}
	
	/**
	 * Method for getting savings amount
	 * @return
	 */
	public double getTotalAmount() {
		return TotalAmount;
	}
	
	/**
	 * Method for getting the interest rate
	 * @return
	 */
	public double getInterestRate () {
		return InterestRate;
	}
	
	/** Return monthly interest rate */
	public double getMonthlyInterestRate() {
		return InterestRate / 12;
	}
	
	/**
	 * Method for getting monthy interest for current amount
	 * @return calculated interest earned
	 */
	public double getMonthlyInterest() {
		return TotalAmount * (getMonthlyInterestRate() / 100);
	}

}
