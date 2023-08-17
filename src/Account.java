/**
 * Account Class, used for carrying all of the information of an account and doing simple actions
 * @author seanm
 */

public class Account {
	private int secretCounter, last4SSN;
	private double interestRate, money;
	private String name, SSN, password, email;
	
	public Account(String name, String SSN, String password, String email)
	{
		this.name = name;
		this.SSN = SSN;
		this.password = password;
		this.email = email;
		secretCounter = 0;
		money = 0;
		interestRate = 0.1;
		
		last4SSN = getLast4SSN(); //Used for security measures
	}
	
	/** @return last 4 digits of the user's SSN */
	private int getLast4SSN() {
		int len = SSN.length();		

		return Integer.parseInt(SSN.substring(len-4, len));
	}
	
	
	/**
	 * Deposits money into account
	 */
	public void deposit(double mon)
	{
		money += mon;
	}
	
	/**
	 * Reduces the amount of money in account
	 */
	public void withdrawl(double mon)
	{
		money -= mon;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/* ===============================================================================================
	 *    Getters and Setters
	 * ===============================================================================================*/

	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public double getMoney()
	{
		return money;
	}
	
	
	
	public String toString()
	{
		return last4SSN + "";
	}
	
}