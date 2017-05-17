package _4_47_permutation_duplicates;

import java.util.ArrayList;
import java.util.List;

public class Solution_1 {
	public static void main(String[] args) {
		System.out.println(permutation2(new int[]{1, 1, 2}));
	}
	
	public static List<List<Integer>> permutation2(int[] nums){
		List<List<Integer>> result = new ArrayList<>();
		backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
		return result;
	}
	
	public static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, boolean[] used){
		if(tempList.size() == nums.length){
			list.add(new ArrayList<>(tempList));
		}else{
			for(int i = 0; i < nums.length; i++){
				
				if(used[i] == true || (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == false)){
					continue;
				}
				
				used[i] = true;
				tempList.add(nums[i]);
				backtrack(list, tempList, nums, used);
				used[i] = false;
				tempList.remove(tempList.size() - 1);
			}
		}
	}
	
}
