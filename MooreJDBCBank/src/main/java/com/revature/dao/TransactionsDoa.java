package com.revature.dao;

import java.sql.SQLException;

import com.revature.beans.Customer;
import com.revature.exceptions.OverLimitException;

public interface TransactionsDoa {
	
	public void depositMoney(String cusername) throws SQLException ;
	public boolean withdrawMoney(String cusername) throws OverLimitException, SQLException ;
	public void showBalance(String cusername) throws SQLException ;
	public void transMenu() throws SQLException ;
}
