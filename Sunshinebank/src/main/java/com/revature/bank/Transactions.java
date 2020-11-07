package com.revature.bank;

import java.io.Serializable;
import java.util.Scanner;

import com.revature.menu.Menu;
import com.revature.util.Files;
import com.revature.util.Lists;
import com.revature.util.LogThis;


public class Transactions implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1567602479221022768L;
	
	
	private static double balance;
	private static double deposit;
	private static double withdraw;
	private static double transfer;

	private static double transaction;
	
	static Scanner scan = new Scanner(System.in);
	double money=scan.nextDouble();
	Transactions trans= new Transactions();
	
	public Transactions() {
		Lists.transList.add(this);
		Files.writeTransactionsFile(Lists.transList);
		
	}

	
	public Transactions(double balance, double deposit, double withdraw, double transfer,
			 double transaction) {
		super();
		
		this.balance = balance;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.transfer = transfer;
		
		
		this.transaction=transaction;
		Lists.transList.add(this);
		Files.writeTransactionsFile(Lists.transList);
		LogThis.LogIt("info" , " Transaction: " + getTransaction() +  " was made");
	}

	public static void checkBalance() {
		Lists.findAccountByAccountNum(Customer.accountNum);
		
		System.out.println(balance);
		LogThis.LogIt("info",  "balance is: " + balance);
		Menu.accountTrans();
	}

	public static void depositMoney() {
		Lists.findAccountByAccountNum(Customer.accountNum);
		
		System.out.println("Enter deposit amount:  ");
		double money=scan.nextInt();
		deposit=money;
		transaction=balance+deposit;
		System.out.println("current balance " + transaction);
		LogThis.LogIt("info", "Current balance: " +  transaction  );
		
		Menu.accountTrans();
		
	}

	public static  void withdrawMoney() { 
		Lists.findAccountByAccountNum(Customer.accountNum);
		
		System.out.println("Enter Withdrawal amount: ");
		double money=scan.nextInt();
		money=withdraw;
			if(withdraw<=balance) {
				transaction= balance-withdraw;
				
			LogThis.LogIt("info", "withdrawl amount: " + withdraw );
			LogThis.LogIt("info", "Current balance: " + transaction);
			
		}else {
			LogThis.LogIt("info","Insufficient Funds" );
			LogThis.LogIt("info", "Current balance: " + balance + "return to transaction window");
			
			Menu.accountTrans();
		}
			
		
		
	}
	
	public static void transferMoney() {
		// if more than one account ask for account number, if match key to value then get amount
		Customer.getAccountNum();
		LogThis.LogIt("info", "account number: " + Customer.accountNum);
		getBalance();
		System.out.println("Transfer from account number : ");
		int accountNum;
		System.out.println("Transfer amount:");
		double money=scan.nextInt();
		money=transfer;
		if(transfer<=balance) {
			LogThis.LogIt("info", "You transfered: " + transfer);
			LogThis.LogIt("info", "Current balance: " + balance);
			
		}else {
			LogThis.LogIt("info", "Insufficient Funds");
			LogThis.LogIt("info", "Current balance: " + balance + "return to transaction menu");
			
			Menu.accountTrans();
		}
		
	}
	

	public static double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}



	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}



	public static double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}



	public static double getTransfer() {
		return transfer;
	}
	public void setTransfer(double transfer) {
		this.transfer = transfer;
	}


	public double getTransaction() {
		return transaction;
	}
	public void setTransaction() {
		this.transaction=transaction;
	}

}
