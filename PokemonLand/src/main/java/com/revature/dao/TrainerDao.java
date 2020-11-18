package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Pokemon;

public interface TrainerDao {
	
	public List<Pokemon> getAllPokemon() throws SQLException;
	
	public void getPokemonById() throws SQLException;

}
