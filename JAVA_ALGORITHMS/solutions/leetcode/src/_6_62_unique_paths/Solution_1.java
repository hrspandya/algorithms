package _6_62_unique_paths;

public class Solution_1 {
/*
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

	The robot can only move either down or right at any point in time. 
	The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).	
	How many possible unique paths are there?
	
	
	Above is a 3 x 7 grid. How many possible unique paths are there?	
	Note: m and n will be at most 100.
 */
	
	public static void main(String[] args) {
		//System.out.println(uniquePaths(3, 7));
		System.out.println(uniquePathsDP(3, 7));		
	}
	
	/*
		DP is like smart recursion, you solve it for small portion and go form there.
	 */
	public static int uniquePathsDP(int m, int n){
		int[][] grid = new int[m][n];
	    for(int i = 0; i<m; i++){
	        for(int j = 0; j<n; j++){
	            if(i==0||j==0)
	                grid[i][j] = 1;
	            else
	                grid[i][j] = grid[i][j-1] + grid[i-1][j];
	        }
	    }
	    return grid[m-1][n-1];
	}
	
	
}
