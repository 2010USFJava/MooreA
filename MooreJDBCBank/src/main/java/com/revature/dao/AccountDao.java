package com.revature.dao;

import java.sql.SQLException;

public interface AccountDao {
	
	
	public void viewAccount() throws SQLException;
	//public void closeAccount()throws SQLException;
	//public void deleteAccount()throws SQLException;
	public  boolean matchUnameNPass() throws SQLException;
	
	public void showBalance(String cusername) throws SQLException ;
	public void depositMoney(String cusername) throws SQLException;
	public boolean withdrawMoney(String cusername) throws SQLException;
	public int createAccountNum(String username) throws SQLException;
	
	public void custSignIn() throws SQLException;
	
	void custSignOut(String username) throws SQLException;
}


//close



//delete



//view
