package com.hp.a_simpleRecursion;

import java.util.ArrayList;

public class MyPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(perm("abc"));		
		
	}

	
	public static ArrayList<String> perm(String str){
		ArrayList<String> result = new ArrayList<String>();
		
		if(str.length() <= 0){
			return new ArrayList<String>();
			
		}else if(str.length() == 1){
			ArrayList<String> a = new ArrayList<String>();
			a.add(str);
			return a;
			
		}else if(str.length() == 2){
			
			ArrayList<String> a = new ArrayList<String>();
			
			//put same string in the array
			a.add(str);
			
			//Swap and put string in the array
			String swapStr = str.charAt(1) + ""+ str.charAt(0);
			a.add(swapStr);
			
			return a;
		}else {
			
			//For loop through all individual characters and perform perm
			for(int i = 0; i < str.length(); i++){
				
				//Keep character at index as it is and do perm on the rest of the word
				String subString = str.substring(0, i) + str.substring(i+1);
				
				//store sub arrays which is returned by perm method 
				ArrayList<String> subArray =  perm(subString);
				
				//add character at index back 
				for(int j = 0; j < subArray.size(); j++){
					subArray.set(j, str.charAt(i) +""+ subArray.get(j));
				}
				
				//concatenate all sub arrays in result
				result.addAll(subArray);
				
			}
			
		}
				
		return result;
	}
}
