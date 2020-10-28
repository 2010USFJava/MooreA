package com.revature.maps;

import java.util.HashMap;
import java.util.Map;

public class MainDriver {

	public static void main(String[] kiwis) {
		
		Map<String, String> myMap = new HashMap<>();
		
		myMap.put("Apple",  "A red or green thing");
		myMap.put("Earth",  "A blue thing");
		myMap.put("Earth", "Filled with water");
		myMap.put("Grapes", "A red or green thing");
		
		
	//	
		
		System.out.println(myMap);
//		System.out.println(myMap.get("Apples"));
		
//		Key myKey = new Key("Mercury");
		
	//
		//specialMap.put(myKey, "My key to Mercury");
	//	
	//	myKey = null;
		
	//	myKey = new Key("Mercury");
		
	//	System.out.println(specialMap.get(myKey));
		
		System.out.println(myMap.keySet());
		System.out.println(myMap.values());
		System.out.println(myMap.entrySet());
		
		for(String s: myMap.keySet()) {
			System.out.println(myMap.get(s));
		}
		
	}

}
