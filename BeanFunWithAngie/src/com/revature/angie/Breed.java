package com.revature.angie;

public class Breed {

	String breed;
	String color;

	public Breed() {
		
	}
	
	public Breed(String breed, String color) {
		this.breed=breed;
		this.color=color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Breed [breed=" + breed + ", color=" + color + "]";
	}
	
	
	
}

