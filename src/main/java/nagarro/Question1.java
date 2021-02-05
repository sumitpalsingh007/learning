package nagarro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Question1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap m = new HashMap();
		m.put(1, "n");
		m.put(2, "a");
		m.put(3, "g");
		m.put(4, "a");
		m.put(5, "r");
		m.put(6, "r");
		m.put(7, "o");

		//String s="nbacgddardsardo";
		//String s="anagarorpa";
		String s="nagarro01";
		String test="";
		List list = new ArrayList();
		Iterator i =m.entrySet().iterator();
		int count=0;
		while(i.hasNext()){
			String d=(String)m.get(((Map.Entry<Integer, String>)i.next()).getKey());

			if(s.contains(d)){
				int j=s.indexOf(d);
				s=s.substring(j+1);
				//list.add(j);
				count++;
			}
			else
				break;
			
		 
		}
		System.out.println(count==7);
		//System.out.println(list);
		//List list2=new ArrayList(list);
		//@SuppressWarnings("unchecked")
		// Collections.sort(list2);
		// System.out.println(list.equals(list2));

	}

}
