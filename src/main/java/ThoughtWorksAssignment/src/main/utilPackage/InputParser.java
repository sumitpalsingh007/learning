package main.utilPackage;

import main.data.Talk;

public class InputParser {

	public Talk parseInput(String s){
		Talk t = new Talk();
		if(null!=s && s.endsWith("min")){
			String remString = s.substring(s.lastIndexOf(" ")+1,s.lastIndexOf("min"));
			t.setTitle(s);
			t.setDuration(Integer.valueOf(remString));
		}
		else if(null!=s && s.endsWith("lightning")){
			t.setTitle(s)	;
			t.setDuration(5);
		}
		else{
			throw new IllegalArgumentException("Not a valid Title");
		}
		return t;
	}

}
