package com.revature.bank;

import java.io.Serializable;
import java.util.Scanner;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2437056169379975891L;

	private int uid;
	private String uusername;
	private String upassword;

	public Scanner scan = new Scanner(System.in);

	public User() {
		this.uid = uid;
		this.uusername = uusername;
		this.upassword = upassword;

	}

	public User(int uid, String uusername, String upassword) {
		super();
		this.uid = uid;
		this.uusername = uusername;
		this.upassword = upassword;
	}
//
//	public static void empUser() {
//
//		HashMap<String, String> emp = new HashMap<String, String>();
//		emp.put("admin", "admin1");
//
//		LogThis.LogIt("info", "Admin user " + getUsername() + " logged in ");
//
//	}
//
//	public static void SignIn() {
//		System.out.println("enter username: ");
//		String username = scan.nextLine();
//		System.out.println("enter password: ");
//		String password = scan.nextLine();
//
//		User a = Lists.findAccountByUsername(username);
//
//	}
//
////	public boolean equals(Object a) {
////
////		if (a instanceof User) {
////			return username.equals(((User) a).getUsername());
////
////		} else
////			return false;
////
////	}
//
//	public static void makeUsername() {
//
//		Map<String, String> hm3 = new HashMap<String, String>();
//
//		// Set<String> set = new HashSet<String>();
//		System.out.println("Enter username");
//		String username = scan.nextLine();
//		System.out.println("Enter password");
//		String password = scan.nextLine();
//		User a = new User(username, password);
//		// set.add(username);
//		hm3.put(username, password);
//		// for (String temp : set) {
//		for (String temp : hm3.keySet()) {
//			String val = hm3.get(temp);
//			System.out.println("key: " + username + " value: " + val);
//
////		 for (String temp : set) {
////		 System.out.println(temp);
//
//			if (temp.equals(username)) {
//				System.out.println(("username unavailable, try again"));
//				makeUsername();
//			} else
//
//				System.out.println("username created");
//
//			LogThis.LogIt("info", "Username: " + a.username + " was created");
//		}
//	}
////
////		System.out.println("*****************");
////		System.out.println("username unavailable");
////		System.out.println("*****************");
////		
////		System.out.println("*****************");
////		System.out.println("username created");
////		System.out.println("*****************");
//
//	public static <K, V> void getEmp(HashMap<String, String> emp) {
//		Set<?> set = emp.entrySet();
//		// --- iterator
//		Iterator<?> i = set.iterator();
//		while (i.hasNext()) {
//			Map.Entry<K, V> me = (Map.Entry<K, V>) i.next();
//			System.out.println(me.getKey() + ": ");
//			System.out.println(me.getValue());
//		}
//	}
//
//	public static <K, V> void custUser(HashMap<String, String> hm) {
//		Set<?> set = hm.entrySet();
//		// --- iterator-
//		Iterator<?> i = set.iterator();
//		while (i.hasNext()) {
//			Map.Entry<K, V> me1 = (Map.Entry<K, V>) i.next();
//			System.out.println(me1.getKey() + ": ");
//			System.out.println(me1.getValue());
//		}
//	}
//
//	public static <K, V> void cust2User(HashMap<String, String> hm1) {
//		Set<?> set = hm1.entrySet();
//		Iterator<?> i = set.iterator();
//		while (i.hasNext()) {
//			Map.Entry<K, V> me2 = (Map.Entry<K, V>) i.next();
//			System.out.println(me2.getKey() + ": ");
//			System.out.println(me2.getValue());
//		}
//	}
//
//	public static <K, V> void joinntUser(HashMap<String, String> joint) {
//		Set<?> set = joint.entrySet();
//		Iterator<?> i = set.iterator();
//		while (i.hasNext()) {
//			Map.Entry<K, V> me3 = (Map.Entry<K, V>) i.next();
//			System.out.println(me3.getKey() + ": ");
//			System.out.println(me3.getValue());
//		}
//	}

	/**
	 * @return the uid
	 */
	public int getUid() {
		return uid;
	}

	/**
	 * @param uid the uid to set
	 */
	public void setUid(int uid) {
		this.uid = uid;
	}

	/**
	 * @return the uusername
	 */
	public String getUusername() {
		return uusername;
	}

	/**
	 * @param uusername the uusername to set
	 */
	public void setUusername(String uusername) {
		this.uusername = uusername;
	}

	/**
	 * @return the upassword
	 */
	public String getUpassword() {
		return upassword;
	}

	/**
	 * @param upassword the upassword to set
	 */
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uusername=" + uusername + ", upassword=" + upassword + ", scan=" + scan + "]";
	}

}