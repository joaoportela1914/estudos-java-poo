package account_application;

import java.util.Locale;
import java.util.Scanner;

import account_entities.Account;

public class Main_account {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account = null;
		System.out.print("Enter account number: " );
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.nextLine();
		System.out.print("Is therena initial deposit (y/n)? ");
		String initalDeposit = sc.next();
		double value;
		if (initalDeposit.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble();
			account = new Account(accountNumber,accountHolder,value);
		}
		else{
			account = new Account(accountNumber,accountHolder);
		}
		
		System.out.println();
		System.out.println("Account data: ");;
		System.out.println("Account " + account.getAccountNumber() + ", " + " Holder: " + account.getAccountHolder() + ", "  + "Balance: " +"$"  + account.getValue());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		account.deposit(value = sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println("Account " + account.getAccountNumber() + ", " + "Holder: " + account.getAccountHolder() + ", " + "Balance: " +"$"  + account.getValue());
		
		System.out.println();
		System.out.print("Enter a withdraw value:");
		account.withdraw(value = sc.nextDouble());
		System.out.println("pdated account data:");
		System.out.println("Account " + account.getAccountNumber() + ", " + "Holder: " + account.getAccountHolder() + ", "  + "Balance: " +"$" + account.getValue());
		
		
		
		sc.close();
	}

}
