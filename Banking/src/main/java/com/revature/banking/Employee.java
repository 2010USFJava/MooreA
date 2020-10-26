package com.revature.banking;

public class Employee {
	
	private int empID;
	private String fName;
	private String lName;
	private String type;
	private String emp;
	private String admin;
	
	Employee em = new Employee();
	
	public Employee() {
	
	}


	public Employee(int empID, String fName, String lName, String type, String emp, String admin) {
		super();
		this.empID = empID;
		this.fName = fName;
		this.lName = lName;
		this.type = type;
		this.emp = emp;
		this.admin = admin;
	}

	public void typeEmp() {
		if(type==admin) {
			System.out.println("Open account");
			System.out.println("Close/cancel  account");
			System.out.println("View account");
			System.out.println("Deny account");
			System.out.println("approve account");
			System.out.println("View account");
			System.out.println("View customer info");
			System.out.println("withdraw");
			System.out.println("deposit");
			System.out.println("transfer");
			
		}else if (type==emp) {
			
			System.out.println("Deny account");
			System.out.println("approve account");
			System.out.println("View account");
			System.out.println("View customer info");
		}else 
			System.out.println("Invalid choice");
			
	}

	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
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


	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}


	public String getEmp() {
		return emp;
	}
	public void setEmp(String emp) {
		this.emp = emp;
	}


	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}


	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", fName=" + fName + ", lName=" + lName + ", type=" + type + ", emp=" + emp
				+ ", admin=" + admin + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((admin == null) ? 0 : admin.hashCode());
		result = prime * result + ((emp == null) ? 0 : emp.hashCode());
		result = prime * result + empID;
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Employee other = (Employee) obj;
		if (admin == null) {
			if (other.admin != null)
				return false;
		} else if (!admin.equals(other.admin))
			return false;
		if (emp == null) {
			if (other.emp != null)
				return false;
		} else if (!emp.equals(other.emp))
			return false;
		if (empID != other.empID)
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
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	
	
	
	
	
	
	
	
}
/* Admin should be able to view all customers info:
 *  approving/denying accounts
 *  withdrawing. depositing, transferring money
 *  Canceling accounts
 *  
 *  employee should be able to view account balances and 
 *  personal info, approve or deny opening of an account
 */




