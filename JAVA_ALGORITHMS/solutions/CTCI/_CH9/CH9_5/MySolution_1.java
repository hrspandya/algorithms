package _CH9.CH9_5;

import java.util.ArrayList;
import java.util.List;

public class MySolution_1 {
	public static int counter = 0;
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3};
		
		System.out.println(arr.toString());
						
        counter = 0;
        System.out.println(permute(arr).toString());
				
	}
	
	public static List<List<Integer>> permute(int[] nums) {
	   List<List<Integer>> list = new ArrayList<>();
	   // Arrays.sort(nums); // not necessary
	   backtrack(list, new ArrayList<>(), nums, 3);
	   return list;
	}

	public static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int size){
	   if(tempList.size() == size){
	      list.add(new ArrayList<>(tempList));
	   } else{
	      for(int i = 0; i < nums.length; i++){ 	    	 
	         
	    	 if(tempList.contains(nums[i])){
	        	 continue; // element already exists, skip
	         }
	         
	         tempList.add(nums[i]);
	         backtrack(list, tempList, nums, size);
	         tempList.remove(tempList.size() - 1);
	      }
	   }
	} 
	
	
}
