package com.sun.scjp;

public class SuperTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperTest s = new SuperTest();
		System.out.println(s.count("HiSumit124hiSumithi12345Sumit","Sumit"));

	}
	int count(String orgString, String toSearch){
		   // find the number of times toSearch occurs in orgString
		int counting=0;
		while(orgString.contains(toSearch)){
		// int i=	orgString.indexOf(toSearch);
			counting++;
			orgString=orgString.replaceFirst(toSearch, "");
		}
		return counting;
		}

}
