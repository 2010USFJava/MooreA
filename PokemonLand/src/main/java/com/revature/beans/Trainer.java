package com.revature.beans;

public class Trainer {
	
	int tid;
	String tname;
	
	public Trainer() {
		super();
		
	}
	public Trainer(int tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	
	public int getTid() {
		return tid;
	}
	
	public void setTid(int tid) {
		this.tid = tid;
	}
	
	public String getTname() {
		return tname;
	}
	
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Trainer [tid=" + tid + ", tname=" + tname + "]";
	}
	
	
	

}
