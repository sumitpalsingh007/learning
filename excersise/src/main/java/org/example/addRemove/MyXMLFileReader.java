package org.example.addRemove;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.example.newxmlschema.Dictionary;
import org.example.newxmlschema.Entry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyXMLFileReader implements MyFileReader {

	private static final Logger logger = LoggerFactory.getLogger(MyXMLFileReader.class);
	Dictionary dictionary;
	private File file;

	public void initializeDatabase(String fileName){

		if(dictionary==null){

			logger.debug("reading file "+fileName);
			file = new File(fileName);
			JAXBContext jaxbContext;
			try {
				jaxbContext = JAXBContext.newInstance("org.example.newxmlschema");

				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				dictionary = (Dictionary) jaxbUnmarshaller.unmarshal(file);
			} catch (JAXBException e) {
				logger.error("exception occured ",e);
			}
		}else{
			logger.debug("database is already initialized");
		}

	}

	public String getMeaning(String word) {
		logger.info("looking for "+word);
		List<Entry> entries=dictionary.getEntry();
		for(Entry entry:entries){
			if(entry.getWord().equals(word)){
				return entry.getMeaning();
			}
		}
		return "Word not in dictionary";

	}

	public boolean addWord(Entry e) {

		dictionary.getEntry().add(e);

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance("org.example.newxmlschema");
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(dictionary, file);

			return true;
		} catch (JAXBException e1) {
			logger.error("exception occured"+e1);
			return false;
		}

	}

}
