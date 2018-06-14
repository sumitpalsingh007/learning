package com.thoughtworks.india.constants;

/**
 * @author SUMIT
 * Enum containing rules for roman numerals like their value, their maximum permissible repetitions and which numeral can be
 * subtracted from them
 */
public enum RomanNumeral {

	I (1,3,null),
	V (5,0,I),
	X (10,3,I),
	L (50,0,X),
	C (100,3,X),
	D (500,0,C),
	M (1000,3,C);
	
	private final int value;
	private final int repetition;
	
	private final RomanNumeral subtractible;
	
	RomanNumeral(int value,int repetition,RomanNumeral firstSubtractible){
		this.value=value;
		this.repetition=repetition;
		this.subtractible=firstSubtractible;
	}
	
	public int getValue() {
		return value;
	}
		 
	public int getRepetition() {
		return repetition;
	}

	public RomanNumeral getSubtractible() {
		return subtractible;
	}
	
	
}
