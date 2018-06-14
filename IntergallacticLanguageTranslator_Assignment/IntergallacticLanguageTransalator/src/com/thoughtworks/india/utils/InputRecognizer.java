package com.thoughtworks.india.utils;

import com.thoughtworks.india.constants.Comodity;
import com.thoughtworks.india.constants.RomanNumeral;
import com.thoughtworks.india.exception.InvalidCommodityException;
import com.thoughtworks.india.exception.InvalidRomanNumeralException;

/**
 * Util class for recognizing the input given by the user 
 * i.e whether user is creating a rule or asking a question
 * @author SUMIT
 *
 */
public class InputRecognizer {
	
	public int recognizeInput(String input) throws InvalidCommodityException, InvalidRomanNumeralException{
		
		if(input.contains(" is ")&& (input.split(" is ").length)==2
				&&!input.endsWith("Credits")
				&&!input.endsWith("?") ){
			if(input.endsWith(RomanNumeral.I.toString())
					||input.endsWith(RomanNumeral.C.toString())
					||input.endsWith(RomanNumeral.D.toString())
					||input.endsWith(RomanNumeral.L.toString())
					||input.endsWith(RomanNumeral.M.toString())
					||input.endsWith(RomanNumeral.V.toString())
					||input.endsWith(RomanNumeral.X.toString())){
				
				return 1;
			}else{
				throw new InvalidRomanNumeralException("Input does not contain a valid roman numeral." +
						" Permissible numerals are C, D, L, M, V, X");
			}
		}
		
		if(input.contains(" is ")&&input.contains(" Credits")&& !input.endsWith("?")){
			if(input.contains(" Gold ")
					||input.contains(" Silver ")
					||input.contains(" Iron ")
					||input.contains(" Mud ")){
			return 2;
			}else{
				throw new InvalidCommodityException("Not a valid Commodity." +
					" Only permissible commodities are GOLD, SILVER, IRON and MUD");
			}
		}
		
		if(input.startsWith("how much is ")&&input.endsWith(" ?")&&(!(input.contains(" Gold ")
				||input.contains(" Silver ")
				||input.contains(" Iron ")
				||input.contains(" Mud ")))){
			return 3;
		}
		
		if(input.startsWith("how many Credits is ")&&input.endsWith(" ?")){
			if(input.contains(" Gold ")
					||input.contains(" Silver ")
					||input.contains(" Iron ")
					||input.contains(" Mud ")){
			return 4;
			}else{
				throw new InvalidCommodityException("Not a valid Commodity." +
						" Only permissible commodities are GOLD, SILVER, IRON and MUD");
				
			}
		}
		return 0;
	}

}
