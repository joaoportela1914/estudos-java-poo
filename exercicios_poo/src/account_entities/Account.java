package account_entities;

public class Account {
		private int accountNumber;
		private String accountHolder;
		private double value;
		public static final int tax = 5;
		
		public Account(int accountNumber, String accountHolder, double value) {
			this.accountNumber = accountNumber;
			this.accountHolder = accountHolder;
			this.value = value;
		}

		public Account(int accountNumber, String accountHolder) {
			this.accountNumber = accountNumber;
			this.accountHolder = accountHolder;
		}
		public int getAccountNumber() {
			return accountNumber;
		}

		public double getValue() {
			return value;
		}

		public String getAccountHolder() {
			return accountHolder;
		}
		
		public void setAccountHolder(String accountHolder) {
			this.accountHolder = accountHolder;
		}
		
		public void deposit(double value) {
			this.value+= value;
		}
		
		public void withdraw(double value) {
			this.value-= value + tax;
			
		}
				
}
