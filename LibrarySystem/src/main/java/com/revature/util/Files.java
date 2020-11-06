package com.revature.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Customer;
import com.revature.beans.Library;



public class Files {
	
//public static final String libraryFile="libraryList.txt";
//public static final String customerFile="customerList.txt";	


//	
//	public static void writeCustomerFile(List<Customer> customerList) {
//		try {
//			ObjectOutputStream objectOut = new ObjectOutputStream (new FileOutputStream(customerFile));
//			objectOut.writeObject(customerList);
//			objectOut.close();
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//	}
//
//
//	
//	@SuppressWarnings("unchecked")
//	public static void readCustomerFile() {
//		
//		try {
//			@SuppressWarnings("resource")
//			ObjectInputStream objectIn= new ObjectInputStream(new FileInputStream(customerFile));
//			try {
//				Lists.customerList =(ArrayList<Customer>) objectIn.readObject();
//			} catch (ClassNotFoundException e) {
//				
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		
//	}
//	
//	public static void writeCustomerFile(List<Library> libraryList) {
//		try {
//			ObjectOutputStream objectOut = new ObjectOutputStream (new FileOutputStream(libraryFile));
//			objectOut.writeObject(libraryList);
//			objectOut.close();
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//	}
//
//
//	
//	@SuppressWarnings("unchecked")
//	public static void readLibraryFile() {
//		
//		try {
//			@SuppressWarnings("resource")
//			ObjectInputStream objectIn= new ObjectInputStream(new FileInputStream(libraryFile));
//			try {
//				Lists.libraryList =(ArrayList<Library>) objectIn.readObject();
//			} catch (ClassNotFoundException e) {
//				
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		
//	}
//	
//
}
