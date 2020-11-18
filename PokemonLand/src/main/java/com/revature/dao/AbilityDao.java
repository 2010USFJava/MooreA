package com.revature.dao;

import java.sql.SQLException;

import com.revature.beans.Ability;

public interface AbilityDao  {
	
	public void catchNewAbiliy(Ability p) throws SQLException;
	public Ability retrievedById(int aid) throws SQLException;
	
	

}
