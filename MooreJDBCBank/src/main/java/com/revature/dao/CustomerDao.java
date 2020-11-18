package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Customer;

public interface CustomerDao  {
	
	public long createCustomer() throws SQLException;
	//public List<Customer> getAllCustomers() throws SQLException;
	
	public String checkDup() throws SQLException;


	
	

}
