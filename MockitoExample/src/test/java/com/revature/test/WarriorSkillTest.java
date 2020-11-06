package com.revature.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.beans.skillsets.WarriorSkillSet;

public class WarriorSkillTest {
	
	@BeforeClass
	static public void initialSetup() {
		System.out.println("I run once before everything");
	}

	@Before
	public void runBeforeEachTest() {
		System.out.println("I run before each test");
	}
	
	@After
	public void runAfterEachTest() {
		
	}
	
	@Test
	public void test() {
		assertTrue(true);
		
	}

	@Test
	public void test2() {
		//assertFalse(true);
		
		//expected value vs actual value
		assertEquals(3,3);
	}
	
	@Test
	public void basicAttackTest() {
		
		WarriorSkillSet wss=new WarriorSkillSet();
		
		int actual=wss.basicAttack();
		assertEquals(5, actual);
		
	}
	
	@Test
	public void powerAttackTest() {
		
		WarriorSkillSet wss=new WarriorSkillSet();
		int expected=10; 
		int actual= wss.powerAttack();// dont put logic in test
		assertEquals(expected, actual);
	}
	
	//bad - doing calculation in test not method
	@Test 
		public void powerAttackBadTest() {
		WarriorSkillSet wss=new WarriorSkillSet();
		int expected =( wss.basicAttack()*4)/2;
		int actual=wss.powerAttack();
		assertEquals(expected, actual);
		
	}
	
	
	

}
