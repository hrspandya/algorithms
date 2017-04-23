package _CH9.CH9_4;

import java.util.ArrayList;
import java.util.List;

public class MySolution_1 {

	/*
	 * Write a method to return all subsets of aset. 
	 */

	
	public static void main(String[] args) {
		
		int[] list = {1, 2, 3};
		System.out.println(list.toString());
		System.out.println(findSubset(list));	
	}

	private static String findSubset(int[] list) {
				
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();		
		result.add(new ArrayList<>());
		
		for(int i = 0; i < list.length; i++){
			int item = list[i];
			
			ArrayList<ArrayList<Integer>> newSubList = new ArrayList<>();
			
			for(int j = 0; j < result.size(); j++){				
				ArrayList<Integer> subList = new ArrayList<>();				
				subList.addAll(result.get(j));
				subList.add(item);
				newSubList.add(subList);
			}
			
			result.addAll(newSubList);
		}
				
		return result.toString();
	}
	
}
