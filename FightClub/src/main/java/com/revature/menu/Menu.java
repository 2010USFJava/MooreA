package com.revature.menu;

import java.util.Scanner;

import com.revature.beans.Warrior;
import com.revature.service.Fight;
import com.revature.util.LogThis;
import com.revature.util.Roster;

public class Menu {
	static Scanner scan = new Scanner(System.in);
	
	public static void startMenu() {
		
		System.out.println("Welcome to the game!");
		System.out.println("Please enter a choice:  ");
		System.out.println("\t[c]reate a new warrior");
		System.out.println("\t[f]ight");
		System.out.println("\t[q]uit the game");
		
		String choice=scan.nextLine();
		
		switch(choice.toLowerCase()) {
		
			case "c":
				createMenu();
				break;
			case "f":
				FightMenu();
				break;
			
			case "q":
				System.out.println("BYE");
				break;
			default:
				System.out.println("Try again, wrong choice");
				startMenu();
				break;
		}
			
		
	}
	
	public static void createMenu() {
		
		System.out.println("Create a new warrrior");
		System.out.println("Please enter a name for your warrior");
		String warriorName=scan.nextLine();
		System.out.println("Please enter your warriors HP");
		int warriorHP=Integer.parseInt(scan.nextLine());
		System.out.println("Please enter your warriors attack power");
		int warriorAttackPower=Integer.parseInt(scan.nextLine());
		
		
		Warrior a = new Warrior(warriorName, warriorHP, warriorAttackPower);
		LogThis.LogIt("info", a.getName() + " was created!");
		System.out.println(Roster.warriorList.toString());
		
		
		System.out.println("Would you like to make a new warrior? ( y/n)");
		String choice = scan.nextLine();
		if(choice.equalsIgnoreCase("y")){
			createMenu();
		}else if(choice.equalsIgnoreCase("n")){
			startMenu();
		}else {
			System.out.println("too bad, you are starting over ");
			startMenu();
		}
		
	}
	
	//fightMenu();
	public static void FightMenu() {
		
		System.out.println("Enter name of first warrior");
		String first=scan.nextLine();
		Warrior a = Roster.findWarriorByName(first);
		
		System.out.println("Enter name of second warrior");
		String second=scan.nextLine();
		Warrior b = Roster.findWarriorByName(second);
		
		System.out.println("LET THE BATTLE BEGIN!!");
		Fight fight=new Fight();
		fight.fightTime(a, b);
		LogThis.LogIt("info", a.getName()+ " just punched " + b.getName() + " and it cost them " +a.getAttackPower()+
					" points of damage");
		System.out.println(b.getName()+ " 's HP is now " + b.getHp());
		
		System.out.println("Would you like to play again? (y/n)");
        String again = scan.nextLine();
        switch (again.toLowerCase()) {
            case "y":
                startMenu();
                break;
            case "n":
            	System.out.println("Thank you for playing, goodbye.");
                break;
            default:
                System.out.println("Invalid input.");
		
                
		startMenu();
		
	}
	}
	}
