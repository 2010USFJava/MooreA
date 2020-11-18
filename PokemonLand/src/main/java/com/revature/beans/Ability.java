package com.revature.beans;

public class Ability {
	
	int aid;
	String aname;
	String adescription;
	
	public Ability(int aid, String aname, String adescription) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.adescription = adescription;
	}

	public Ability() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the aid
	 */
	public int getAid() {
		return aid;
	}

	/**
	 * @param aid the aid to set
	 */
	public void setAid(int aid) {
		this.aid = aid;
	}

	/**
	 * @return the aname
	 */
	public String getAname() {
		return aname;
	}

	/**
	 * @param aname the aname to set
	 */
	public void setAname(String aname) {
		this.aname = aname;
	}

	/**
	 * @return the adescription
	 */
	public String getAdescription() {
		return adescription;
	}

	/**
	 * @param adescription the adescription to set
	 */
	public void setAdescription(String adescription) {
		this.adescription = adescription;
	}

	@Override
	public String toString() {
		return "Ability [aid=" + aid + ", aname=" + aname + ", adescription=" + adescription + "]";
	}
	
	

}
