package _4_41_first_missing_positive;

import java.util.Arrays;

public class Solution_1 {

	public static void main(String[] args) {
		System.out.println(firstMissingPositive(new int[]{1,0}));
	}
	
	public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int result = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                if(i > 0){
                    if(nums[i] - nums[i-1] == 1){
                        //good
                    	result = nums[i] + 1;
                        continue;
                    }else{
                        return nums[i - 1] + 1;
                    }                    
                }else{
                    if(nums[i] > 1){
                        result = nums[i] - 1;
                    }else{
                        result = nums[i] + 1;
                    }
                }
            }
        }
        
        return result;
    }
	
}
