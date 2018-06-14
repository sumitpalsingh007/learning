package com.launch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dictionary.Dictionary;
import com.reader.XMLFileReader;

public class LaunchDictionary {

	static final Logger logger = LoggerFactory.getLogger(LaunchDictionary.class);
	static String fileName;
			
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
			new Dictionary(new XMLFileReader("")).launch();
		}else if("flr".equalsIgnoreCase(extension)){
			
		}
		} catch (IOException e) {
			logger.error("exception occured with taking input from user",e);
		}
 

	}

}
