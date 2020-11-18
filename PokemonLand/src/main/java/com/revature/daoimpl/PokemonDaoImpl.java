package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Ability;
import com.revature.beans.Pokemon;
import com.revature.dao.PokemonDao;

import com.revature.util.ConnFactory;

public class PokemonDaoImpl implements PokemonDao{
	 public static ConnFactory cf=ConnFactory.getInstance();
	
		@Override
	    public List<Pokemon> getPokemonByID(int pid) throws SQLException {
	        Connection conn=cf.getConnection();
	        String sql = "select * from pokemon where pid=?";
	        PreparedStatement ps=conn.prepareStatement(sql);
	        ps.setInt(1, pid);
	        ResultSet rs= ps.executeQuery();
	        Pokemon a=null;
	        while(rs.next()) {
	            a=new Pokemon(rs.getInt(1),rs.getString(2));
	        }

	        return a;
	    }

	    @Override
	    public List<Ability> getAbilitiesByID(int aid) throws SQLException {
	        Connection conn=cf.getConnection();
	        String sql = "select * from ability where aid=?";
	        PreparedStatement ps=conn.prepareStatement(sql);
	        ps.setInt(1, aid);
	        ResultSet rs= ps.executeQuery();
	        Ability a=null;
	        while(rs.next()) {
	            a=new Ability(rs.getInt(1),rs.getString(2),rs.getString(3));
	        }

	        return a;
	    }
	

	    
	    public static void insertNewPokemon(Pokemon pokemon, String pk){
	        String query =" INSERT into pokemon(pid, pname,)VALUES (?,?)";

	      try{
	          PreparedStatement stmnt = makePrStmnt(query);
	          stmnt.setInt(1,pokemon.getiD);
	          stmnt.setString(2,pokemon.getName);

	          stmnt.executeUpdate();

	        // pokemonlist.add(pokemon); ??not sure of the list name??
	      } catch(SQLException sqe){
	          System.out.println("Check EndUser Insert SQL " + sqe.getSQLState() + sqe.getMessage());
	        } catch (Exception e) {
	            System.out.println("Error: " +e.getMessage());
	public static PreparedStatement makePrStmnt(String s) throws Exception
	{
	    PreparedStatement prstmt = conn.prepareStatement(s);
	    return prstmt;
	}
	
	public udpdateName(String oldName, String newName, int id ) throws SQLException {
        //Can update all fields in beans, needs if statements to accomplish that or not idk exactly yet
        Connection connect = db.getConnection();
        Statement stmt = connect.createStatement();
        String updateQuery = "update trainer set ? = ? where id = ?";
        PreparedStatement prepStmt = connect.prepareStatement(updateQuery);
        ResultSet rs = stmt.executeQuery("select tname from trainer");

        prepStmt.setString(1, oldName);
        prepStmt.setString(1, newName);
        prepStmt.setInt(1, id);
        prepStmt.executeUpdate();
    }
}
