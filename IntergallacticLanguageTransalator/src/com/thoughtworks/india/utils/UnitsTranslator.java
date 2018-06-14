package com.thoughtworks.india.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.thoughtworks.india.constants.Comodity;
import com.thoughtworks.india.constants.RomanNumeral;
import com.thoughtworks.india.exception.InvalidCommodityException;
import com.thoughtworks.india.exception.InvalidRomanNumeralException;
import com.thoughtworks.india.model.Rate;
import com.thoughtworks.india.model.Rule;

/**
 * @author SUMIT
 * This class reads input from user in form of a question and finds out the appropriate answer
 */
public class UnitsTranslator {
	
	static RomanNumeralsAdder romanNumeralsAdder;
	
	static{
		romanNumeralsAdder= new RomanNumeralsAdder();
	}
	
	
	public static Rate getRateFromInput(String input, Map<String,Rule> rules) throws InvalidRomanNumeralException, InvalidCommodityException{
		Rate rate = new Rate(null,0);
		List<RomanNumeral> numerals = new ArrayList<RomanNumeral>();
		String[] splitString=input.split(" is ");
		String[] splitString1 = splitString[0].split(" ");
		int length = splitString1.length;
		String commodity = splitString1[length-1];
		switch (commodity){
		case "Gold":
			rate.setComodity(Comodity.GOLD);
			break;
		case "Silver":
			rate.setComodity(Comodity.SILVER);	
			break;
		case "Iron":
			rate.setComodity(Comodity.IRON);
			break;
		case "Mud":
			rate.setComodity(Comodity.MUD);
			break;
		default:
			throw new InvalidCommodityException(commodity+" is an invalid Commodity." +
					" Only permissible commodities are GOLD, SILVER, IRON and MUD");
		} 
		
		for(int i=0;i<length-1;i++){
			if(rules.get(splitString1[i])!=null)
			numerals.add(rules.get(splitString1[i]).getValue());
		}
		
		int total = romanNumeralsAdder.getTotalOfRomanNumerals(numerals);
		
		String[] splitString2 = splitString[1].split(" Credits");
		
		int amount = Integer.valueOf(splitString2[0]);
		
		rate.setRate(((double)amount)/total);
		return rate;
	}
	
	public static int getNumbersFromIntergalactic(String inputString,Map<String,Rule> rules) throws InvalidRomanNumeralException{
		String[] splitString = inputString.split("how much is ");
		String[] splitString2 = splitString[1].split(" ");
		List<RomanNumeral> numerals = new ArrayList<RomanNumeral>();
		for(int i=0;i<splitString2.length;i++){
			if(rules.get(splitString2[i])!=null){
				numerals.add(rules.get(splitString2[i]).getValue());
			}
		}
		return romanNumeralsAdder.getTotalOfRomanNumerals(numerals);
	}
	
	public static double getTotalAmountForCommodity(String inputString,Map<String,Rate> rates,Map<String,Rule> rules) {
		String[] splitString =inputString.split("how many Credits is ");
		String[] splitString2 = splitString[1].split(" ");
		String commodity = splitString2[splitString2.length-1];
		Rate rate = rates.get(commodity);
		List<RomanNumeral> numerals = new ArrayList<RomanNumeral>();
		for(int i=0;i<splitString2.length-1;i++){
			if(rules.get(splitString2[i])!=null){
				numerals.add(rules.get(splitString2[i]).getValue());
			}
		}
		if(rate!=null){
		try {
			return romanNumeralsAdder.getTotalOfRomanNumerals(numerals)*rate.getRate();
		} catch (InvalidRomanNumeralException e) {
			System.out.println(e.getMessage());
		}
		}
		return -1;
	}

}
