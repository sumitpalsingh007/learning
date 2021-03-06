//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.29 at 10:43:36 AM IST 
//


package org.example.newxmlschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Entry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Entry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="word" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="meaning" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dateOfEnrty" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entry")
public class Entry {

    @XmlAttribute(name = "word")
    protected String word;
    @XmlAttribute(name = "meaning")
    protected String meaning;
    @XmlAttribute(name = "dateOfEnrty")
    protected String dateOfEnrty;

    /**
     * Gets the value of the word property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWord() {
        return word;
    }

    /**
     * Sets the value of the word property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWord(String value) {
        this.word = value;
    }

    /**
     * Gets the value of the meaning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeaning() {
        return meaning;
    }

    /**
     * Sets the value of the meaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeaning(String value) {
        this.meaning = value;
    }

    /**
     * Gets the value of the dateOfEnrty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfEnrty() {
        return dateOfEnrty;
    }

    /**
     * Sets the value of the dateOfEnrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfEnrty(String value) {
        this.dateOfEnrty = value;
    }

    
    public int hashCode(){
    	return this.word.hashCode();
    	
    }
    
    public boolean equals(Object o){
    	return this.getWord().equals(((Entry)o).getWord());
    }
}
