package com.revature.beans;

import com.revature.classtypes.Mammal;
import com.revature.exceptions.IncreasedByNegativeNumberException;

public class Person extends Mammal {
	static{ //runs when this class is FIRST loaded into the compiler
		System.out.println("I am in a static code block");
	}
	//Instance Code Block
	{System.out.println("I am in an instance code block");}
	/*bean- represents some entity
	More for data structure 
	Makeup:
		private fields
		no args constructor
		constructor w/ fields
		getters and setters
		override toString(), equals(), hashcode()
		
	*/
	
	/*Members of a class
	 * Instance variables- property of a specific object
	 * Static variables- property that belongs to the class aka to every object of that type
	 * Instance methods- behavior related to a specific object
	 * Static methods- behavior related to the entire class 
	 * Constructor- instantiates the class using the "new" keyword
	 */
	private String name;
	private int age;
	private int weight;
	static String homePlanet="earth";
	
	public static String getHomePlanet() {
		return homePlanet;
	}

	public static void setHomePlanet(String homePlanet) {
		Person.homePlanet = homePlanet;
	}

	//no args constructor
	 public Person (){
		//super();
		 System.out.println("I am in the no args constructor");
	}
	
	 //constructor with fields
	 public Person(String name,int age,int weight) {
		 System.out.println("I am in the param constructor");
		 this.name=name;
		 this.age=age;
		 this.weight=weight;
	 }
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight +
				", homePlanet= "+homePlanet+"]";
	}

	@Override
	public void findPrey() {
	System.out.println("I go to whole foods and buy sweet potatos");
		
	}

	@Override
	public void breathe() {
		System.out.println(" I breath air");
		
	}

	//throwing or ducking
	public void increaseAgeBy(int x) throws IncreasedByNegativeNumberException  {
		if(x<=0) {
			throw new IncreasedByNegativeNumberException();
		}
		this.age+=x;
	}
	
	
}