import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

 public class Drink implements Comparable {
 public String name;
 public int compareTo(Object o) {
 return 0;
 }
  
	
 public static void main(String[] args){
 Drink one = new Drink();
 Drink two = new Drink();
  one.name= "Coffee";
  two.name= "Tea";
  TreeSet set = new TreeSet();
  HashSet set1= new HashSet();
  set.add(one);
 boolean test= set.add(two);
  
 set1.add(one);
 boolean test1= set1.add(two);
 
   System.out.println(set.size()+"  "+test);
   System.out.println(set1.size()+"  "+test1);
   
    
 }
 }