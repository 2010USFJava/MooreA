package com.revature.main;

import java.util.Scanner;

import com.revature.util.LogThis;
import com.revature.util.OrderList;

public class Menu {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void mainMenu() {
		
		System.out.println("Welcome to Pizza Mania");
		System.out.println("Enter 1 to place an order");
		System.out.println("Enter 2 to view an order");
		System.out.println("Enter 3 to exit");
		
		int num=scan.nextInt();
		
		switch(num) {
		
		case 1:
			createOrder();
			break;
		case 2:
			viewOrder();
			break;
		case 3:
			System.out.println("Have a nice day");
			break;
		default:
			System.out.println("Invalid choice");
			mainMenu();
			break;
		}
	}	
		
		public static void createOrder() {
			
			
			System.out.println("Enter the customer name");
			String name=scan.next();
			System.out.println("Enter number of pizza to order");
			int pizza = Integer.parseInt(scan.next());
			System.out.println("Enter number of breadsticks to order");
			int breadsticks = Integer.parseInt(scan.next());
			System.out.println("Enter number of salads to order");
			int salad= Integer.parseInt(scan.next());
			System.out.println("Enter number of drinks to order");
			int drink= Integer.parseInt(scan.next());
			System.out.println("Thank you for placing an order " + name);
			
			Order custOrder=new Order(name, pizza, breadsticks, salad, drink);
			LogThis.LogIt("info",  custOrder.getName() + " placed an order.");
			System.out.println(OrderList.orderList.toString());
			
			
			System.out.println("Would you like to place another order? (y/n)");
			String ans=scan.nextLine();
			switch(ans.toLowerCase()) {
			case "y":
				createOrder();
			case "n":
				System.out.println("Thank you for your order");
			default:
				System.out.println("invalid choice");
				mainMenu();
				break;
				
			
			
		}	
		}
		
		public static  void viewOrder() {
			
			System.out.println("Enter name order was placed under");
			String custName=scan.nextLine();
			Order custOrder = OrderList.findOrderByName(custName);
			System.out.println(custOrder);
			mainMenu();
			
	}
		


}
