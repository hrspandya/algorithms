package _1_11_container_with_most_water;

public class Solution_1 {

	public static void main(String[] args) {
		System.out.println("Input 1 8 6 2 5 4 8 3 7    Output: " + maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}) + "");
	}
	
	
	public static int maxArea(int[] height){
		int maxArea = 0;
		
		if(height == null || height.length < 2){
			return maxArea;
		}
		
		int start = 0; 
		int end = height.length - 1;		
		
		while(end > start){
			int x = height[start];
			int y = height[end];
			int area = Math.min(x, y) * (end - start);
			maxArea = (maxArea > area) ? maxArea : area;
			
			if(height[start] < height[end]){
				start++;
			}else{
				end--;
			}
		}
		
		return maxArea;
	}
}
