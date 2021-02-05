package org.example.addRemove;

import org.example.newxmlschema.Dictionary;
import org.example.newxmlschema.Entry;

public interface MyFileReader {
	
	public String getMeaning(String word);
	
	public boolean addWord(Entry e);
	
	public void initializeDatabase(String fileName);

}
