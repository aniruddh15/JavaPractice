

public class SavingsAccount extends Account {
	
	// Data fields
	double overdraftLimit = 0;	// Savings account does not have an overdraft limit
	double amountWithdrawn = 0;
	
	// no arg constructor
	public SavingsAccount() {
		super();
	}
	
	// constructor that sends id and balance to super class
	public SavingsAccount(int id, double newBalance) {
		super(id, newBalance);	// Sends id and balance to superclass
	}
	
	// withdraw from balance
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
