import java.io.*;
import java.util.Locale;
import java.util.Scanner;
 public class Maker {
 public static void main(String[] args) throws IOException {
	 
	 String test = "a1b2c3";
	  String[] tokens = test.split("\\d");
	  for(String s: tokens) System.out.print(s + " ");
	 
	 
 File dir = new File("dir");
 File f = new File(dir, "f");
 System.out.println("hi");
 f.createNewFile();
 System.out.println(f.exists());
 
 String finalfile = "";
 String workingDir = System.getProperty("user.dir");

 String filename = "testing.txt";
 finalfile = workingDir + File.separator + filename;

 System.out.println("Final filepath : " + finalfile);
 File file = new File(finalfile);

if (file.createNewFile()){
System.out.println("Done");
}else{
System.out.println("File already exists!");
try{/*
String csv = "Sue,5,true,3";
 Scanner scanner = new Scanner( csv );
 scanner.useLocale(Locale.US);
 scanner.useDelimiter(",");
 int age = scanner.nextInt();
 scanner.close();
*/}
 catch(Exception e){
	 e.printStackTrace(); }
 }
 }
 }