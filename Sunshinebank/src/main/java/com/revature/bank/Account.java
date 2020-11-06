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
	
	
	private String open;
	private String close;
	private String status;
	
	
	public Account() {
		
		Lists.accountList.add(this);
		Files.writeAccountFile(Lists.accountList);
	}

	public Account(String open, String close, String status) {
		super();
		this.open = open;
		this.close = close;
		this.status=status;
		

		Lists.accountList.add(this);
		Files.writeAccountFile(Lists.accountList);
		LogThis.LogIt("info", "Account was opened/ closed" );
		
	}
	
		public static  void openAccount() {
			Customer.getUsername();
			for (String key: map.keySet() );
				Customer customer = map.get(key):
		}
		
//	public String accountStatus() {
//		if(status==close) {
//			
//		}
//	}
//	
	

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
	
	public String getSatus() {
		return status;
	}
	public void setSatus() {
		this.status=status;
	}
	

	@Override
	public String toString() {
		return "Account [open=" + open + ", close=" + close + "]";
	}
	

}
/* check for overdrawn accounts or
 *  inputting negative amounts
 */



