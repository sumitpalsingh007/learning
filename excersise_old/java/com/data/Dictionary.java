package com.data;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name = "Dictionary")
//@XmlAccessorType (XmlAccessType.FIELD)
public class Dictionary {
	//@XmlElement(name = "Entry")
	List<Entry> entries=null;

	public List<Entry> getEntries() {
		return entries;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}
	
	
}
