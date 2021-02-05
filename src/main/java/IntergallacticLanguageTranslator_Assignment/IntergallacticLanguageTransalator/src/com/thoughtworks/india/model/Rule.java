package com.thoughtworks.india.model;

import com.thoughtworks.india.constants.RomanNumeral;

public class Rule {
	
	private String keyWord;
	
	private RomanNumeral value;

	public Rule(String string, RomanNumeral numeral) {
		this.keyWord=string;
		this.value= numeral;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public RomanNumeral getValue() {
		return value;
	}

	public void setValue(RomanNumeral value) {
		this.value = value;
	}
	
	// Overriding equals() to compare two Rule objects
    @Override
    public boolean equals(Object o) {
 
        if (!(o instanceof Rule)) {
            return false;
        }
        Rule rule = (Rule) o;
             
        return this.getKeyWord().equals(rule.getKeyWord())&&
        		this.getValue().equals(rule.getValue());
    }
    
    @Override
    public int hashCode(){
    	return keyWord.hashCode();
    }

}
