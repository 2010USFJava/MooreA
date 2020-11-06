package com.revature.test;

import com.revature.bank.enums.accountType;


public class accountTest {
	
	     static accountType type;
		
		public accountTest(accountType type) {
			accountTest.type=type;
		}
		
		
		 public static void getAccountType() {
				
				switch(type) {
				
				case IND:
					System.out.println("Individual account ");
					break;
				case JOINT:
					System.out.println("joint account");
					break;
				
				default:
					System.out.println("invalid account type");
				}
			
			
		}
		 

//	        accountTest t1 = new accountTest(accountType.IND); 
//	        t1.getAccountType();

}

