package com.revature.banking;

import java.util.Scanner;

public class Customer {
	
	private String fName;
	private String lName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private int phone;
	private int ssn;
	private String email;
	private String username;
	private String pswd;
	private int acctNum;
	
	Scanner in = new Scanner(System.in);
	 String ans=in.nextLine();
	
	 Scanner scan = new Scanner(System.in);
		int option=scan.nextInt();
		
	Customer cust= new Customer();
	Account act=new Account();

	public Customer() {
		
	}

	public Customer(String fName, String lName, String address, String city, String state, int zip, int phone,
			int ssn, String email, String username, String pswd, int acctNum) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.ssn = ssn;
		this.email = email;
		this.username = username;
		this.pswd=pswd;
		this.acctNum=acctNum;
	}
	
		

	public Customer(String fName, String lName, String address, String city, String state, int zip, int phone, int ssn,
			String email, String username, String pswd, int acctNum, Scanner in, String ans, Scanner scan, int option,
			Customer cust) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.ssn = ssn;
		this.email = email;
		this.username = username;
		this.pswd = pswd;
		this.acctNum = acctNum;
		this.in = in;
		this.ans = ans;
		this.scan = scan;
		this.option = option;
		this.cust = cust;
	}

	public void createCustomer() {
		System.out.println("Enter username:");
		User reg = new User();
		
		ans=reg.getUsername();
		ans=in.nextLine();
		reg.setUsername(ans);
		Account.createAccountNum();
		ans=in.nextLine();
		
		System.out.println("Enter password");
		
		ans=reg.getUsername();
		reg.setPswd(ans);
		ans=in.nextLine();
		
		
		Customer customer= new Customer();
		System.out.println("Enter first name");
		
		ans=customer.getfName();
		customer.setfName(ans);
		in.nextLine();
		
		System.out.println("Enter last name");
		
		ans=customer.getlName();
		customer.setlName(ans);
		in.nextLine();
		
		System.out.println("Enter address");
		
		ans=customer.getAddress();
		customer.setAddress(ans);
		in.nextLine();
		
		System.out.println("Enter city");
		ans=customer.getCity();
		customer.setCity(ans);
		in.nextLine();
		
		System.out.println("Enter state");
		ans=customer.getState();
		customer.setState(ans);
		in.nextLine();
		
		System.out.println("Enter zip code");
		option=customer.getZip();
		customer.setZip(option);
		in.nextLine();
		
		System.out.println("Enter you social security number");
		option=customer.getSsn();
		customer.setSsn(option);
		in.nextLine();
		
		System.out.println("Enter phone");
		option=customer.getPhone();
		customer.setPhone(option);
		in.nextLine();
		
		System.out.println("Enter an email");
		ans=customer.getEmail();
		customer.setEmail(ans);
		
		
		
	}
	

	public void displayCustomerInfo() {
		System.out.println(fName +lName +address +city+state+ zip+ phone+ssn+email+ username+acctNum );
	}
	
	public  void SignInInfo() {
		this.getUsername();
		this.getPswd();
		act.displayAcct();
		
	}
	
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}



	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}



	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}



	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}



	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}



	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}



	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}



	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public int getAcctNum() {
		return acctNum;
	}
	public void setAcctNum(int acctNum) {
		this.acctNum = acctNum;
	}

	
	
/* customers should be able to apply for
 *  joint or indv account
 * register with username and password
 * be able to withdraw, deposit, transfer and get balance
 */
	

}
