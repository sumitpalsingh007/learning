package org.example.addRemove;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.Assert;

import org.example.newxmlschema.Entry;
import org.junit.Before;
import org.junit.Test;

public class TestMyFLRFileReader {
	
	MyFLRFileReader myFLRFileReader;

	@Before
	public void setUp() throws Exception {
		myFLRFileReader= new MyFLRFileReader();
	}

	@Test
	public void testGetMeaning() {
		myFLRFileReader.initializeDatabase("src/test/resources/TestDictionary.flr");
		Assert.assertEquals("meaning", myFLRFileReader.getMeaning("12345678901234567890"));
		
	}

	@Test
	public void testAddWord() {
		myFLRFileReader.initializeDatabase("src/test/resources/TestDictionary.flr");
		String s ="a"+Math.random();
		if(s.length()>20){
		s=s.substring(0, 20);
		}else{
			s=s+"                    ".substring(s.length());
		}s.length();
		SimpleDateFormat df = new SimpleDateFormat("yyyymmdd");
		myFLRFileReader.initializeDatabase("src/test/resources/TestDictionary.xml");
		Entry entry = new Entry();
		entry.setWord(s);
		entry.setMeaning("happy");
		entry.setDateOfEnrty(df.format(new Date()));
		Assert.assertEquals(true, myFLRFileReader.addWord(entry));
		
	}

	@Test
	public void testInitializeDatabase() {
		myFLRFileReader.initializeDatabase("src/test/resources/TestDictionary.flr");
		Assert.assertNotNull(myFLRFileReader.file);
	}

}
