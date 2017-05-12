package _3_39_combination_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_1 {
	
	/*
	 * Given a set of candidate numbers (C) (without duplicates) and a target number (T), 
	 * find all unique combinations in C where the candidate numbers sums to T.

		The same repeated number may be chosen from C unlimited number of times.
		
		Note:
		All numbers (including target) will be positive integers.
		The solution set must not contain duplicate combinations.
		For example, given candidate set [2, 3, 6, 7] and target 7, 
		A solution set is: 
	 */
	
	public static void main(String[] args) {
		combinationSum(new int[]{2, 3, 6, 4},  7);
	}
	
	public static List<List<Integer>> combinationSum(int[] nums, int target){		
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		backtrack(result, new ArrayList(), nums, target, 0);
		return result;
	}
	
	public static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start){
		
		if(remain < 0){
			return;
		}else if(remain == 0){
			list.add(new ArrayList<>(tempList));
		}else {
			for(int i = start; i < nums.length; i++){
				tempList.add(nums[i]);				
				backtrack(list, tempList, nums, remain - nums[i], i);	//we used i because we can reuse same element, i+1 will not use same element
				tempList.remove(tempList.size() - 1);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
