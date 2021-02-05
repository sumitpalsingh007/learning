package org.example.newxmlschema;

import static org.junit.Assert.fail;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import junit.framework.Assert;

import org.junit.Test;



public class TestNewSchema {

	@Test
	public void testSchema() {

		File file = new File("src/test/resources/TestDictionary.xml");
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance("org.example.newxmlschema");

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Dictionary dictionary = (Dictionary) jaxbUnmarshaller.unmarshal(file);
			System.out.println(dictionary);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//fail("Excpetion Occured in testSchema()");
		}

	}

	@Test
	public void testDataRead(){
		File file = new File("src/test/resources/TestDictionary.xml");
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance("org.example.newxmlschema");

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Dictionary dictionary = (Dictionary) jaxbUnmarshaller.unmarshal(file);
			Set<Entry> entries = new HashSet(dictionary.getEntry());
			boolean found=false;
			for(Entry entry:entries){
				if(entry.getWord().equals("sumit")){
					if(entry.getMeaning().equals("happy")){
						System.out.println("corresponding meaning found");
						found=true;
						break;
					}

				}
			}
			 Assert.assertEquals(true, found);
		} catch (JAXBException e) {
			e.printStackTrace();
			fail("Excpetion Occured in testSchema()");
		}
	}


}
