package com.revature.util;

import java.util.ArrayList;
import java.util.List;
import com.revature.main.Menu;
import com.revature.main.Order;


public class OrderList {
	
	public static List<Order> orderList= new ArrayList<Order>();
	

	public static Order findOrderByName(String inputName) {
		
		for (int i = 0; i < orderList.size(); i++) {
			String name = orderList.get(i).getName();
			if(inputName.equals(name)) {
				return orderList.get(i);
			}
			
		}
		
		System.out.println("customer not found");
		Menu.mainMenu();
		return null;
	}
}


