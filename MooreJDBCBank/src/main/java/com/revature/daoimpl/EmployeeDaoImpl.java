package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.revature.beans.Customer;
import com.revature.beans.Employee;
import com.revature.dao.AccountDao;
import com.revature.dao.CustomerDao;
import com.revature.dao.EmployeeDao;
import com.revature.driver.Driver;
import com.revature.exceptions.UsernamePasswordMismatchException;
import com.revature.menu.MainMenu;
import com.revature.util.ConFactory;
import com.revature.util.LogThis;

public class EmployeeDaoImpl extends Employee implements EmployeeDao {
	CustomerDao dao = new CustomerDaoImpl();
	AccountDao acc = new AccountDaoImpl();
	public static ConFactory cf= ConFactory.getInstance();
	
	
	@Override
	
	public void empSignIn() throws SQLException {
		
		try {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter username");
		String username=scan.nextLine();
		System.out.println("Enter password");
		String password=scan.nextLine();
		
		Connection conn= cf.getConnection();
		
		String sql="select * from sunshinebank.employee where eusername=? and epassword=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		
		ps.setString(1, username);
		ps.setString(2, password);

		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {

			rs.getString(2);
			rs.getString(3);
		
			
			 if (password.equals(epassword) && eusername.equals(eusername)) {
				 System.out.println("==================");
				 System.out.println( "log in succesfull");
				 System.out.println("==================");
				
			
				empSignIn();
	             
	           
	            } else  {
	            	
	            	 empMenu();
	           }
			
		}
	
	}catch (SQLException e) {
   		e.printStackTrace();
     	}catch(UsernamePasswordMismatchException ue) {
			ue.printStackTrace();
		
		LogThis.LogIt("info", "admin logged in");
     	}
		
	

}


	@Override
	public void empSignOut() throws SQLException {
		Connection conn= cf.getConnection();
		try {
			conn.close();
			System.out.println(" admin logged out");
			LogThis.LogIt("infi",  " admin logged out");
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	
		
	}
	@Override
	public void empMenu() throws SQLException {
		System.out.println("|==============================|");
		System.out.println("|       Sunshine Bank          |");
		System.out.println("|       Employee Menu          |");
		System.out.println("|      ---------------         |");
		System.out.println("|      Choose an option:       |");
		System.out.println("|    ---------------------     |");
		System.out.println("| 1. Display Customer Account  |");
		System.out.println("| 2. Open New Account          |");
		System.out.println("| 3. Close Account             |");
		System.out.println("| 4. Delete Account            |");
		System.out.println("| 5. Go To Main Menu           |");
		System.out.println("| 6. Exit                      |");
		System.out.println("| 7. Exit                      |");
		System.out.println("|==============================|");
		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();
		Customer a=null;
		switch (option) {
		case 1:
			acc.viewAccount();
			break;
		case 2:
			dao.createCustomer();
			break;
		case 3:
			acc.closeAccount();
			break;
		case 4:
			acc.deleteAccount();
			break;
		case 5:
			MainMenu.mainMenu();
			break;
		case 6:
			
		case 7:
			System.out.println("Goodbye");
			
		default:
			System.out.println("Invalid choice");
			empMenu();

		}
	}

	
}
