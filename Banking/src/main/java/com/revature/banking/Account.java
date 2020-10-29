package com.revature.banking;

import java.util.Random;
import java.util.Scanner;

public class Account {
	
	public static  int acctNum;
	private String open;
	private String close;
	private double balance;
	private String checking;
	private String savings;
	private String ind;
	private String joint;
	private String actType;
	
	

	Scanner in = new Scanner(System.in);
	double amt=in.nextDouble();
	static Account act = new Account();
	
	public Account() {
	
	}

		public Account(String open, String close, double balance, String checking, String savings, String ind,
				String joint, String actType, Scanner in, double amt, Account act) {
			super();
			this.open = open;
			this.close = close;
			this.balance = balance;
			this.checking = checking;
			this.savings = savings;
			this.ind = ind;
			this.joint = joint;
			this.actType = actType;
			this.in = in;
			this.amt = amt;
			Account.act = act;
		}



		public static void createAccountNum() {
			Random random = new Random();
			acctNum=random.nextInt(2000);
		}
		
		
		
		public void displayAcct() {
			System.out.println(acctNum+ actType+ balance);
		}
		
		
		
		public void acctBalance() {
			System.out.println("Account balance: " + balance);
		}
		
		public void getAcctType() {
			if(actType==checking) {
				System.out.println("individual or joint ");
				if(actType==ind) {
					
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



	public static Account getAct() {
		return act;
	}
	public void setAct(Account act) {
		this.act = act;
	}

	public String actType() {
		return actType;
	}
	public void setAcctType(String actType) {
		this.actType = actType;
	}



	@Override
	public String toString() {
		return "Account [open=" + open + ", close=" + close + ", balance=" + balance + ", checking=" + checking
				+ ", savings=" + savings + ", ind=" + ind + ", joint=" + joint + ", actType=" + actType + ", in=" + in
				+ ", amt=" + amt + ", act=" + act + "]";
	}



	


}
/* check for overdrawn accounts or
 *  inputting negative amounts
 */
