package _CH9.CH9_6;

import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

/*
 * Implement an algorithm to print all valid (i.e., properly opened and closed) combi- nations ofn-pairs of parentheses.
 */

public class MySolution_1 {
	
public static int counter = 0;
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4};
		
		System.out.println(arr.toString());
						
        counter = 0;
        System.out.println(permute(arr).toString());
				
	}
	
	public static List<List<Integer>> permute(int[] nums) {
	   List<List<Integer>> list = new ArrayList<>();
	   // Arrays.sort(nums); // not necessary
	   backtrack(list, new ArrayList<>(), nums, 3, 0);
	   return list;
	}

	public static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int size, int start){
	   if(tempList.size() == size){
	      list.add(new ArrayList<>(tempList));
	   } else{
		   
	      for(int i = 0; i < nums.length; i++){ 	    	 
	         
	    	 if(tempList.contains(nums[i])){
	        	 continue; // element already exists, skip
	         }
	    	 
	    	 int recentIndex = 0;
	    	 
	    	 if(tempList.size() > 0 ){
	    		 recentIndex = tempList.size() - 1;
	    		 
	    		 if(tempList.get(recentIndex) > nums[i]){
		        	 continue; // element already exists, skip
		    	 }
	    	 }	    	 	    		    	
	    	 	    	 	    	
	         tempList.add(nums[i]);
	         backtrack(list, tempList, nums, size, i);	         
	         tempList.remove(tempList.size() - 1);
	      }
	   }
	} 
	
}
