package nagarro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q3R1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Q3R1().test("abcde"));
		//System.out.println(new Q3R1().test("hello"));
		//System.out.println(new Q3R1().test("abab"));
	}

	List<String> test(String s){/*
		
		Map<Integer,String> input = new HashMap();
		
		for(int i=0;i<s.length();i++){
			for(int j=1;j<=s.length();j++){
				if(i<j){
				String tempString = s.substring(i,j);
				finalSet.add(tempString);
				}
			}
		}
		List<String> finalList = new ArrayList(finalSet);
		Collections.sort(finalList);
		return finalList;
		
	*/

		Set<String> finalSet = new HashSet();
				String temp = new String(s);
		for(int i=0;i<s.length();i++){
		String firstString = s.substring(i,i+1);
		while(!temp.isEmpty()){
		//temp.indexOf(firstString);
		finalSet.add(firstString.concat( s.substring(s.indexOf(temp),s.indexOf(temp)+1)));
		temp=temp.substring(0,temp.length()-1);
		}
		
		}
			 
		List<String> finalList = new ArrayList(finalSet);
		Collections.sort(finalList);
		return finalList;
		
		
	}
}
