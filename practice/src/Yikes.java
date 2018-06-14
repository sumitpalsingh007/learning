import java.io.Console;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Yikes {

	public static void go(Long n) {System.out.print("Long ");}
	public static void go(Short n) {System.out.print("Short ");}
	//public static void go(int n) {System.out.print("int ");}
	public static void go(double n) {System.out.print("double ");}
	public static void main(String [] args) {
		short y = 6;
		int z = 7;
		go(y);
		go(z);
		
		//DateFormat df = new DateFormat(); 
		DateFormat df = DateFormat.getDateInstance(1,Locale.ITALY);
		Date date = new Date();
		// df.setLocale();
		 String s = df.format(date);
		 System.out.println(s);
		 
		 /*Console c = System.console();
		 char[] pw = c.readPassword("%s", "pw: ");
		  System.out.println("got " + pw);
		  String name = c.readLine("%s", "name: ");
		  System.out.println(" got "+ name);*/
		  
		  String test = "This is a test";
		   String[] tokens = test.split("\\s");
		   System.out.println(tokens.length);
	}
}