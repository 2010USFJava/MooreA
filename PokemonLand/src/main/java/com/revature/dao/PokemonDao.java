package com.revature.dao;

import java.sql.PreparedStatement;
import java.util.List;

import com.revature.beans.Ability;
import com.revature.beans.Pokemon;
import com.revature.daoimpl.SQLException;



public interface PokemonDao {

	List<Ability> getAbilitiesByID(int aid) throws SQLException;

	List<Pokemon> getPokemonByID(int pid) throws java.sql.SQLException;


	}
	

