package com.revature.beans;

public class Pookieman {
	public int pid; 
	private String pName;
	
	public Pookieman(int pid, String pName) {
		super();
		this.pid = pid;
		this.pName = pName;
	}

	public Pookieman() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}

	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}

	/**
	 * @return the petName
	 */
	public String getPName() {
		return pName;
	}

	/**
	 * @param petName the petName to set
	 */
	public void setPName(String pName) {
		this.pName = pName;
	}

	@Override
	public String toString() {
		return "Pookieman [pid=" + pid + ", petName=" + pName + "]";
	}
	
	
	

}
