package com.revature.main;

import java.util.Scanner;
import com.revature.util.LogThis;
import com.revature.util.OrderList;

public class Menu {
	
	
	static  Scanner scan = new Scanner(System.in);
	
	
	public static void mainMenu() {
		System.out.println("Welcome to Pizza Mania!");
		System.out.println("\tEnter 1 to place order  ");
		System.out.println("\tEnter 2 to view order");
		System.out.println("\tEnter 3 to exit");
		
		
		int num=scan.nextInt();
		
		switch(num) {
		
		case 1:
			createOrder();
			break;
		case 2:
			viewOrder();
			break;
		case 3:
			System.out.println("Goodbye");
			break;
		default:
			System.out.println("invalid option, choose again");
			mainMenu();
			break;
			
		
		}
	}
	
	
	
		public static void createOrder() {
			
			
			System.out.println("Enter customer name");
			String name=scan.next();
			System.out.println("Enter number of pizzas");
			int pizza=Integer.parseInt(scan.next());
			System.out.println("Enter number of breadsticks");
			int breadsticks=Integer.parseInt(scan.next());
			System.out.println("Enter number of salads");
			int salad=Integer.parseInt(scan.next());
			System.out.println("Enter number of drinks");
			int drink=Integer.parseInt(scan.next());
			System.out.println("Thank you for placing an order " + name);
			
			
			Order custOrder = new Order(name, pizza, breadsticks, salad, drink) ;
			//LogThis.LogIt("info", custOrder.getName() + "placed an order") ;
			System.out.println(OrderList.orderList.toString());
			System.out.println("***********");
			
		
			System.out.println("would you like to place another order? (y/n)");
			String answer=scan.nextLine();
				switch(answer.toLowerCase()) {
				case "y":
					createOrder();
					break;
				case "n":
					System.out.println("Thank you for your order");
					break;
				default:
					System.out.println("Invalid answer");
					
					mainMenu();
				}
				
			
			
			}
	
	
		public static void viewOrder() {
			
			System.out.println("Enter name order was placed under");
			String custName=scan.next();
			
			Order custOrder = OrderList.findOrderByName(custName);
			
			System.out.println(custOrder);
			mainMenu();
			
		
		}
		
		
		
	}

