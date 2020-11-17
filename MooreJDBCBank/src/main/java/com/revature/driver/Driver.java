package com.revature.driver;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.Account;
import com.revature.dao.AccountDao;
import com.revature.dao.CustomerDao;
import com.revature.dao.EmployeeDao;
import com.revature.daoimpl.AccountDaoImpl;
import com.revature.daoimpl.CustomerDaoImpl;
import com.revature.daoimpl.EmployeeDaoImpl;
import com.revature.menu.MainMenu;

public class Driver {
	
	
	public static void main (String[] args) throws SQLException {

		
		MainMenu.mainMenu();
	
}		
}