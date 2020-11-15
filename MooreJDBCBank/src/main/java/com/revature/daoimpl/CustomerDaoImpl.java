package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.beans.Account;
import com.revature.beans.Customer;
import com.revature.dao.CustomerDao;
import com.revature.exceptions.UsernamePasswordMismatchException;
import com.revature.util.ConFactory;

public class CustomerDaoImpl extends Account implements CustomerDao  {
	
	public static ConFactory cf= ConFactory.getInstance();
	

	public  boolean checkUsermameDup(String cusername) throws SQLException {
	 Connection conn= cf.getConnection();
	
	     boolean usernameExists = false;

	     try
	     {
	    	 String sql=("select * from customers where username=?");
	    	 PreparedStatement ps = conn.prepareStatement(sql);

	         ps.setString(4, cusername);
	         
	         ResultSet rs=ps.executeQuery();
	         String usernameCounter;
	          if(rs.next()) 
	          {
	            usernameCounter =  rs.getString("cusername");
	            if(usernameCounter.equals(cusername)){ //this part does not happen even if it should
	            System.out.println("username unavailable");
	               usernameExists = true;
	            }
	          }


	      }

	      catch (SQLException e) {
	    		e.printStackTrace();
	      	}

	   return usernameExists;

	  }	
		
		

		
		public  boolean matchUnameNPass(String cusername, String cpassword) throws SQLException, UsernamePasswordMismatchException {
			Connection conn = cf.getConnection();
			
			boolean nameNpassMatch= false;
			try {
				
				
				PreparedStatement ps = conn.prepareStatement("select * from customers where cusername=? and cpassword=? ");
				 ps.setString(4, cusername);
				 ps.setString(5, cpassword);
				 
				 ResultSet rs=ps.executeQuery();
				 String username;
				 String password;

				 while(rs.next())  {
					 username=rs.getString(cusername);
					 password=rs.getString(cpassword);
					 if (password.equals(cpassword) && username.equals(cusername)) {
						 System.out.println("=================");
						 System.out.println("log in succesfull");
						 System.out.println("=================");
						
						 nameNpassMatch= true;
			             
			                rs.close();
			            } else {
			            	System.out.println("============================");
							System.out.println("invalid username or password");
							System.out.println("============================");
							matchUnameNPass(cusername, cpassword);
			            }
			        }
			} 
			 catch (SQLException e) {
		    		e.printStackTrace();
		      	}catch(UsernamePasswordMismatchException ue) {
					ue.printStackTrace();
		      	}
			return nameNpassMatch;
		}



			
	public  void createCustomer(Customer c) throws SQLException{
		
		ArrayList<String> customers = new ArrayList<String>();
		
		Connection conn= cf.getConnection();
		try {
		String sql="insert into customer(cid, cfirst, clast, cusername, cpassword) "
				+ "values(default,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("___________________");
		System.out.println("Welcome to Sunshine Bank");
		System.out.println("Please Enter Customer Information");
		int cid = scan.nextInt();
		System.out.println("first name");
		String cfirst=scan.nextLine();
		System.out.println("last name");
		String clast=scan.nextLine();
		System.out.println("username");
		String cusername=scan.nextLine();
		System.out.println("password");
		String cpassword=scan.nextLine();
		
		
		customers.add(cfirst);
		customers.add(clast);
		customers.add(cusername);
		customers.add(cpassword);
		
		
		ps.setInt(1, c.getCid());
		ps.setString(2,  c.getCfirst());
		ps.setString(3,  c.getClast());
		ps.setString(4,  c.getCusername());
		ps.setString(5,  c.getCpassword());
		
		checkUsermameDup(cusername);
		
		ResultSet rs = ps.getGeneratedKeys(); 
				if (rs.next()) {
					cid = rs.getInt(1);
				}
	
		}catch (SQLException e){
			
		}
	}
		 
		
	





		@Override
		public List<Customer> getAllCustomers() throws SQLException {
			List<Customer> customers= new ArrayList<Customer>();
			
			Connection conn= cf.getConnection();
			Statement stmt=conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from customers");
			Customer c=null;
			while(rs.next()) {
				c=new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			customers.add(c);
			
			}

			return customers;
			}
		}


		
