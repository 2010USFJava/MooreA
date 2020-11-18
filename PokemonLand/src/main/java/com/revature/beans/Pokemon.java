package com.revature.beans;

public class Pokemon {

	int pid;
	String pname;
	public Pokemon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pokemon(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
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
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}
	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Pokemon [pid=" + pid + ", pname=" + pname + "]";
	}
	
	
	
}
