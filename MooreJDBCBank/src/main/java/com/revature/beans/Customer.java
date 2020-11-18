package com.revature.beans;

import java.util.ArrayList;

import com.revature.util.LogThis;

public class Customer{
	
	public int cid;
	public static  String cfirst;
	public static String clast;
	public static String cusername;
	public static String cpassword;
	public static int aacountnum;
	
	public Customer() {
		super();
	}
	
	public Customer(int cid, String cfirst, String clast, String cusername, String cpassword, int aacountnum) {
		super();
		this.cid = cid;
		this.cfirst = cfirst;
		this.clast = clast;
		this.cusername = cusername;
		this.cpassword = cpassword;
		this.aacountnum=aacountnum;
	}

	
	public Customer(String cfirst, String clast, String cusername, String cpassword, int aacountnum) {
		this.cfirst = cfirst;
		this.clast = clast;
		this.cusername = cusername;
		this.cpassword = cpassword;
		this.aacountnum=aacountnum;
		LogThis.LogIt("info",  "customer " + getCfirst() + "  " + getClast() + " created account");
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
	public static String getCusername() {
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

	public void setAacountnum(int aacountnum) {
		this.aacountnum=aacountnum;
	}
	public int getAacountnum() {
		return aacountnum;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cfirst=" + cfirst + ", clast=" + clast + ", cusername=" + cusername
				+ ", cpassword=" + cpassword + " , aacountnum=" + aacountnum +"]";
	}
	
}