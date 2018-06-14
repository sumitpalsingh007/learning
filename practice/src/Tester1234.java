import java.io.*;
 class Beagle {
 Beagle() { System.out.print("a"); }
 }
 class Dog extends Beagle implements Serializable {
 Dog() { System.out.print("d"); }
 }
  class Animal extends Dog { 
	  Animal(){
		  System.out.println("b");
	  }
  }
 
 public class Tester1234{
	 public static void main(String[] args){
		 
		 Animal dog = new Animal();
		 try
	      {
			 
	         FileOutputStream fileOut =
	         new FileOutputStream(new File("dog.ser"));
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(dog);
	         out.close();
	         fileOut.close();
	         //System.out.printf("&nbsp;Serialized data is saved in dog.ser");
	         
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
		 
		 try
	      {
	         FileInputStream fileIn = new FileInputStream("dog.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         Animal dog1 = (Animal) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         return;
	      }
	 }
 }