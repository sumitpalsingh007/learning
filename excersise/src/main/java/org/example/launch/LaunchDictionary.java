package org.example.launch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.example.addRemove.MyFLRFileReader;
import org.example.addRemove.MyFileReader;
import org.example.addRemove.MyXMLFileReader;
import org.example.newxmlschema.Entry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LaunchDictionary {

	static final Logger logger = LoggerFactory.getLogger(LaunchDictionary.class);
	static String fileName;
	
	static MyFileReader fileReader;
			
	public static void main(String[] args) {
		logger.info("launching the application");
		logger.debug("asking the file name");
		System.out.println("please enter name of the file");
		try {
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		String name = bufferRead.readLine();
		logger.debug("fileName is "+name);
		System.out.println("please enter formatt of dictionary");
		String extension = bufferRead.readLine();
		fileName=name+"."+extension;
		logger.debug("extension is "+extension);
		logger.info("fileName is "+fileName);
		if("xml".equalsIgnoreCase(extension)){
			fileReader = new MyXMLFileReader(); 
		}else if("flr".equalsIgnoreCase(extension)){
			fileReader = new MyFLRFileReader();
		}else{
			System.out.println("Invalid extension. Program will now exit");
			System.exit(10);
		}
		logger.debug("reading the input file");
		fileReader.initializeDatabase("src/main/resources/"+fileName);
		logger.debug("database initialised");
		while(true){
			System.out.println("Please select any one of the following:-");
			System.out.println("1 -- search for the meaning of a word");
			System.out.println("2 -- add a word");
			System.out.println("3 -- Exit");
			String option =bufferRead.readLine();
			Integer optionInt;
			try{
				optionInt=Integer.parseInt(option);
			}
			catch(NumberFormatException e) {
			 
			 System.out.println("Press return/enter to continue");
			 new Scanner(System.in).nextLine();
			 continue;
			}
			if(optionInt==1){
				System.out.println("enter word");
				String word =bufferRead.readLine();
				System.out.println(fileReader.getMeaning(word));
				System.out.println("Press enter to continue");
				new Scanner(System.in).nextLine();
				continue;
			}
			else if(optionInt==2){
				
				System.out.println("enter word and meaning separated by '=' sign");
				String wordMeaning =bufferRead.readLine();
				String[] values=wordMeaning.split("=");
				if(values.length>1){
				SimpleDateFormat df = new SimpleDateFormat("yyyymmdd");
				Entry entry = new Entry();
				entry.setWord(values[0]);
				entry.setMeaning(values[1]);
				entry.setDateOfEnrty(df.format(new Date()));
				fileReader.addWord(entry);
				}else{
					
					 System.out.println("Press return/enter to continue");
					 new Scanner(System.in).nextLine();
					 continue;
				}
			}
			else if(optionInt==3){
				
				System.out.println("Good Bye");
				System.exit(10);
			}
			else{
				
				 System.out.println("Press return/enter to continue");
				 new Scanner(System.in).nextLine();
				 continue;
			}
			
		}
				
		} catch (IOException e) {
			logger.error("exception occured with taking input from user",e);
		}
 

	}
	
	public static void readInputFile(String fileName){
		
	}

}
