

public class CheckingsAccount extends Account {
	
	double overdraftLimit; // 500 is made up number, I just came up with an overdraft limit
	double amountWithdrawn = 0;
	
	// No arg constructor
	public CheckingsAccount() {
		super();
	}
	
	// Arg constructor that sends id and balance to super class
	public CheckingsAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	// Withdraw from account method
	public void withdraw(double amount) {
		if(amount < getBalance() + overdraftLimit) {
			setBalance(balance - amount);
			amount = amountWithdrawn;
		}
		else {
			System.out.println("Error. You can not withdraw an amount greater than your balance");
		}
	}
	
	@Override
	public String toString()
	{
	    String s = super.toString();
	    s += "\nAmount Withdrawn:  " + amountWithdrawn;
	    return s;
	}

}
