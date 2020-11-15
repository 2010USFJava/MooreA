package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Customer;

public interface CustomerDao  {
	
	public void createCustomer(Customer c) throws SQLException;
	public boolean checkUsermameDup(String cusername) throws SQLException;
	public  boolean matchUnameNPass(String cusername, String cpassword) throws SQLException;
	public List<Customer> getAllCustomers() throws SQLException;
	
	

}
