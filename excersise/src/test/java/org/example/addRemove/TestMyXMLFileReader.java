package org.example.addRemove;

import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.Assert;

import org.example.newxmlschema.Entry;
import org.junit.Before;
import org.junit.Test;

public class TestMyXMLFileReader {
	
	MyXMLFileReader myXMLFileReader;
		
	@Before
	public void setUp() throws Exception {
		myXMLFileReader = new MyXMLFileReader();
	}


	@Test
	public void testInitializeDatabase() {
		myXMLFileReader.initializeDatabase("src/test/resources/TestDictionary.xml");
		Assert.assertNotNull(myXMLFileReader.dictionary);
		
	}

	@Test
	public void testGetMeaning() {
		myXMLFileReader.initializeDatabase("src/test/resources/TestDictionary.xml");
		Assert.assertEquals("happy", myXMLFileReader.getMeaning("sumit")) ;
	}

	@Test
	public void testAddWord() {
		String s ="a"+Math.random();
		SimpleDateFormat df = new SimpleDateFormat("yyyymmdd");
		myXMLFileReader.initializeDatabase("src/test/resources/TestDictionary.xml");
		Entry entry = new Entry();
		entry.setWord(s);
		entry.setMeaning("happy");
		entry.setDateOfEnrty(df.format(new Date()));
		Assert.assertEquals(true, myXMLFileReader.addWord(entry));
		Assert.assertEquals("happy", myXMLFileReader.getMeaning(s)) ;
	}

}
