package com.revature.strings;

public class FinWithStrings {

	public static void main(String[] args) {

		String s = "dog";
		String a="dog";
		
		System.out.println(s.hashCode());
		System.out.println(a.hashCode());
		a=a+"house";
		System.out.println(a.hashCode());
		
		System.out.println(s.charAt(2));
		
		StringBuilder sb= new StringBuilder("Roll Tide");
		StringBuilder sb2= new StringBuilder("Geaux Tigers");

		System.out.println(sb.hashCode());
		//System.out.println(sb2.hashCode());
		sb=sb.append("w");
		System.out.println(sb.hashCode());
	}

}
