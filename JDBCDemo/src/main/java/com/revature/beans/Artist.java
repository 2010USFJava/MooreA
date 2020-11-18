package com.revature.beans;

public class Artist {
	
	private String name;
	private int artistId;
	
	
	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Artist(String name, int artistId) {
		super();
		this.name = name;
		this.artistId = artistId;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the artistId
	 */
	public int getArtistId() {
		return artistId;
	}


	/**
	 * @param artistId the artistId to set
	 */
	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}


	@Override
	public String toString() {
		return "Artist [name=" + name + ", artistId=" + artistId + "]";
	}
	
	
	
	

}
