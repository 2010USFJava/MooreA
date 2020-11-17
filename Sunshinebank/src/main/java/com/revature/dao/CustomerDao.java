package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.bank.Customer;

public interface CustomerDao {

	List<Customer> getAllCustomers() throws SQLException;

	long createCust(List<Customer> newCust) throws SQLException;

}