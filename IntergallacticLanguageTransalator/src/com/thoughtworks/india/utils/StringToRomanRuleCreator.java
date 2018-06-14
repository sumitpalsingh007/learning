package com.thoughtworks.india.utils;

import com.thoughtworks.india.constants.RomanNumeral;
import com.thoughtworks.india.exception.InvalidRomanNumeralException;
import com.thoughtworks.india.model.Rule;

/**
 * @author SUMIT
 * This class reads input from user as a string and creates a Rule for
 *  intergallactic language translation into Roman numerals
 */
public class StringToRomanRuleCreator {
	
	public static Rule createRuleFromString(String input) throws InvalidRomanNumeralException{
		String[] subStrings=input.split(" is ");
		Rule rule = new Rule(subStrings[0].trim(),getRomanNumeral(subStrings[1].trim()));
	    return rule; 	
	}
	
	private static RomanNumeral getRomanNumeral(String input) throws InvalidRomanNumeralException{
		if(!(input.equals("I")
				||input.equals("V")
				||input.equals("X")
				||input.equals("L")
				||input.equals("C")
				||input.equals("D")
				||input.equals("M"))){
			throw new InvalidRomanNumeralException(input+" is not a permissible Roman Numeral");
		}
		 switch (input) {
         case "I":
             return RomanNumeral.I;
                 
         case "V":
        	 return RomanNumeral.V;
                      
         case "X":
        	 return RomanNumeral.X;
                     
         case "L":
        	 return RomanNumeral.L;
        	 
         case "C":
        	 return RomanNumeral.C;
        	 
         case "D":
        	 return RomanNumeral.D;
        
         case "M":
        	 return RomanNumeral.M;
        	 
        default:
        	return null;
     }
	}

}
