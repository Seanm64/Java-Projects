public class Account {
	private int money, secretCounter, last4SSN;
	private double interestRate;
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

	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return last4SSN + "";
	}
	
}