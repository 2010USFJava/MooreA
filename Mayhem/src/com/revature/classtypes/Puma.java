package com.revature.classtypes;


public class Puma extends Mammal {
	
	private boolean isCapableOfMurderingPeople;
	@Override
	public void breathe() {
		System.out.println("I breathe thru my nose ... roar");
	}
	
	
	
	public Puma() {
		super();
		
	}



	public Puma(boolean isCapableOfMurderingPeople) {
		super();
		this.isCapableOfMurderingPeople = isCapableOfMurderingPeople;
	}



	@Override
	public void findPrey() {
		System.out.println("I stalk things in the forest");
		
	}



	@Override
	public String toString() {
		return "Puma [isCapableOfMurderingPeople=" + isCapableOfMurderingPeople + "]";
	}



	


	
	
	

}
