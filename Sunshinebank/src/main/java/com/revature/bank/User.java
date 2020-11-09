package com.revature.bank;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

import com.revature.menu.Menu;
import com.revature.util.Files;
import com.revature.util.Lists;
import com.revature.util.LogThis;


public class User implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -2437056169379975891L;
	
	
	public static String username;
	public  static String pswd;
	
	
	public static Scanner in = new Scanner(System.in);
	
	
	public User() {
		Lists.userList.add(this);
		Files.writeUserFile(Lists.userList);
	}

	public User(String username, String pswd) {
		this.username=username;
		this.pswd=pswd;
		Lists.userList.add(this);
		Files.writeUserFile(Lists.userList);
		LogThis.LogIt("info",  "user : " + this.getUsername() + " logged into system");
		
	}


	
	
	public static String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}


	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}




}