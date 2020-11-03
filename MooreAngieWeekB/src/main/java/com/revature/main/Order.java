package com.revature.main;

import java.io.Serializable;
import java.util.Scanner;

import com.revature.util.Files;
import com.revature.util.LogThis;
import com.revature.util.OrderList;
import com.revature.main.Menu;


public class Order implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7149583495843619247L;
	
	private String name;
	private int pizza;
	private int  breadsticks;
	private int salad;
	private int drink;
	
	
	static Scanner sc = new Scanner(System.in);
	
	public Order() {
		super();
		OrderList.orderList.add(this);
		Files.writeOrderFile(OrderList.orderList);
		
	}


	public Order(String name, int pizza, int breadsticks, int salad, int drink) {
		super();
		this.name = name;
		this.pizza = pizza;
		this.breadsticks = breadsticks;
		this.salad = salad;
		this.drink = drink;
		
		OrderList.orderList.add(this);
		Files.writeOrderFile(OrderList.orderList);
		LogThis.LogIt("info",  "Customer , " + this.getName()  + " , has placed a new order.");
	}




	public int getPizza() {
		return pizza;
	}
	public void setPizza(int pizza) {
		this.pizza = pizza;
	}


	public int getDrink() {
		return drink;
	}
	public void setDrink(int drink) {
		this.drink = drink;
	}


	public int getBreadsticks() {
		return breadsticks;
	}
	public void setBreadsticks(int breadsticks) {
		this.breadsticks = breadsticks;
	}


	public int getSalad() {
		return salad;
	}
	public void setSalad(int salad) {
		this.salad = salad;
	}


	public  String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Order [name=" + name + ", pizza=" + pizza + ", breadsticks=" + breadsticks + ", salad=" + salad
				+ ", drink=" + drink + "]";
	}



}


