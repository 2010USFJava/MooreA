package com.revature.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.bank.Account;
import com.revature.bank.Customer;
import com.revature.bank.Employee;
import com.revature.bank.Transactions;
import com.revature.bank.User;

public class Files {
	
	public static final String customerFile="customerList.txt";
	public static final String accountFile="accountList.txt";
	public static final String employeeFile="employeeList.txt";
	public static final String transFile="transList.txt";
	public static final String userFile="userList.txt";
	
	
	
	public static void writeCustomerFile(List<Customer> custList) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream (new FileOutputStream(customerFile));
			objectOut.writeObject(custList);
			objectOut.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}


	
	@SuppressWarnings({ "unchecked", "resource" })
	public static void readCustomerFile() {
		
		try {
			
			ObjectInputStream objectIn= new ObjectInputStream(new FileInputStream(customerFile));
			try {
				Lists.customerList =(ArrayList<Customer>) objectIn.readObject();
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	public static void writeAccountFile(List<Account> acctList) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream (new FileOutputStream(accountFile));
			objectOut.writeObject(acctList);
			objectOut.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}


	
	@SuppressWarnings("unchecked")
	public static void readAccountFile() {
		
		try {
			@SuppressWarnings("resource")
			ObjectInputStream objectIn= new ObjectInputStream(new FileInputStream(accountFile));
			try {
				Lists.accountList =(ArrayList<Account>) objectIn.readObject();
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	public static void writeEmployeeFile(List<Employee> empList) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream (new FileOutputStream(employeeFile));
			objectOut.writeObject(empList);
			objectOut.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}


	
	@SuppressWarnings("unchecked")
	public static void readEmployeeFile() {
		
		try {
			@SuppressWarnings("resource")
			ObjectInputStream objectIn= new ObjectInputStream(new FileInputStream(employeeFile));
			try {
				Lists.employeeList =(ArrayList<Employee>) objectIn.readObject();
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	
	public static void writeTransactionsFile(List<Transactions> tranList) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream (new FileOutputStream(transFile));
			objectOut.writeObject(tranList);
			objectOut.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}


	
	@SuppressWarnings("unchecked")
	public static void readTransactionsFile() {
		
		try {
			@SuppressWarnings("resource")
			ObjectInputStream objectIn= new ObjectInputStream(new FileInputStream(transFile));
			try {
				Lists.transList =(ArrayList<Transactions>) objectIn.readObject();
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
			
	}
	
	public static void writeUserFile(List<User> uList) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream (new FileOutputStream(userFile));
			objectOut.writeObject(uList);
			objectOut.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}


	
	@SuppressWarnings("unchecked")
	public static void readUserFile() {
		
		try {
			@SuppressWarnings("resource")
			ObjectInputStream objectIn= new ObjectInputStream(new FileInputStream(userFile));
			try {
				Lists.userList =(ArrayList<User>) objectIn.readObject();
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
