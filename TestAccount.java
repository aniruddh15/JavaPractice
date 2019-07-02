

public class TestAccount {

	public static void main(String[] args) {
		Account acc = new Account(1532, 15400);
		SavingsAccount acc1 = new SavingsAccount(1154, 15000);
		CheckingsAccount acc2 = new CheckingsAccount(1100, 10000, 500);
		
		System.out.println(acc.toString());
		System.out.println("\n" + acc1.toString());
		System.out.println("\n" + acc2.toString());
	}

}
