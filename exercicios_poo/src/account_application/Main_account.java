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
		System.out.print("Is there an initial deposit (y/n)? ");
		char initalDeposit = sc.next().charAt(0);
		double balance;
		if (initalDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			balance = sc.nextDouble();
			account = new Account(accountNumber,accountHolder,balance);
		}
		else{
			account = new Account(accountNumber,accountHolder);
		}
		
		System.out.println();
		System.out.println("Account data: ");;
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value:");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("pdated account data:");
		System.out.println(account);
		
		
		
		sc.close();
	}

}
