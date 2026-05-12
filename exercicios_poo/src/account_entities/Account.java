package account_entities;

public class Account {
		private int accountNumber;
		private String accountHolder;
		private double balance;
		public static final int tax = 5;
		
		public Account(int accountNumber, String accountHolder, double initialDeposit) {
			this.accountNumber = accountNumber;
			this.accountHolder = accountHolder;
			deposit(initialDeposit);
		}

		public Account(int accountNumber, String accountHolder) {
			this.accountNumber = accountNumber;
			this.accountHolder = accountHolder;
		}
		public int getAccountNumber() {
			return accountNumber;
		}

		public double getBalance() {
			return balance;
		}

		public String getAccountHolder() {
			return accountHolder;
		}
		
		public void setAccountHolder(String accountHolder) {
			this.accountHolder = accountHolder;
		}
		
		public void deposit(double amount) {
			balance += amount;
		}
		
		public void withdraw(double amount) {
			balance -= amount + tax;
			
		}
		public String toString() {
			return "Account "
					+ accountNumber
					+ ", Holder: "
					+ accountHolder
					+ ", Balance: $ "
					+ String.format("%.2f", balance);
		}
				
}
