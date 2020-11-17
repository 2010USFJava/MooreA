package com.revature.beans;

public class Employee {
	
	public int eid;
	public String eusername;
	public String  epassword;
	
	public Employee() {
		super();
		
	}
	public Employee(String eusername, String epassword) {
		super();
		
		this.eusername=eusername;
		this.epassword = epassword;
	}


	public Employee(int eid, String eusername, String epassword) {
		super();
		this.eid = eid;
		this.eusername=eusername;
		this.epassword = epassword;
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

	
	public String getEusername() {
		return eusername;
	}

	
	public void setEusername(String eusername) {
		this.eusername = eusername;
	}

	/**
	 *
	 */
	public String getEpassword() {
		return epassword;
	}

	/**
	 * @param epassword the epassword to set
	 */
	public void setEpassword(String epassword) {
		this.epassword = epassword;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eusername=" + eusername + ", epassword=" + epassword + "]";
	}
	
	
	

}
