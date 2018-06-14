package com.reader;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestXMLFileReader {
	
	XMLFileReader fileReader;

	@Before
	public void setUp() throws Exception {
		fileReader= new XMLFileReader("/excersise/src/test/resources/TestDictionary.xml");
	}

	@Test
	public void testReadFile() {
		fileReader.readFile("//excersise///test///TestDictionary.xml");
		fail("Not yet implemented");
	}

}
