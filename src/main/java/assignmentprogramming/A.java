package assignmentprogramming;

import java.io.IOException;
import java.util.ArrayList;

class A {
	public static void main(String[] args){
		
	}
 public void process() { System.out.print("A,"); }}

public class B extends A {
 public void process() throws Exception {
 super.process();
 System.out.print("B,");
 throw new IOException();
 }
 public static  void main(String[] args) {
 try { new B().process(); }
 catch (IOException e) { System.out.println("Exception"); }
 }
 
 
 public void genNumbers() {
	  ArrayList numbers = new ArrayList();
	  for (int i=0; i<10; i++) {
	  int value = i * ((int) Math.random());
	  Integer intObj = new Integer(value);
	 numbers.add(intObj);
	  }
	  System.out.println(numbers);
	  }
 }