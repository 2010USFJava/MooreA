package com.revature.driver;

import com.revature.menu.Menu;
import com.revature.util.Files;

public class Driver implements GetUser{

	static {Files.readCustomerFile();}
	static {Files.readUserFile();}
	static {Files.readEmployeeFile();}
	static {Files.readTransactionsFile();}
	static {Files.readAccountFile();}
	

    public static void main(String[] args) {
    	Menu.mainMenu();
    	
    		

	
}
}