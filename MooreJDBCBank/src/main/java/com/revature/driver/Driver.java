package com.revature.menu;

import java.util.Scanner;

import com.revature.beans.Account;
import com.revature.beans.Customer;

public class Menu {
	
	public static void mainMenu() {
	
	System.out.println(" ______________________________");
	System.out.println("|    Welcome to Sunshine Bank  |");
	System.out.println("|        Sign In/Register      |");
	System.out.println("|      ---------------         |");
	System.out.println("|      Choose an option:       |");
	System.out.println("|    ---------------------     |");
	System.out.println("|    1. Sign In                |");
	System.out.println("|    2. Open Account           |");
	System.out.println("|    3. Exit                   |");
	System.out.println("|______________________________| ");

	Scanner scan = new Scanner(System.in);
	int option = scan.nextInt();
	switch (option) {

	case 1:
		SignIn();
		break;
	case 2:
		createCustomer();
		break;
	case 3:
		System.out.println(" Good Bye!");
		break;

	default:
		System.out.println("Invalid choice, choose again");
		Menu.mainMenu();
		break;
	}
}

public static void SignIn() {
	System.out.println("|------------------------------|");
	System.out.println("|       Sunshine Bank          |");
	System.out.println("|          Sign In             |");
	System.out.println("|      ---------------         |");
	System.out.println("|      Choose an option:       |");
	System.out.println("|    ---------------------     |");
	System.out.println("|    1. Customer Sign In       |");
	System.out.println("|    2. Employee Sign In       |");
	System.out.println("|    3. Main Menu              |");
	System.out.println("|    4. Exit                   |");
	System.out.println("|------------------------------|");

	Scanner scan = new Scanner(System.in);
	int option = scan.nextInt();

	switch (option) {

	case 1:
		User.SignIn();

		break;
	case 2:
		empLogIn();

		break;
	case 3:
		mainMenu();
		break;
	case 4:
		System.out.println(" Good Bye!");
		break;

	default:
		System.out.println("Invalid choice, choose again");
		SignIn();
		break;

	}
}

public static void custSignIn() {
	System.out.println("|------------------------------|");
	System.out.println("|       Sunshine Bank          |");
	System.out.println("|          Sign In             |");
	System.out.println("|      ---------------         |");
	System.out.println("|      Choose an option:       |");
	System.out.println("|    ---------------------     |");
	System.out.println("|    1. Sign In                |");
	System.out.println("|    2. Open Account           |");
	System.out.println("|    3. Main Menu              |");
	System.out.println("|    4. Exit                   |");
	System.out.println("|------------------------------|");

	Scanner scan = new Scanner(System.in);
	int option = scan.nextInt();

	switch (option) {

	case 1:
		User.SignIn();

		break;
	case 2:
		Customer.makeCust();
		break;
	case 3:
		mainMenu();
		break;
	case 4:
		System.out.println(" Good Bye!");
		break;

	default:
		System.out.println("Invalid choice, choose again");
		custSignIn();
		break;

	}
}

public static void empLogIn() {

	System.out.println("|------------------------------|");
	System.out.println("|       Sunshine Bank          |");
	System.out.println("|          Sign In             |");
	System.out.println("|      ---------------         |");
	System.out.println("|      Choose an option:       |");
	System.out.println("|    ---------------------     |");
	System.out.println("|    1. Open Account           |");
	System.out.println("|    2. View Account           |");
	System.out.println("|    3. Main Menu              |");
	System.out.println("|    4. Exit                   |");
	System.out.println("|------------------------------|");

	Scanner scan = new Scanner(System.in);

	int option = scan.nextInt();
	switch (option) {
	case 1:
		Menu.adminTrans();
		break;
	case 2:
		Menu.empTrans();
		break;
	case 3:
		Menu.empTrans();
		break;
	case 4:
		System.out.println("invalid, try again");
		break;
	default:
		System.out.println("GoodBye");
	}

}

public static void accountTrans() {

	System.out.println("|------------------------------|");
	System.out.println("|       Sunshine Bank          |");
	System.out.println("|     Account Transcations     |");
	System.out.println("|      ---------------         |");
	System.out.println("|      Choose an option:       |");
	System.out.println("|    ---------------------     |");
	System.out.println("|    1. Apply For Account      |");
	System.out.println("|    2. Check Balance          |");
	System.out.println("|    3. Deposit                |");
	System.out.println("|    4. Withdraw               |");
	System.out.println("|    5. Tranfer                |");
	System.out.println("|    6. Exit                   |");
	System.out.println("|------------------------------|");

	Scanner scan = new Scanner(System.in);
	int option = scan.nextInt();

	switch (option) {
	case 1:
		Account.OpenAccount();
		break;
	case 2:
		Transactions.checkBalance();
		break;
	case 3:
		Transactions.depositMoney();
		break;
	case 4:
		Transactions.withdrawMoney();
		break;
	case 5:
		Transactions.transferMoney();
		break;
	case 6:
		System.out.println(" Good Bye!");

		mainMenu();
		break;
	default:
		System.out.println("Invalid choice");
		accountTrans();

	}
}

public static void empTrans() {
	System.out.println("|------------------------------|");
	System.out.println("|       Sunshine Bank          |");
	System.out.println("|       Employee Menu          |");
	System.out.println("|      ---------------         |");
	System.out.println("|      Choose an option:       |");
	System.out.println("|    ---------------------     |");
	System.out.println("| 1. Display Customer Account  |");
	System.out.println("| 2. Open New Account          |");
	System.out.println("| 3. Close Account             |");
	System.out.println("| 4. Deny Account Opening      |");
	System.out.println("| 5. Approve Account  Opening  |");
	System.out.println("| 6. Go To Transaction Menu    |");
	System.out.println("| 7. Exit                      |");
	System.out.println("|------------------------------|");

	Scanner scan = new Scanner(System.in);
	int option = scan.nextInt();

	switch (option) {
	case 1:
		// Customer.displayCustomerInfo();
		break;
	case 2:
		Account.OpenAccount();
		break;
	case 3:
		Transactions.closeAccount();
		break;
	case 4:
		// Account.denyAccount();
		break;
	case 5:
		// Account.approveAccount();
		break;
	case 6:
		trans();
		break;
	case 7:
		System.out.println("Goodbye");
		mainMenu();
	default:
		System.out.println("Invalid choice");
		empTrans();

	}
}

public static void adminTrans() {
	System.out.println("|------------------------------|");
	System.out.println("|       Sunshine Bank          |");
	System.out.println("|        Admin Menu            |");
	System.out.println("|      ---------------         |");
	System.out.println("|      Choose an option:       |");
	System.out.println("|    ---------------------     |");
	System.out.println("| 1. Display Customer Account  |");
	System.out.println("| 2. Open New Account          |");
	System.out.println("| 3. Close Account             |");
	System.out.println("| 4. Deny Account Opening      |");
	System.out.println("| 5. Approve Account  Opening  |");
	System.out.println("| 6. Cancel Account            |");
	System.out.println("| 7. Go To Transaction Menu    |");
	System.out.println("| 8. Exit                      |");
	System.out.println("|------------------------------|");

	Scanner scan = new Scanner(System.in);
	int option = scan.nextInt();

	switch (option) {
	case 1:
		// Customer.getCustomer(null);
		break;
	case 2:
		Account.OpenAccount();
		break;
	case 3:
		Transactions.closeAccount();
		break;
	case 4:
		// Account.denyAccount();
		break;
	case 5:
		// Account.approveAccount();
	case 6:
		// Account.cancelAccount();
		break;
	case 7:
		trans();
		break;
	case 8:
		System.out.println("goodbye");
		mainMenu();
	default:
		System.out.println("Invalid choice");
		adminTrans();

	}
}

public static void trans() {
	System.out.println("|------------------------------|");
	System.out.println("|       Sunshine Bank          |");
	System.out.println("|     Account Transcations     |");
	System.out.println("|      ---------------         |");
	System.out.println("|      Choose an option:       |");
	System.out.println("|    ---------------------     |");
	System.out.println("|    1. Check Balance          |");
	System.out.println("|    2. Deposit                |");
	System.out.println("|    3. Withdraw               |");
	System.out.println("|    4. Tranfer                |");
	System.out.println("|    5. Exit                   |");
	System.out.println("|------------------------------|");

	Scanner scan = new Scanner(System.in);
	int option = scan.nextInt();

	switch (option) {

	case 1:
		Transactions.checkBalance();
		break;
	case 2:
		Transactions.depositMoney();
		break;
	case 3:
		Transactions.withdrawMoney();
		break;
	case 4:
		Transactions.transferMoney();
		break;
	case 5:
		System.out.println(" Good Bye!");

		mainMenu();
		break;
	default:
		System.out.println("Invalid choice");
		trans();

	}
}



	

}
