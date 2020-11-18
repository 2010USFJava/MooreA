package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Artist;

public interface ArtistDao {
	
	public List<Artist> getAlbumsByArtist() throws SQLException;

}
