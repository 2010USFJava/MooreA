package com.revature.dao;

import java.sql.SQLException;

import com.revature.beans.Employee;

public interface EmployeeDao {
	
	
	public void empSignOut() throws SQLException;
	public void empMenu() throws SQLException;
	public void empSignIn() throws SQLException;
	

}
