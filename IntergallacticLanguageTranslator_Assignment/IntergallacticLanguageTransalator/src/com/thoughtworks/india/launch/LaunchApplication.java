package com.thoughtworks.india.launch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.thoughtworks.india.exception.InvalidCommodityException;
import com.thoughtworks.india.exception.InvalidRomanNumeralException;
import com.thoughtworks.india.model.Rate;
import com.thoughtworks.india.model.Rule;
import com.thoughtworks.india.utils.InputRecognizer;
import com.thoughtworks.india.utils.StringToRomanRuleCreator;
import com.thoughtworks.india.utils.UnitsTranslator;

/**
 * Class for launching the application and testing it
 * @author SUMIT
 *
 */
public class LaunchApplication {

	/**
	 * @param args
	 */
	private static final String INPUT_FILE_PATH = "../IntergallacticLanguageTransalator/src/com/thoughtworks/india/launch/inputFile.txt";
	private static final String INVALID_INPUT_FILE_PATH = "../IntergallacticLanguageTransalator/src/com/thoughtworks/india/launch/InvalidInputFile.txt";
	
	static Map<String,Rate> rates;
	static Map<String ,Rule> rules;
	
	static InputRecognizer inputRecognizer;
	static StringToRomanRuleCreator stringToRomanRuleCreator;
	static UnitsTranslator unitsTranslator;
	
	static{
		rates = new HashMap<String,Rate>();
		rules= new HashMap<String ,Rule>();
		inputRecognizer=new InputRecognizer();
		stringToRomanRuleCreator = new StringToRomanRuleCreator();
		unitsTranslator =new UnitsTranslator();
		
	}
	public static void main(String[] args) {
		String line;
		try (
		    InputStream fis = new FileInputStream(INPUT_FILE_PATH);
		    InputStreamReader isr = new InputStreamReader(fis);
		    BufferedReader br = new BufferedReader(isr);
		) {
		    while ((line = br.readLine()) != null) {
		    	try {
					processLine(line);
				} catch (InvalidCommodityException e) {
					System.out.println(e.getMessage());
				} catch (InvalidRomanNumeralException e) {
					System.out.println(e.getMessage());
				}
		    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void processLine(String line) throws InvalidCommodityException, InvalidRomanNumeralException{
		int response = inputRecognizer.recognizeInput(line);
		if(response==1){
			Rule rule;
			try {
				rule = stringToRomanRuleCreator.createRuleFromString(line);
				rules.put(rule.getKeyWord(), rule);
			} catch (InvalidRomanNumeralException e) {
				System.out.println(e.getMessage());
			}
		}
		if (response == 2) {
			String input = line.replace(" Credits", "");
			Rate rate = null;
			try {
				rate = unitsTranslator.getRateFromInput(input, rules);
			} catch (InvalidRomanNumeralException e) {
				System.out.println(e.getMessage());
			} catch (InvalidCommodityException e) {
				System.out.println(e.getMessage());
			}
			if (rate != null) {
				rates.put(rate.getComodity().getName(), rate);
			}
		}
		if(response==3){
			String input = line.replace(" ?", "");
			int number;
			try {
				number = unitsTranslator.getNumbersFromIntergalactic(input, rules);
				String[] splitString = line.split(" is ");
				System.out.println(splitString[1].substring(0,splitString[1].length()-2)+" is "+number);
			} catch (InvalidRomanNumeralException e) {
				System.out.println(e.getMessage());
				}
		}
		if(response==4){
			String input = line.replace(" ?", "");
			double number;
			number = unitsTranslator.getTotalAmountForCommodity(input, rates, rules);
			String[] splitString = line.split(" is ");
			String splitString1 = splitString[1].substring(0,splitString[1].length()-2);
			System.out.println(splitString1+" is "+(int)number+" Credits" );
		}
		if(response==0){
			 System.out.println("I have no idea what you are talking about");
		}
	}

}
