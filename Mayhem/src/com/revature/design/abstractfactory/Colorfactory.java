package com.revature.design.abstractfactory;

public class Colorfactory implements AbstractFactory<Color>{

	@Override
	public Color create(String t) {
	if(t.equalsIgnoreCase("green")) {
		return new Green();
	}else if(t.equalsIgnoreCase("pink")) {
		return new Pink();
	}
		return null;
	}

}
