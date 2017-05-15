package _4_49_group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution_1 {
		/*
		 * Given an array of strings, group anagrams together.

		For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
		Return:
		
		[
		  ["ate", "eat","tea"],
		  ["nat","tan"],
		  ["bat"]
		]
	 */
	
	public static void main(String[] args) {
		System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
	}
	
	//what is anagram, it means using rotation you can get more string
	//so by sorting both string if they both are same then we know they are anagram
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		if(strs == null || strs.length == 0){
			return new ArrayList<>();
		}
		
		HashMap<String, List<String>> map = new HashMap<>();
		
		for(int i = 0; i < strs.length; i++){
			char[] strArray = strs[i].toCharArray();
			Arrays.sort(strArray);
			String str =String.valueOf(strArray);
			
			if(map.containsKey(str)){
				map.get(str).add(strs[i]);			//insert into map array
			}else{
				map.put(str, new ArrayList<>());	//add new array
				map.get(str).add(strs[i]);
			}			
		}				
		
		return new ArrayList<>(map.values());
    }
	
}
