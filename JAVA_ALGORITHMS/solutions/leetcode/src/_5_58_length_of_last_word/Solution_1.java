package _5_58_length_of_last_word;

import sun.applet.Main;

public class Solution_1 {
	
	/*
	 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

		If the last word does not exist, return 0.
		
		Note: A word is defined as a character sequence consists of non-space characters only.
		
		For example, 
		Given s = "Hello World",
		return 5.
	 */
	
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello world"));
	}
	
	public static int lengthOfLastWord(String s){
		if(s == null || s.length() == 0){
			return 0;		
		}
		
		if(s.trim().length() == 0){
			return 0;
		}		
		
		String[] list = s.split(" ");
		String lastWord = list[list.length - 1];		
		return lastWord.length();
	}
}
