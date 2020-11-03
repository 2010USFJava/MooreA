package com.revature.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.main.Order;


public class Files {
	
	public static final String orderFile="orderList.txt";

	//write method
	public static void writeOrderFile(List<Order> orderList) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream (new FileOutputStream(orderFile));
			objectOut.writeObject(orderList);
			objectOut.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	//read method
	
	@SuppressWarnings("unchecked")
	public static void readOrderFile() {
		
		try {
			ObjectInputStream objectIn= new ObjectInputStream(new FileInputStream(orderFile));
			try {
				OrderList.orderList =(ArrayList<Order>) objectIn.readObject();
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}