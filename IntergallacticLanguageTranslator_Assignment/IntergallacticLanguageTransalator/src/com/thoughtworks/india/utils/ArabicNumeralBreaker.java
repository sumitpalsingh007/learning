package com.thoughtworks.india.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Util class for breaking given Arabic number into numbers which would add to form that number
 * @author SUMIT
 *
 */
public class ArabicNumeralBreaker {
	
	public static List<Integer> getArabiciDigits(String number){
		int length = number.length();
		List<Integer> arabicDigits = new ArrayList<Integer>();
		for(int i=0;i<length;i++){
			Double multiplier=Math.pow(10,length-1-i);
			arabicDigits.add(Integer.valueOf(number.substring(i,i+1))
					*Integer.valueOf(multiplier.intValue()));
			
		}
		return arabicDigits;
	}

}
