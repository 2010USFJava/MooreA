package com.revature.beans;

public class Employee {
	
	int eid;
	String emp;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String emp) {
		super();
		this.eid = eid;
		this.emp = emp;
	}
	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}
	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}
	/**
	 * @return the emp
	 */
	public String getEmp() {
		return emp;
	}
	/**
	 * @param emp the emp to set
	 */
	public void setEmp(String emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", emp=" + emp + "]";
	}
	
	
	
	

}
