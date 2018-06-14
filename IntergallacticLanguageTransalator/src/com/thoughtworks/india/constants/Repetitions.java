package com.thoughtworks.india.constants;

 /**
 * @author SUMIT
 * Enum containing maximum permissible repetitions of a roman numeral
 */
public enum Repetitions {
	
	I (3),
	V (0),
	X (3),
	L (0),
	C (3),
	D (0),
	M (3);
	
	private final int repetition;
	
	Repetitions(int repetition){
		this.repetition=repetition;
	}
	
	

}
