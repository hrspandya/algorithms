package _CH1;

import java.util.HashMap;

/*
 * Implement a method to perform basic string compression using the counts of repeated characters. 
 * For example, the string aabcccccaaa would become a2blc5a3. 
 * If the "compressed" string would not become smaller than the orig- inal string, 
 * your method should return the original string
 */

public class Q1_5 {
		
	public static void main(String[] args) {		
		
		System.out.println(compression("aabcccccaaa"));
		System.out.println(compression("abca"));
		System.out.println(compression("aaaaa"));
		System.out.println(compression("a"));
		System.out.println(compression(""));
	}
	
	/*
	 * You can also Implement this with Ascii code way without using Data Structure 
	 */
	
	
	/*
	 * Implementation with HashMap 
	 */
	private static String compression(String str) {
		HashMap<String , Integer> map = new HashMap<>();
		String result = "";
		String last = null;
		
		for(int i = 0; i < str.length(); i++){
			String current = String.valueOf(str.charAt(i));			
			
			if(last == null){
				last = current;
				map.put(current, 1);
			}else if(current.equalsIgnoreCase(last)){
				map.put(current, map.get(current) != null ? map.get(current).intValue() + 1 : 1);
			}else{
				result = result + last + map.get(last).intValue();
				map.put(last, 0); //reset last value
				map.put(current, 1);
				last = current;				
			}
			
			if(i == str.length() - 1){
				result = result + current + map.get(current).intValue();
			}
			
		}
		
		
		return result;
	}
}
