package bankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		 BankAccount acct1 = new BankAccount(400, 200);
	        BankAccount acct2 = new BankAccount(2475.75, 125.20);
	        BankAccount acct3 = new BankAccount(0, 0);
	        BankAccount acct4 = new BankAccount();

	        System.out.println("*******Bankers Bank*******");
	        System.out.println("Number of Bank Accounts: " + BankAccount.accountCount());
	        System.out.println("Total Bank Balance: $" + BankAccount.displayBankBalance());

	        System.out.println("\n<******Account 1******>");
	        acct1.displayAcctNum();
	        System.out.println("Savings Balance: $" + acct1.getSavingsBalance());
	        System.out.println("Checking Balance: $" + acct1.getCheckingBalance());
	        acct1.totalAcctBalance();

	        System.out.println("\n<******Account 2******>");
	        acct2.displayAcctNum();
	        System.out.println("Savings Balance: $" + acct2.getSavingsBalance());
	        System.out.println("Checking Balance: $" + acct2.getCheckingBalance());
	        acct2.totalAcctBalance();

	        System.out.println("\n<******Account 3******>");
	        acct3.displayAcctNum();
	        System.out.println("Savings Balance: $" + acct3.getSavingsBalance());
	        System.out.println("Checking Balance: $" + acct3.getCheckingBalance());
	        acct3.totalAcctBalance();
	        acct3.deposit("CHECKING", 1000);
	        acct3.deposit("checking", 1500);
	        acct3.totalAcctBalance();

	        System.out.println("\n<*****Account 4******>");
	        acct4.displayAcctNum();
	        System.out.println("Savings Balance: $" + acct4.getSavingsBalance());
	        System.out.println("Checking Balance: $" + acct4.getCheckingBalance());
	        acct4.totalAcctBalance();
	        acct4.withdrawal("checking", 500);

		

	}

}
