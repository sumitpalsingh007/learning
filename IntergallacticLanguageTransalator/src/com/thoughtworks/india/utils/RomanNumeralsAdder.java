package com.thoughtworks.india.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.thoughtworks.india.constants.RomanNumeral;
import com.thoughtworks.india.exception.InvalidRomanNumeralException;

/**
 * @author SUMIT
 * Util class for checking validity of series of Roman rumeral as per Roaml numeral rules
 * and for calculation their sum
 */
public class RomanNumeralsAdder {
	
	public int getTotalOfRomanNumerals(List<RomanNumeral> numerals) throws InvalidRomanNumeralException{
		if(!(checkValidRepetetionsInNumeral(numerals)&&checkValidSubtractibles(numerals))){
			throw new InvalidRomanNumeralException("input intergallactic numerals translates to --"+
		       numerals.toString()+" which is an invalid series for Roman rumerals");
		}
		int sum  = 0;
		sum=sum+numerals.get(numerals.size()-1).getValue();
		for(int i=numerals.size()-2;i>=0;i--){
			if(numerals.get(i).getValue()<numerals.get(i+1).getValue()){
			sum =sum-numerals.get(i).getValue();
			}else{
				sum =sum+numerals.get(i).getValue();
			}
		}
		return sum;
	}

	public boolean checkValidRepetetionsInNumeral(List<RomanNumeral> numerals) {

		Map<RomanNumeral, Integer> indexMap = new HashMap<RomanNumeral, Integer>();
		for (int i = 0; i < numerals.size(); i++) {
			if (indexMap.containsKey(numerals.get(i))) {
				int index=indexMap.get(numerals.get(i));
				List<RomanNumeral> subList = new ArrayList<RomanNumeral>( numerals.subList(index, i));
				Set<RomanNumeral> subSet =new HashSet();
				subSet.add(numerals.get(i));
				if (!subList.retainAll(subSet) && (i-indexMap.get(numerals.get(i))  > numerals.get(i).getRepetition()-1)) {
					return false;
				} 
			}else{
				indexMap.put(numerals.get(i), i);
			}
		}
		return true;
	}
	
	public boolean checkValidSubtractibles(List<RomanNumeral> numerals){
		for(int i = 0; i < numerals.size()-1; i++){
			if(numerals.get(i).getValue()<numerals.get(i+1).getValue()&&!(
					numerals.get(i).equals(numerals.get(i+1).getSubtractible()))){
				return false;
			}
		}
		return true;
	}
}
