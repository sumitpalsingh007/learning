
 import java.util.*;
 public class Quest {
 public static void main(String[] args) {
 /*String[] colors = {"blue", "red", "green", "yellow", "orange"};
 Arrays.sort(colors);
 int s2 = Arrays.binarySearch(colors, "orange");
 int s3 = Arrays.binarySearch(colors, "violet");
 System.out.println(s2 + " " + s3);*/
 
  HashMap props = new HashMap();
  props.put("key45", "some value");
  props.put("key12", "some other value");
  props.put("key39", "yet another value");
  Set s = props.keySet();
  s = new TreeSet(s);
  //C. Collections.sort(s);
  try{
  ThreadTest threadTest = new ThreadTest();
  threadTest.waitForSignal();
  }catch(Exception e){
	  e.printStackTrace();
  }
  synchronized(Quest.class){
	  
  }
 }
 }
