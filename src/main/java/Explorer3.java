import java.util.*;
 public class Explorer3 {
 public static void main(String[] args) {
 TreeSet<Integer> s = new TreeSet<Integer>();
 TreeSet<Integer> subs = new TreeSet<Integer>();
 for(int i = 606; i < 613; i++)
 if(i%2 == 0) s.add(i);
 subs = (TreeSet)s.subSet(608, true, 611, true);
 System.out.println(s + " " + subs);
 s.add(629);
 System.out.println(s + " " + subs);
 
/*List a=new ArrayList() ;// = {1,2,3,4,5,7,8,9};
 a.add(1);
 a.add(2);
 a.add(3);
 a.add(4);
 a.add(6);
 a.add(7);
 a.add(8);
 a.add(9);*/
 
	
/*
 List b = a.subList(0,5);
 synchronized(b) {
 System.out.println(a);
 System.out.println(b);
 a.add(5);
 System.out.println(a);
 System.out.println(b.size());*/
 }
 }