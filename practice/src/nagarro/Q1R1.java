package nagarro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Q1R1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(	new Q1R1().testString("nbacgddardsardo"));
	System.out.println(	new Q1R1().testString("anagarorpa"));
	System.out.println(	new Q1R1().testString("nagarro01"));
	}
	 
	boolean testString(String s){
        String s2=s;
		
		List<String> nagarro= new ArrayList();
		nagarro.add( "n");
		nagarro.add( "a");
		nagarro.add( "g");
		nagarro.add( "a");
		nagarro.add("r");
		nagarro.add( "r");
		nagarro.add( "o");
		//System.out.println(m);
		 int count=0;
		 for(String s1:nagarro){
			if(!s.contains(s1)){
				//break;
				System.out.println(s1 +" not found in "+ s2);
				break;
			}else{
				int i=s.indexOf(s1);
				 
				s=s.substring(i+1);
				count ++;
			}
		 }
		if(count==7){
			return true;
		}
		return false;
	}

}
