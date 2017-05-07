package _1_15_3sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_1 {
	
	public static void main(String[] args) {
		List<List<Integer>> result1 = threeSum(new int[]{-2,0,1,1,2});
		System.out.println(result1);
		
		List<List<Integer>> result = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
		System.out.println(result);
			
	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		
		if(nums.length < 3){
			return result;
		}		
		
		//We should sort the array for ease of use and predictable results		
		Arrays.sort(nums);
		
		for(int i = 0; i < nums.length - 2; i++){
			
			int j = i + 1; //start pointer
			int k = nums.length - 1; //end pointer
			
			if(i > 0 && nums[i] == nums[i - 1]){
				continue; // because we are looking for only Unique values
			}
			
			int target = -nums[i];
			
			while(j < k){
				
				if(nums[j] + nums[k] == target){	//we have found the match
					List<Integer> tempList = new ArrayList();
					tempList.add(nums[i]);
					tempList.add(nums[j]);
					tempList.add(nums[k]);					
					result.add(tempList);
					
					//reduce both since we found a match
					j++;
					k--;
					
					while(j < k && nums[j] == nums[j - 1]){
						j++;	//for duplicate check
					}
					
					while(j < k && nums[k] == nums[k + 1]){
						k--;	//for duplicate check 
					}
					
				}else if(nums[j] + nums[k] > target){
					k--; //since it is sorted array
				}else{
					j++;
				}
				
			}
					
		}
		
		
		return result;
	}
    
}
