package com.revature.beans;

import java.io.Serializable;
import java.time.LocalDate;


public class Library implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9092509518944273911L;
	
	public String bookTitle;
	public String customerName;
	static LocalDate checkoutDate;
	static LocalDate dueDate ;
	
	
	public Library() {
		super();
		
	}


	public Library(String bookTitle, String customerName, LocalDate checkoutDate, LocalDate dueDate) {
		super();
		this.bookTitle = bookTitle;
		this.customerName = customerName;
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
	}


	
	public static void checkoutDate() {
		
		
		 LocalDate checkout = LocalDate.now(); 
		    System.out.println(checkout); 
	}
	
	
	public static void dueDate() {
		
		LocalDate dueDate = LocalDate.now() ;
		//dueDate + 14 days;
	}
	
	
	

	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(LocalDate checkoutDate) {
		this.checkoutDate = checkoutDate;
	}


	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}


	@Override
	public String toString() {
		return "Library [bookTitle=" + bookTitle + ", customerName=" + customerName + ", checkoutDate=" + checkoutDate
				+ ", dueDate=" + dueDate + "]";
	}
	
	
	
	
	

}




