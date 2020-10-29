package com.revature.io;

import com.revature.beans.Person;

public class SerialDemo {

	public static void main(String[] args) {
		
		IO io= new IO();
		String a = "banana";
		//if ouptut.txt does not exist, it will create it
		
		//io.writeOutputStreamContents(" Actually, Lady Gaga is not a  " + a);
		//System.out.println(io.readInputStreamContents());
		
//		Person p1 = new Person("Matt", 34, 275);
//		Person p2 = new Person("Angie", 25, 125);
//		Person p3 = new Person("Siera", 5,-0);
//		Person p4 = new Person("The Huntress", 28, 160 );
//		
//		IOWithCollections.personList.add(p1);
//		IOWithCollections.personList.add(p2);
//		IOWithCollections.personList.add(p3);
//		IOWithCollections.personList.add(p4);
//		
//		IOWithCollections.writePersonFile();
		IOWithCollections.readPersonFile();
		System.out.println(IOWithCollections.personList.toString());
		
	}

}
