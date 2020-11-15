package com.revature.beans;

import java.util.ArrayList;

public class Customer  {
	
	public int cid;
	public String cfirst;
	public String clast;
	public String cusername;
	public String cpassword;
	
	public Customer() {
		super();
	
	
	
}

	public Customer(int cid, String cfirst, String clast, String cusername, String cpassword) {
		super();
		this.cid = cid;
		this.cfirst = cfirst;
		this.clast = clast;
		this.cusername = cusername;
		this.cpassword = cpassword;
	}

	/**
	 * @return the cid
	 */
	public int getCid() {
		return cid;
	}

	/**
	 * @param cid the cid to set
	 */
	public void setCid(int cid) {
		this.cid = cid;
	}

	/**
	 * @return the cfirst
	 */
	public String getCfirst() {
		return cfirst;
	}

	/**
	 * @param cfirst the cfirst to set
	 */
	public void setCfirst(String cfirst) {
		this.cfirst = cfirst;
	}

	/**
	 * @return the clast
	 */
	public String getClast() {
		return clast;
	}

	/**
	 * @param clast the clast to set
	 */
	public void setClast(String clast) {
		this.clast = clast;
	}

	/**
	 * @return the cusername
	 */
	public String getCusername() {
		return cusername;
	}

	/**
	 * @param cusername the cusername to set
	 */
	public void setCusername(String cusername) {
		this.cusername = cusername;
	}

	/**
	 * @return the cpassword
	 */
	public String getCpassword() {
		return cpassword;
	}

	/**
	 * @param cpassword the cpassword to set
	 */
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cfirst=" + cfirst + ", clast=" + clast + ", cusername=" + cusername
				+ ", cpassword=" + cpassword + "]";
	}
	
}