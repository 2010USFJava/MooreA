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
	
	
	public static float balance;
	public  static float deposit;
	public static float withdraw;
	public static float transfer;

	public static float transaction;
	
	static Scanner scan = new Scanner(System.in);
	double money=scan.nextDouble();
	Transactions trans= new Transactions();
	
	public Transactions() {
		Lists.transList.add(this);
		Files.writeTransactionsFile(Lists.transList);
		
	}

	
	public Transactions(float balance, float deposit, float withdraw, float transfer,
			 float transaction) {
		super();
		
		Transactions.balance = balance;
		Transactions.deposit = deposit;
		Transactions.withdraw = withdraw;
		Transactions.transfer = transfer;
		Transactions.transaction=transaction;
		Lists.transList.add(this);
		Files.writeTransactionsFile(Lists.transList);
		LogThis.LogIt("info" , " Transaction: " + getTransaction() +  " was ......");
	}


	public static  void applyForAccount() {
		Customer.getAccountNum();
		System.out.println(Customer.accountNum + " accountNum");
		System.out.println("hello, "+ Customer.username);
		System.out.println("Thank you, we will notify you of our decision");
		LogThis.LogIt("info" , " Transaction: " + getTransaction() +  " was made");
		Menu.accountTrans();
		
	}
	
	public static void closeAccount() {
		Customer.getAccountNum();
		System.out.println(Customer.getUsername());
		System.out.println(getBalance());
		System.out.println(balance);
		transaction=balance-withdraw;
		System.out.println("account was closed: balance is 0");
		LogThis.LogIt("info",  " Username; " + Customer.username + " account is closed");
		
	}

	public static void checkBalance() {
		
		Customer.getAccountNum();
		getBalance();
		System.out.println(balance);
		
		LogThis.LogIt("info",  "balance is: " + balance);
		
		Menu.accountTrans();
	}

	public static void depositMoney() {
		Customer.getAccountNum();
		getBalance();
		System.out.println(" balance: $ " + balance+ "Enter deposit amount:  ");
		 deposit=scan.nextInt();
		transaction =balance+deposit;
		setBalance(transaction);
	
		LogThis.LogIt("info", "Current balance: $ " +  transaction  );
		LogThis.LogIt("info" , " Transaction: " + getTransaction() +  " was deposited");
		
		Menu.accountTrans();
		
	}

	public static  void withdrawMoney() {
		Customer.getAccountNum();
		getBalance();
		System.out.println("Balance: $  " + balance + "  Enter Withdrawal amount: ");
		withdraw=scan.nextInt();
		
			if(withdraw<=balance ) {
				transaction= balance-withdraw;
				
			LogThis.LogIt("info", "withdrawl amount: $ " + withdraw );
			LogThis.LogIt("info", "Current balance: $ " + transaction);
			LogThis.LogIt("info" , " Transaction: " + getTransaction() +  " was withdrawn");
			setBalance(transaction);
			Menu.accountTrans();
		}else {
			LogThis.LogIt("info","Insufficient Funds" );
			LogThis.LogIt("info", "Current balance: $ " + balance + "return to transaction window");
			
			Menu.accountTrans();
		}
			
		
		
	}
	
	public static void transferMoney() {
		// if more than one account ask for account number, if match key to value then get amount
		Customer.getAccountNum();
		getBalance();
		//String sending;
		//String recieving;
		
		
		System.out.println("balance $  " + balance );
		LogThis.LogIt("info", "account number: " + Customer.accountNum);
		float outNum=scan.nextFloat();
		LogThis.LogIt("info", "Transfer: $" + outNum+ " from account number: " + Customer.accountNum);
		
		
		if(outNum<=balance) {
			transaction=balance-outNum;
			getBalance();
			LogThis.LogIt("info", "transfer: $  " + outNum+ "from account number " + Customer.accountNum);
			LogThis.LogIt("info", "Current balance: " + transaction);
			LogThis.LogIt("info" , " Transaction: " + getTransaction() +  " was transfered");
			
		}else {
			LogThis.LogIt("info", "Insufficient Funds");
			LogThis.LogIt("info", "Current balance: " + balance + "return to transaction menu");
			Menu.accountTrans();
			
			
			System.out.println("Transfer to account number : ");
			outNum=scan.nextInt();
			getBalance();
			float trans=balance+outNum;
			LogThis.LogIt("info", " Account number: " + Customer.accountNum + " received a deposit of: $ " + outNum);
			LogThis.LogIt("info", "Current balance: " + trans);
			setBalance(trans);
			Menu.accountTrans();
		}
		
	}
	

	public static float getBalance() {
		return balance;
	}
	public static void setBalance(float balance) {
		Transactions.balance = balance;
	
	}


	public float getDeposit() {
		return deposit;
	}
	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}



	public static float getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(float withdraw) {
		this.withdraw = withdraw;
	}



	public static float getTransfer() {
		return transfer;
	}
	public void setTransfer(float transfer) {
		this.transfer = transfer;
	}


	public static float getTransaction() {
		return transaction;
	}
	public void setTransaction(float transaction) {
		this.transaction=transaction;
	}

}
