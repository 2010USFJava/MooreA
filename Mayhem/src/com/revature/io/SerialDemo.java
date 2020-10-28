package com.revature.io;

public class SerialDemo {

	public static void main(String[] args) {
		
		IO io= new IO();
		String a = "banana";
		
		//io.writeOutputStreamContents(" Actually, Lady Gaga is not a  " + a);
		System.out.println(io.readInputStreamContents());
	}

}
