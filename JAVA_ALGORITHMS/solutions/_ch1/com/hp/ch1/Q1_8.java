package com.hp.ch1;
/*
 * Assume you have a method isSubstring which checks if one word is a substring of another. 
 * Given two strings, s i and s2, write code to check if s2 is a rotation of si using only one call to isSubstring 
 * (e.g.,"waterbottle"is a rota- tion of "erbottlewat").
 */
public class Q1_8 {

	public static boolean isRotation(String s1, String s2){
		String concatStr = s1.concat(s1);
		if(concatStr.indexOf(s2) >= 0){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {		
		System.out.println(isRotation("waterbottle", "erbottlewat"));
		System.out.println(isRotation("apc", "cap"));
		System.out.println(isRotation("123", "213"));		
	}
}
