package _1_16_3sum_closest;

import java.util.Arrays;

public class Solution_1 {

	/*
	 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

    	For example, given array S = {-1 2 1 -4}, and target = 1.

    	The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
	 */
	
	public static void main(String[] args) {
		System.out.println("Input : {-1 2 1 -4}   Output: " + threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
	}
	
	public static int threeSumClosest(int[] nums, int target){
		if(nums.length < 3){
			return 0;
		}
		
		Arrays.sort(nums);
		
		int result = nums[0] + nums[1] + nums[2];
		
		for(int i = 0; i < nums.length - 2; i++){
			int start = i+1;
			int end = nums.length - 1;
			
			while(start < end){
				int sum = nums[i] + nums[start] + nums[end];
				
				if(sum < target){
					start++;
				}else{
					end--;
				}
				
				if(Math.abs(result - target) < Math.abs(sum - target)){
					result = result;
				}else{
					result = sum;
				}			
			}
			
		}
		
		return result;
	}
	
	
}
