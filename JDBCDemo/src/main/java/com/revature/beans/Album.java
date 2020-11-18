package com.revature.beans;

public class Album {
	private int albumId;
	private String title;
	private int artistId;
	
	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Album(int albumId, String title, int artistId) {
		super();
		this.albumId = albumId;
		this.title = title;
		this.artistId = artistId;
	}

	/**
	 * @return the albumId
	 */
	public int getAlbumId() {
		return albumId;
	}

	/**
	 * @param albumId the albumId to set
	 */
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
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
		return "Album [albumId=" + albumId + ", title=" + title + ", artistId=" + artistId + "]";
	}
	
	

}
