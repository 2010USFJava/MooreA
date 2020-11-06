package com.revature.test;

import com.revature.bank.enums.UserType;

public class UserTest {
	

	 static UserType user;
	
	 public static void getUserType() {
		
		switch(user) {
		
		case CUSTOMER:
			System.out.println("Customer ");
			break;
		case EMPLOYEE:
			System.out.println("employee");
			break;
		case ADMIN:
			System.out.println("admin");
			break;
		default:
			System.out.println("invalid user");
		}
	
		
	}

}
