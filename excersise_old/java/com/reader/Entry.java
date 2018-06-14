package com.reader;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 

@XmlRootElement 
public class Entry {
	
	
	String word;
	String meaning;
	 
	String dateOfEntry;
	
	public String getWord() {
		return word;
	}
	@XmlAttribute
	public void setWord(String word) {
		this.word = word;
	}
	public String getMeaning() {
		return meaning;
	}
	@XmlElement 
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	public String getDateOfEntry() {
		return dateOfEntry;
	}
	@XmlElement 
	public void setDateOfEntry(String dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}
	
	

}
