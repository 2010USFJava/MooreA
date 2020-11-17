package com.revature.exceptions;

import java.sql.SQLException;

import com.revature.beans.Account;
import com.revature.dao.AccountDao;
import com.revature.daoimpl.AccountDaoImpl;

public class UsernamePasswordMismatchException extends RuntimeException  {
	static AccountDao acc= new AccountDaoImpl();
		public static void UsernamePasswordMismatchException () throws SQLException {
			
			 System.out.println("======================================");
			 System.out.println("invalid username or password, try agin");
			 System.out.println("======================================");
			acc.custSignIn();
		}

}
