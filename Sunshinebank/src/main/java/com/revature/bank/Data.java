package com.revature.bank;

import java.util.HashMap;
import java.util.Map;
import com.revature.driver.GetUser;


public class Data implements MapSetter, MapGiver, GetUser {
	
	
	HashMap<String, Integer> people = new HashMap<String, Integer>();

	
    private Map map;

    @Override
    public void setMap(Map map) {
        this.map = map;            
    }
    
	
    @Override
    public void giveMap(MapSetter acceptMap) {
        acceptMap.setMap(map);
        
    }


	public Map getMap(Map map) {
		return map;
		
	}

}
