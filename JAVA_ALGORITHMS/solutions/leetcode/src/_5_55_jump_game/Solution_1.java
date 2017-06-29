package _5_55_jump_game;

public class Solution_1 {
	/*
	 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
	
		Each element in the array represents your maximum jump length at that position.
		
		Determine if you are able to reach the last index.
		
		For example:
		A = [2,3,1,1,4], return true.
		
		A = [3,2,1,0,4], return false.
	*/
		
	public static void main(String[] args) {
		System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
		System.out.println(canJump(new int[]{3, 2, 1, 0, 4}));
	}
	
	public static boolean canJump(int[] nums) {
        if(nums == null || nums.length == 0){
        	return false;
        }
		
        for(int i = 0; i < nums.length; i++){
        	int j = 0;
        	
        	for(j = 0; j < nums[i]; j++){
        		
        	}
        	
        	i = i + j;
        	j = 0;
        	
        	if(i == nums.length - 1){
        		return true;
        	}
        }
        
		return false;
    }
}
