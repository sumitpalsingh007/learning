package com.reader;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.dictionary.Dictionary;

public class XMLFileReader implements FileReader{
	
	String fileName;
	
	public XMLFileReader(String fileName){
		fileName=fileName;
	}
	
	public void readFile(String fileName) {
		File file = new File(fileName);	
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Dictionary.class);
			
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			//jaxbUnmarshaller.
			Dictionary word = (Dictionary)jaxbUnmarshaller.unmarshal(file)	;	 
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){

		File file = new File("E:\\practicePrograms\\excersise\\java\\com\\reader\\TestDictionary.xml");	
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Entry.class);
			
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			//jaxbUnmarshaller.
			Entry word = (Entry)jaxbUnmarshaller.unmarshal(file)	;	 
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
