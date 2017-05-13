package _3_33_search_rotated_array;

public class Solution_1 {
	
	public static void main(String[] args) {
		System.out.println("Input:     Output : " + search(new int[]{6, 7, 1, 2, 3, 4, 5}, 7));
	}
	
	public static int search(int[] nums, int target){
		int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if (nums[mid] == target)
                return mid;
        
            if (nums[start] <= nums[mid]){
                 if (target < nums[mid] && target >= nums[start]) 
                    end = mid - 1;
                 else
                    start = mid + 1;
            } 
        
            if (nums[mid] <= nums[end]){
                if (target > nums[mid] && target <= nums[end])
                    start = mid + 1;
                 else
                    end = mid - 1;
            }
        }
        return -1;
	}
	
}
