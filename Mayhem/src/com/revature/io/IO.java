package com.revature.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO {
	//IO- input/output
	//reading, writing to file
	
	//write method
		public void writeOutputStreamContents(String contents) {
			
			OutputStream os =null;
			File file = new File("output.txt");
			
			//false will override, true will append 
			try {
				os= new FileOutputStream(file, true);
				os.write(contents.getBytes());
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(os!=null) {
				try {
					os.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
	
	//read method
	
	public String readInputStreamContents() {
		
		InputStream is=null;
		File file=new File("input.txt");
		StringBuilder s=new StringBuilder();
		
		try {
			is= new FileInputStream(file);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		int b=0; 
		
		try {
			while((b=is.read())!=-1) { // -1 is at end of file
				char c= (char) b;
				s.append(c);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		if(is!=null){
			try {
				is.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
		return s.toString();
		
	}

}
