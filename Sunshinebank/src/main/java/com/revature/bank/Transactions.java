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

	private static float transaction;
	
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
		
		this.balance = balance;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.transfer = transfer;
		this.transaction=transaction;
		Lists.transList.add(this);
		Files.writeTransactionsFile(Lists.transList);
		LogThis.LogIt("info" , " Transaction: " + getTransaction() +  " was made");
	}


	public static  void applyForAccount() {
		Lists.findAccountNum();
		System.out.println(Customer.accountNum + " accountNum");
		System.out.println("hello, "+ Customer.username);
		System.out.println("Thank you, we will notify you of our decision");
		LogThis.LogIt("info",  " Username; " + Customer.username + "applied for account");
		Menu.accountTrans();
		
	}
	
	public static void closeAccount() {
		System.out.println(Customer.getUsername());
		System.out.println(getBalance());
		System.out.println(balance);
		transaction=balance-withdraw;
		System.out.println("account was closed: balance is 0");
		LogThis.LogIt("info",  " Username; " + Customer.username + " account is closed");
		
	}
	public static void checkBalance() {
		Lists.findAccountNum();
		
		System.out.println(balance);
		
		LogThis.LogIt("info",  "balance is: " + balance);
		LogThis.LogIt("info",  " Username; " + Customer.username + " checked balance: $  " + balance );
		Menu.accountTrans();
	}

	public static void depositMoney() {
		Lists.findAccountNum();
		getBalance();
		System.out.println(" balance: $ " + balance+ "Enter deposit amount:  ");
		 deposit=scan.nextInt();
		transaction =balance+deposit;
		setBalance(transaction);
		System.out.println("current balance $ " + transaction);
		LogThis.LogIt("info", "Current balance: $ " +  transaction  );
		
		Menu.accountTrans();
		
	}

	public static  void withdrawMoney() {
		Lists.findAccountNum();
		getBalance();
		System.out.println("Balance: $  " + balance + "  Enter Withdrawal amount: ");
		withdraw=scan.nextInt();
		
			if(withdraw<=balance ) {
				transaction= balance-withdraw;
				
			LogThis.LogIt("info", "withdrawl amount: $ " + withdraw );
			LogThis.LogIt("info", "Current balance: $ " + transaction);
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
		Lists.findAccountNum();
		getBalance();
		System.out.println("balance $  " + balance );
		LogThis.LogIt("info", "account number: " + Customer.accountNum);
		float outNum=scan.nextFloat();
		LogThis.LogIt("info", "Transfer: $" + outNum+ " from account number: " + Customer.accountNum);
		
		if(outNum<=balance) {
			transaction=balance-outNum;
			LogThis.LogIt("info", "transfer: $  " + outNum+ "from account number " + Customer.accountNum);
			LogThis.LogIt("info", "Current balance: " + transaction);
			
		}else {
			LogThis.LogIt("info", "Insufficient Funds");
			LogThis.LogIt("info", "Current balance: " + balance + "return to transaction menu");
			Menu.accountTrans();
			
			Lists.findAccountNum();
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


	public float getTransaction() {
		return transaction;
	}
	public void setTransaction(float transaction) {
		this.transaction=transaction;
	}

}
