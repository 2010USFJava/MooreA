package com.revature.main;

import java.io.Serializable;

import com.revature.util.Files;
import com.revature.util.LogThis;
import com.revature.util.OrderList;

public class Order implements Serializable  {
	
	String name;
	int pizza;
	int breadsticks;
	int salad;
	int drink;
	
	
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
		LogThis.LogIt("info", "Customer , " + this.getName() + " has placed an order");
		
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public int getPizza() {
		return pizza;
	}
	public void setPizza(int pizza) {
		this.pizza = pizza;
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


	public int getDrink() {
		return drink;
	}
	public void setDrink(int drink) {
		this.drink = drink;
	}


	@Override
	public String toString() {
		return "Order [name=" + name + ", pizza=" + pizza + ", breadsticks=" + breadsticks + ", salad=" + salad
				+ ", drink=" + drink + "]";
	}
	
	
	
	

}
