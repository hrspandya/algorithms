package _6_63_Minimum_Path_Sum;

public class Solution_1 {
	/*
	 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the 
	 * sum of all numbers along its path.
	
		Note: You can only move either down or right at any point in time.
	 */
	
	public static void main(String[] args) {
		int[][] grid = new int[4][4];
		grid[0] = new int[]{1, 2, 3, 4};
		grid[1] = new int[]{1, 2, 3, 4};
		grid[2] = new int[]{1, 2, 3, 4};
		grid[3] = new int[]{1, 2, 3, 4};
		
		printMatrix(grid);
		System.out.println(minPathSum(grid));
		printMatrix(grid);
	}
	
	public static int minPathSum(int[][] grid) {
		if(grid.length == 0){
			return 0;
		}
		
		int rows = grid.length;
		int cols = grid[0].length;
		
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				if(i == 0 && j == 0){
					grid[i][j] = grid[i][j];
					
				}else if(i == 0 && j != 0){
					grid[i][j] = grid[i][j] + grid[i][j - 1];
					
				}else if(j == 0 && i != 0){
					grid[i][j] = grid[i][j] + grid[i - 1][j];
					
				}else{
					grid[i][j] = grid[i][j] + Math.min(grid[i][j - 1], grid[i - 1][j]);
				}
			}
		}
		
		return grid[rows - 1][cols - 1];
	}
	
	
	public static void printMatrix(int[][] matrix){
		for(int r = 0; r < matrix.length; r++){
			String result = "[ ";
			for(int c = 0; c < matrix[r].length; c++){
				result = result + matrix[r][c] + " ";
			}
			result = result + "]";
			System.out.println(result);
		}
		System.out.println("-----------------------");
	}
	
}
