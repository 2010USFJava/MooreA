package com.revature.banking;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

import com.revature.util.Files;

public class Account  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5638897595989459355L;
	
	
	public static  int acctNum;
	private String open;
	private String close;
	private double balance;
	private String checking;
	private String savings;
	private String ind;
	private String joint;
	private String accountType;
	
	

	Scanner in = new Scanner(System.in);
	double amt=in.nextDouble();
	static Account account = new Account();
	
	public Account() {
		Lists.accountList.add(this);
		Files.writeAccountFile(Lists.accountList);
	}
	
	

		public Account(String open, String close, double balance, String checking, String savings, String ind,
				String joint, String accountType, Scanner in, double amt, Account act) {
			super();
			this.open = open;
			this.close = close;
			this.balance = balance;
			this.checking = checking;
			this.savings = savings;
			this.ind = ind;
			this.joint = joint;
			this.accountType = accountType;
			this.in = in;
			this.amt = amt;
			
			Lists.accountList.add(this);
			Files.writeAccountFile(Lists.accountList);
		}



		public static void createAccountNum() {
			Random random = new Random();
			acctNum=random.nextInt(2000);
		}
		
		
		
		public void displayAcct() {
			System.out.println(acctNum+ accountType+ balance);
		}
		
		
		
		public void acctBalance() {
			System.out.println("Account balance: " + balance);
		}
		
		public void getAccountType() {
			if(accountType==checking) {
				System.out.println("individual or joint ");
				if(accountType==ind) {
					
				}
			}
			
			
		}
		
		
		
	public int getAcctNum() {
		return acctNum;
	}
	public void setAcctNum(int acctNum) {
		Account.acctNum = acctNum;
	}



	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}



	public String getClose() {
		return close;
	}
	public void setClose(String close) {
		this.close = close;
	}



	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}



	public String getChecking() {
		return checking;
	}
	public void setChecking(String checking) {
		this.checking = checking;
	}



	public String getSavings() {
		return savings;
	}
	public void setSavings(String savings) {
		this.savings = savings;
	}



	public String getInd() {
		return ind;
	}
	public void setInd(String ind) {
		this.ind = ind;
	}



	public String getJoint() {
		return joint;
	}
	public void setJoint(String joint) {
		this.joint = joint;
	}




	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}



	public static Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		Account.account = account;
	}

	public String accountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}



	@Override
	public String toString() {
		return "Account [open=" + open + ", close=" + close + ", balance=" + balance + ", checking=" + checking
				+ ", savings=" + savings + ", ind=" + ind + ", joint=" + joint + ", actType=" + accountType + ", in=" + in
				+ ", amt=" + amt + ", act=" + account + "]";
	}



	


}
/* check for overdrawn accounts or
 *  inputting negative amounts
 */
