package _2_26_remove_duplicates;

public class Solution_1 {
	
	/*
	 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

		Do not allocate extra space for another array, you must do this in place with constant memory.
		
		For example,
		Given input array nums = [1,1,2],
		
		Your function should return length = 2,
	 */
	
	
	public static void main(String[] args) {
		
	}
	
	public int removeDuplicates(int[] nums) {
        //first check if nums length <= 1 then just return
        if(nums.length <= 1){
            return nums.length;
        }
        
        int id = 0;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                //no need to increment the id counter
            }else{
                id++;
                nums[id] = nums[i];
            }
        }
        
        id = id + 1;
        return id;
    }
	
}
