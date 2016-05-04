package com.hp.ch1;

import java.util.HashMap;

/*
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures?
 */
public class Q1_1 {
	
	/*
	 * Brute force Method
	 * Put characters in an array and then loop through one by one to check if we find duplicate n^2 solution
	 */
	
	
	
	/*
	 * Second options is to put every character in hashmap and check if character already exist
	 */
	public static boolean isUniqueChars(String word){
		HashMap<Character, Character> map = new HashMap<>();
		
		for(int i = 0; i < word.length(); i++){
			char c = word.charAt(i);
			if(map.get(c) != null){
				return false;
			}
			map.put(c, c);
		}
		return true;
	}
	
	
	
	/*
	 * Best Solution without Data Structure or hashmap:
	 * Create an array of boolean convert character into asci number and change the value to true for that position
	 * before we change the value we check if array value at position is already true then we know its duplicate 
	 */
	public static boolean isUniqueCharts2(String word){
		//create array of boolean that goes till 128, a means 97, b means 98
		boolean[] array = new boolean[128];
		
		for(int i = 0; i < word.length(); i++){
			char c = word.charAt(i);
			int num = c;
			
			if(array[num] == true){
				return false;
			}
			
			array[num] = true;
		}
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
		String[] words = { "abcde", "hello", "apple", "kite", "padle" };
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word) + " : " + isUniqueCharts2(word));
		}
	}

}
