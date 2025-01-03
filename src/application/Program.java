package application;

import java.util.Locale;
import java.util.Scanner;

import model.entitie.Account;
import model.exception.DomainAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
	   try {
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		acc.deposit(amount);
		acc.withdraw(amount);
	  }
	  catch(DomainAccount e) {
		System.out.println("Withdraw error: "+ e.getMessage());
	  }
	   catch (Exception e) {
           System.out.println("Unexpected error: " + e.getMessage());
	   }
		finally {
			sc.close();
		}
	}

}
