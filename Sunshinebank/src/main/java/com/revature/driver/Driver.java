package com.revature.driver;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.bank.Customer;
import com.revature.dao.impl.CustomerDaoImpl;

public class Driver {

	public static void main(String[] args) throws SQLException {

		// Menu.mainMenu();

//		UserDao dao = new UserDaoImpl();
//		try {
//			dao.findAccountById(1);
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

		CustomerDaoImpl cu = new CustomerDaoImpl();
		List<Customer> newcust = new ArrayList();
		newcust.add(new Customer());
		long id = cu.createCust(newcust);

	}

}
