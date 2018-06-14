package org.example.addRemove;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.example.newxmlschema.Entry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyFLRFileReader implements MyFileReader {

	private static final Logger logger = LoggerFactory.getLogger(MyXMLFileReader.class);

	File file;

	public String getMeaning(String word) {
		logger.info("searching for "+word);
		BufferedReader br = null;
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader(file));
			while ((sCurrentLine = br.readLine()) != null  && sCurrentLine.length()>20) {
				String name = sCurrentLine.substring(0,20);
				String meaning;
				if(sCurrentLine.length()>70){
					meaning= sCurrentLine.substring(20,70);
				}else{
					meaning=sCurrentLine.substring(20);
				}
				name=name.trim();
				if(name.equals(word)){
					//System.out.println(name+"="+meaning);
					return meaning;
				}
			}

		} catch (IOException e) {
			logger. error("exception occured", e);
		}

		return "Word not in dictionary";
	}

	public boolean addWord(Entry e) {
		FileWriter fw;
		try {
			fw = new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter bw = new BufferedWriter(fw);
			SimpleDateFormat df = new SimpleDateFormat("yyyymmdd");
			String finalString;
			String word;
			String meaning;
			if(e.getWord().length()>20){
				System.out.println("Word cannot be greater then 20");
				return false;
			}else{
				word=e.getWord()+"                    ".substring(e.getWord().length());

			} 
			if(e.getMeaning().length()>50){
				System.out.println("Meaning cannot be greater then 50");
				return false;
			}else{
				meaning=e.getMeaning()+"                                                  ".substring(e.getWord().length());
			}

			finalString=word+meaning+df.format(new Date());
			bw.newLine();
			bw.write(finalString);
			bw.close();
			logger.info("word added--"+finalString);
		} catch (IOException e1) {
			logger. error("exception occured", e1);
		}
		return true;
	}

	public void initializeDatabase(String fileName) {
		if(null==file)
			file = new File(fileName);

	}

}
