package com.revature.bank;

import java.io.Serializable;

import com.revature.util.Files;
import com.revature.util.Lists;
import com.revature.util.LogThis;
import com.revature.menu.*;


public class Account implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2158840141977831459L;
	
	
	public static  String open;
	public static  String close;
	public static String status;
	
	
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
	
		public static  void openAccount() {
			Customer.getUsername();
			
			//if(username)
		}
		
		public static void  getAcctStatus(){
			
		}

		public static void closeAccount() {
			
		}
		public static void denyAccount() {
			
		}

		public static void approveAccount() {
			
		}
		
		public static void cancelAccount() {
			
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



