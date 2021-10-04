package bankAccount;

import java.util.Random;

// Create a BankAccount class.
// The class should have the following attributes: (string) account number, (double) checking balance, (double) savings balance.
// Create a class member (static) that has the number of accounts created thus far
// Create a class member (static) that tracks the total amount of money stored in every account created

public class BankAccount {
	 private String acctNumber;
	    private double checkingBalance;
	    private double savingsBalance;
	    private static int numAcctsCreated = 0;
	    private static double totalBankBalance = 0;
	    
// Create a private method that returns a random ten digit account number.
	    private static String generateAcctNum() {
	        Random r = new Random();
	        String acctNumber = "";
	        for(int i = 0; i < 10; i++) {
	            acctNumber += (r.nextInt(10));
	        }
	        return acctNumber;
	    }
	    
// In the constructor, call the private method from above so that each user has a random ten digit account.
// In the constructor, be sure to increment the account count
// Create a getter method for the user's checking account balance
// Create a getter method for the user's saving account balance.
	    public BankAccount() {
	        numAcctsCreated++;
	        this.acctNumber = generateAcctNum();
	        this.checkingBalance = 0;
	        this.savingsBalance = 0;
	    }
	    

	    public BankAccount(double savings, double checking) {
	        numAcctsCreated++;
	        this.acctNumber = generateAcctNum();
	        this.savingsBalance = savings;
	        this.checkingBalance = checking;
	        totalBankBalance += (savings + checking);
	    }
	    
	    public double getCheckingBalance() {
	        return this.checkingBalance;
	    }

	    public double getSavingsBalance() {
	        return this.savingsBalance;
	    }

	    public void displayAcctNum() {
	        System.out.println("Account Number: " + this.acctNumber);
	    }
	    
// Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
	    public void deposit(String account, double amount) {
	        if(account == "savings"){
	            this.savingsBalance += amount;
	        } else if(account == "checking"){
	            this.checkingBalance += amount;
	            totalBankBalance += amount;
	        } else {
	            System.out.println("Invalid account type");
	        }
	    }
	    
// Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
	    public void withdrawal(String account, double amount) {
	        if(account == "savings"){
	            if(amount > this.savingsBalance){
	                System.out.println("Insufficient funds");
	            } else {
	                this.savingsBalance -= amount;
	                totalBankBalance -= amount;
	            }
	        } else if(account == "checking") {
	            if(amount > this.checkingBalance){
	                System.out.println("Insufficient funds");
	            } else {
	                this.checkingBalance -= amount;
	                totalBankBalance -= amount;
	            }
	        } else {
	            System.out.println("Invalid account type");
	        }
	    }
	    
// Create a method to see the total money from the checking and saving
	    public void totalAcctBalance() {
	        double totalAcctBalance = this.savingsBalance + this.checkingBalance;
	        System.out.println("Total Account Balance: $" + totalAcctBalance);
	    }
	    
// Users should not be able to set any of the attributes from the class
	    public static int accountCount() {
	        return numAcctsCreated;
	    }

	    public static double displayBankBalance() {
	        return totalBankBalance;
	    }	    

}
