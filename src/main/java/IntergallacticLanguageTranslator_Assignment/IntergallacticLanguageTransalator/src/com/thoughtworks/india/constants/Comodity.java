package com.thoughtworks.india.constants;

public enum Comodity {
	
	GOLD("Gold"),
	SILVER("Silver"),
	IRON("Iron"),
	MUD("Mud");

	String name;
	
	Comodity(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}

}
