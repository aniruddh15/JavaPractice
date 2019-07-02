

import java.util.Date;

public class Account {

   // Declaring the variables of the object's identity
   int id;
   double balance;
   double annualInterestRate;
   private Date dateCreated;
   
   // No-Arg Constructor
   public Account() {
      id = 0;
      balance = 0;
      annualInterestRate = 0;
      dateCreated = new Date();
   }
   
   // Argument Constructor
   Account(int newId, double newBalance) {
      id = newId;
      balance = newBalance;
      dateCreated = new Date();
   }
   
   // Set Methods for the Object
   public void setId(int newId) {
      id = newId;
   }
   
   public void setBalance(double newBalance) {
      balance = newBalance;
   }
   
   public void setAnnualInterestRate(double newAnnualInterestRate) {
      annualInterestRate = newAnnualInterestRate;
   }
   
   // Get Methods for the Object
   public int getId() {
      return id;
   }

   public double getBalance() {
      return balance;
   }

   public double getAnnualInterestRate() {
      return annualInterestRate;
   }
   
   // Create the date
   public String dateCreator(){
      return dateCreated.toString();
   }
   
   // Calculating interest rates
   public double getMonthlyInterestRate() {
      return annualInterestRate / 12;
   }
   
   public double getMonthlyInterest() {
      return balance * (getMonthlyInterestRate() / 100);
   }
   
   public void withdraw(double amount) {
      balance = balance - amount;
   }
   
   public void deposit(double amount) {
      balance = balance + amount;
   }
   
   // A toString Method to print the results
   public String toString() {
      return ("Account ID:        " + id +
                       "\n" + "Account balance:   " + getBalance() +
                       "\n" + "Interest Rate:     " + getAnnualInterestRate() + "%" +
                       "\n" + "Date Opened:       " + dateCreator());
   }
                       

}

