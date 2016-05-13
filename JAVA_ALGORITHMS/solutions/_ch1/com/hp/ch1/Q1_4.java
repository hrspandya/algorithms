package com.hp.ch1;

public class Q1_4 {

	/*
	 * Write a method to replace all spaces in a string with'%20'. You may assume that the string has sufficient space at the end of the string 
	 * to hold the additional characters, and that you are given the "true" length of the string. 
	 * (Note: if imple- menting in Java, please use a character array so that you can perform this opera- tion in place.)
	 * 
	 * EXAMPLE
	 * Input: "Mr John Smith 
	 * Output: "Mr%20Dohn%20Smith"
	 * 
	 */
	
	public static String updateString(String str) {
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(String.valueOf(c).equalsIgnoreCase(" ")){
				result = result.concat("%20");
			}else{
				result = result.concat(String.valueOf(c));
			}
		}
		
		return result;
	}
		
	public static void main(String[] args) {
		System.out.println(updateString("Mr John Smith"));
	}
}
