package customer;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.reader.Entry;

public class JAXBExample {
	public static void main(String[] args) {
 
	 try {
 
		File file = new File("E:\\practicePrograms\\excersise\\java\\customer\\file.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
 
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
		System.out.println(customer);
		
		
		
		File file1 = new File("E:\\practicePrograms\\excersise\\java\\com\\reader\\TestDictionary.xml");
		JAXBContext jaxbContext1 = JAXBContext.newInstance(Entry.class);
 
		Unmarshaller jaxbUnmarshaller1 = jaxbContext1.createUnmarshaller();
		Entry entry = (Entry) jaxbUnmarshaller1.unmarshal(file);
		System.out.println(entry);
 
	  } catch (JAXBException e) {
		e.printStackTrace();
	  }
 
	}
}