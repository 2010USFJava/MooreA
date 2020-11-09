package com.revature.bank;

import java.util.Map;

public class MoreData implements MapSetter {
    private Map map;

    public void displayMap() {
        System.out.println(map);

    }

    @Override
    public void setMap(Map map) {
        this.map = map;            
    }  
}
