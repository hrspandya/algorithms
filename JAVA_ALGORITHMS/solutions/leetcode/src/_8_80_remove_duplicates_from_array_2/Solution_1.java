package _8_80_remove_duplicates_from_array_2;

public class Solution_1 {
	/*
	 * Follow up for "Remove Duplicates":
		What if duplicates are allowed at most twice?
		
		For example,
		Given sorted array nums = [1,1,1,2,2,3],
		
		Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
	 */
	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[]{1, 1, 1, 2}, 2));
	}
	
	public static int removeDuplicates(int[] nums, int k) {
        int value = 0;
        int start = 1;
        int limit = 1;
        int length = 1;        
        
        for(int i = 0; i < nums.length; i++){
        	value = nums[i];
        	if(nums.length - 1 - i > 0){
        		if(nums[i+1] == value){
        			limit++;
        		}else{
        			limit = 1;        			
        		}
        		
        		if(limit > k){
        			//dont increase start 
        		}else{
        			nums[start] = nums[i+1];
        			start++;
        			length++;        			
        		}   
        	}
        }
        
		return length;
    }
}
