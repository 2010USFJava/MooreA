package com.revature.chaining;

public class Movie {
	private String title;
	private String genre;
	private String actor;
	private String rating;
	private String director;
	private int hours;
	
	
	public Movie() {
		this("Cool Movie");
	}
	
	public Movie(String title) {
		this(title, "action");
		
	}
	
	public Movie(String title, String genre) {
		this(title, genre, "Bradly");
		
	}
	
	public Movie(String title, String genre, String actor) {
		this(title, genre, actor, "R");
		
	}
	
	public Movie(String title, String genre, String actor, String rating) {
		this(title, genre, actor, rating, "Bob");
		
	}
	
	public Movie(String title, String genre, String actor, String rating, String director) {
		this(title, genre, actor, rating, director, 2 );
	
	}
	
	
	public Movie(String title, String genre, String actor, String rating, String director, int hours) {
		
		this.title = title;
		this.genre = genre;
		this.actor = actor;
		this.rating = rating;
		this.director = director;
		this.hours = hours;
	}

	


	public static void main(String[] args) {
		
		Movie m = new Movie();
		System.out.println(m);

	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + ", actor=" + actor + ", rating=" + rating + ", director="
				+ director + ", hours=" + hours + "]";
	}
	
	

}
