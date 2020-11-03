package com.revature.driver;

import com.revature.main.Menu;
import com.revature.util.Files;

public class Driver {
	
	static {Files.readOrderFile();}

	public static void main(String[] args) {
		
		Menu.mainMenu();
	
	

	}

}
