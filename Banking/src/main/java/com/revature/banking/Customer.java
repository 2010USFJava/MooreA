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
	private int acctNum;
	
	Scanner in = new Scanner(System.in);
	 String ans=in.nextLine();
	
	 Scanner scan = new Scanner(System.in);
		int option=scan.nextInt();

	public Customer() {
		
	}

	public Customer(String fName, String lName, String address, String city, String state, int zip, int phone,
			int ssn, String email, String username, int acctNum) {
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
		this.acctNum=acctNum;
	}


	public void createCustomer() {
		System.out.println("Enter username:");
		User reg = new User();
		ans=reg.getUsername();
		reg.setUsername(ans);
		Account.createAccountNum();
		in.next();
		
		System.out.println("Enter password(minimum of 8 characters with at least 1 number, 1 uppercase and 1 symbol");
		ans=reg.getPswd();
		reg.setPswd(ans);
		in.next();
		
		Customer customer= new Customer();
		System.out.println("Enter first name");
		ans=customer.getfName();
		customer.setfName(ans);
		in.next();
		
		System.out.println("Enter last name");
		ans=customer.getlName();
		customer.setlName(ans);
		in.next();
		
		System.out.println("Enter address");
		ans=customer.getAddress();
		customer.setAddress(ans);
		in.next();
		
		System.out.println("Enter city");
		ans=customer.getCity();
		customer.setCity(ans);
		in.next();
		
		System.out.println("Enter state");
		ans=customer.getState();
		customer.setState(ans);
		in.next();
		
		System.out.println("Enter zip code");
		option=customer.getZip();
		customer.setZip(option);
		in.next();
		
		System.out.println("Enter you social security number");
		option=customer.getSsn();
		customer.setSsn(option);
		in.next();
		
		System.out.println("Enter phone");
		option=customer.getPhone();
		customer.setPhone(option);
		in.next();
		
		System.out.println("Enter an email");
		ans=customer.getEmail();
		customer.setEmail(ans);
		in.next();
	}

	public void displayCustomerInfo() {
		System.out.println(fName +lName +address +city+state+ zip+ phone+ssn+email+ username+acctNum );
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



	public int getAcctNum() {
		return acctNum;
	}
	public void setAcctNum(int acctNum) {
		this.acctNum = acctNum;
	}

	@Override
	public String toString() {
		return "Customer [fName=" + fName + ", lName=" + lName + ", address=" + address + ", city=" + city + ", state="
				+ state + ", zip=" + zip + ", phone=" + phone + ", ssn=" + ssn + ", email=" + email + ", username="
				+ username + ", acctNum=" + acctNum + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + acctNum;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		result = prime * result + phone;
		result = prime * result + ssn;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + zip;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (acctNum != other.acctNum)
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		if (phone != other.phone)
			return false;
		if (ssn != other.ssn)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (zip != other.zip)
			return false;
		return true;
	}
	
	
	
/* customers should be able to apply for
 *  joint or indv account
 * register with username and password
 * be able to withdraw, deposit, transfer and get balance
 */
	

}
