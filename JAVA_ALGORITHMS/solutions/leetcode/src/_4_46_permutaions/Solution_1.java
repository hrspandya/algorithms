package _4_46_permutaions;

import java.util.ArrayList;
import java.util.List;

public class Solution_1 {
	public static void main(String[] args) {
		System.out.println(permutation(new int[]{1, 2, 3}));
	}
	
	public static List<List<Integer>> permutation(int[] nums){
		List<List<Integer>> result = new ArrayList<>();
		backtrack(result, new ArrayList<>(), nums);
		return result;
	}
	
	public static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums){
		if(tempList.size() == nums.length){
			list.add(new ArrayList<>(tempList));
		}else{
			for(int i = 0; i < nums.length; i++){
				if(tempList.contains(nums[i])){
					continue; //do not consider duplicate
				}
				tempList.add(nums[i]);
				backtrack(list, tempList, nums);
				tempList.remove(tempList.size() - 1);
			}
		}
	}
}
