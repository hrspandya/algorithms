package com.hp.ch1;

import java.util.Arrays;

/*
 * Given two strings, write a method to decide if one is a permutation of the other.
 */

public class Q1_3 {
	
	/*
	 * Best way is to sort both words and check if they both are same, if so they are permutation of each other
	 * Permutation is only possible if both have string length of same size
	 */
	public static boolean permutation1(String word1, String word2){
		char[] w1 = word1.toCharArray();
		Arrays.sort(w1);
		
		char[] w2 = word2.toCharArray();
		Arrays.sort(w2);
		
		if(new String(w1).equalsIgnoreCase(new String(w2))){
			return true;
		}
		return false;
	}
	
	
	/*
	 * take first word, convert each character to ascii number sum them up, if both word has same sum value they both are permutation of each other
	 */	
	public static boolean permutation2(String word1, String word2){
		int word_1_sum = 0;
		int word_2_sum = 0;
		
		if(word1.length() == word2.length()){
			
			for(int i = 0; i < word1.length(); i++){
				int num1 = word1.charAt(i);
				word_1_sum = word_1_sum + num1;
				
				int num2 = word2.charAt(i);
				word_2_sum = word_2_sum + num2;
				
				if(word_1_sum == word_2_sum){
					return true;
				}
			}
			
		}
				
		return false;
	}
	
	
	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];			
			System.out.println(word1 + ", " + word2 + ": ");
			System.out.println(permutation1(word1, word2));			
			System.out.println(permutation2(word1, word2));
			System.out.println(" ----------------- ");
		}
	}
	
	
}
