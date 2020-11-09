package com.revature.bank;

import java.io.Serializable;
import java.util.Scanner;

import com.revature.util.Files;
import com.revature.util.Lists;
import com.revature.util.LogThis;
import com.revature.menu.*;


public class Account implements Serializable {
	
	
	
	private static final long serialVersionUID = 2158840141977831459L;
	
	static Account trans= new Account();
	
	public static  String open;
	public static  String close;
	public static String status;
	static Scanner scan = new Scanner(System.in);
	static Account account = new Account();
	
	public Account() {
		
		Lists.accountList.add(this);
		Files.writeAccountFile(Lists.accountList);
	}

	public Account(String open, String close, String status) {
		this.open=open;
		this.close=close;
		this.status=status;
		
		Lists.accountList.add(this);
		Files.writeAccountFile(Lists.accountList);
		LogThis.LogIt("info", "Account status is " );
	}
	
	
	

		public static  void OpenAccount() {
			Customer.getAccountNum();
			Customer.displayCustomerInfo();
			float openingbalance=0;
			
			System.out.println("How much is the initial deposit: ");
			float deposit=scan.nextFloat();
			float currentbalance=openingbalance+deposit;
			Transactions  newT = new Transactions();
			Transactions.setBalance(deposit);
			LogThis.LogIt("info",  " balance: $ " + currentbalance);
			Menu.accountTrans();
			
		}
		

		
		
		public static void denyAccount() {
			Customer.getAccountNum();
			
				System.out.println("account denied");
				LogThis.LogIt("info",  " Username; " + Customer.username + " account denied");
			}
		
		public static void approveAccount() {
			Customer.getAccountNum();
			System.out.println("account approved");
			LogThis.LogIt("info",  " Username; " + Customer.username + " account approved");
		}
		
		public static void cancelAccount() {
			Customer.getAccountNum();
			System.out.println("account was closed and cancelled");
			LogThis.LogIt("info",  " Username; " + Customer.username + " account was closed and cancelled");
		}

	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		Account.open = open;
	}

	public String getClose() {
		return close;
	}
	public void setClose(String close) {
		Account.close = close;
	}
	
	public String getSatus() {
		return status;
	}
	public void setSatus() {
		Account.status=status;
	}
	

	@Override
	public String toString() {
		return "Account [open=" + open + ", close=" + close + ", status=" + status +"]";
	}
	

}
/* check for overdrawn accounts or
 *  inputting negative amounts
 */



