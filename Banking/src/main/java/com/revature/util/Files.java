package com.revature.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.banking.Account;
import com.revature.banking.Customer;
import com.revature.banking.Employee;
import com.revature.banking.Lists;
import com.revature.banking.Login;
import com.revature.banking.Menu;
import com.revature.banking.Transactions;
import com.revature.banking.User;


public class Files {
	
	public static final String customerFile="customerList.txt";
	public static final String accountFile="actList.txt";
	public static final String employeeFile="employeeList.txt";
	public static final String transFile="transList.txt";
	public static final String userFile="userList.txt";
	
	
	public static void writeCustomerFile(List<Customer> customerList) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream (new FileOutputStream(customerFile));
			objectOut.writeObject(customerList);
			objectOut.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}


	
	@SuppressWarnings("unchecked")
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
	
	
	public static void writeAccountFile(List<Account> accountList) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream (new FileOutputStream(accountFile));
			objectOut.writeObject(accountList);
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
	
	
	public static void writeEmployeeFile(List<Employee> employeeList) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream (new FileOutputStream(employeeFile));
			objectOut.writeObject(employeeList);
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

	
	public static void writeTransactionsFile(List<Transactions> transList) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream (new FileOutputStream(transFile));
			objectOut.writeObject(transList);
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
	
	public static void writeUserFile(List<User> userList) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream (new FileOutputStream(userFile));
			objectOut.writeObject(userList);
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
