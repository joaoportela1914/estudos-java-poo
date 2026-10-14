package Exceptions_application;

import java.util.Locale;
import java.util.Scanner;

import Exceptions_entities.Account;

public class MainAccount {
	public static void main(String[] args) throws Exception {
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
      try {
 
        System.out.println("Enter acount data:");
        System.out.print("Number:");
        int number =sc.nextInt();
        System.out.print("Holder:");
        sc.next();
        String holder = sc.next();
        System.out.print("Initial balance:");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit:");
        double withdrawLimit = sc.nextDouble();
        Account account = new Account(number, holder, balance, withdrawLimit);
        
        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
        System.out.print("New balance:" + account.getBalance() );
      }
      catch (Exception e) {
    	  System.out.println("Withdraw error:" + e.getMessage());
    	  
      }
        sc.close();
	}
}
