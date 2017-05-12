package _4_40_combination_sum_no_duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_1 {
	/*
	 * Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

	Each number in C may only be used once in the combination.
	
	Note:
	All numbers (including target) will be positive integers.
	The solution set must not contain duplicate combinations.
	For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8, 
	 */
	
	public static void main(String[] args) {
		System.out.println(combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5},  8));
	}
	
	public static List<List<Integer>> combinationSum2(int[] nums, int target){
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(result, new ArrayList(), nums, 0, target);
		return result;
	}
	
	public static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start, int remain){
		if(remain < 0){
			return;
		}else if(remain == 0){
			list.add(new ArrayList<>(tempList));			
		}else{
			for(int i = start; i < nums.length; i++){
				if(i > start && nums[i] == nums[i - 1]){
					continue;	//if we find duplicate continue, checking i > 0 because we need to check for nums[i - 1]
				}
				tempList.add(nums[i]);
				backtrack(list, tempList, nums, i + 1, remain - nums[i]);	//using i + 1, because we do not want to use same element again
				tempList.remove(tempList.size() - 1);
			}
		}
	}
	
}
