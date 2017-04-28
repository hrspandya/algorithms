package _CH11.CH11_2;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;

public class Solution_1 {

	/*
	 * Write a method to sort an array of strings so that all the anagrams are next to each other.
	 * 
	 * Solution: anagram string can be found very easily by sorting them. So we take every string from array sort string and 
	 * put them in hashMap and in the end loop through hash map and we got the result.
	 */
	
	
	public static void main(String[] args) {	
		String[] array = {"apple", "banana", "carrot", "ele", "duck", "papel", "tarroc", "cudk", "eel", "lee"};
		Hashtable<String, LinkedList<String>> hash = groupAnagram(array);
		System.out.println(hash);
	}
	
	public static Hashtable<String, LinkedList<String>> groupAnagram(String[] arr){
		Hashtable<String, LinkedList<String>> hash = new Hashtable<>();
		
		for(int i = 0; i < arr.length; i++){
			
			char[] strArray = arr[i].toCharArray();
			Arrays.sort(strArray);			
			String sortedString = new String(strArray); //VERY IMPORTANT, char[] to String is not possible by doing .toString()
			
			if(!hash.containsKey(sortedString)){					
				hash.put(sortedString, new LinkedList<>());
			}else{
				hash.get(sortedString).push(arr[i]);
			}
			
		}		
		
		return hash;
		
	}
	
	
}
