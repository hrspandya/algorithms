package _6_62_unique_paths_2;

public class Solution_1 {
	/*
	 * Follow up for "Unique Paths":
		
		Now consider if some obstacles are added to the grids. How many unique paths would there be?		
		An obstacle and empty space is marked as 1 and 0 respectively in the grid.
		
		For example,
		There is one obstacle in the middle of a 3x3 grid as illustrated below.	
		[
		  [0,0,0],
		  [0,1,0],
		  [0,0,0]
		]		
		The total number of unique paths is 2.
	 */
	
	public static void main(String[] args) {
		int[][] grid = new int[3][3];
		grid[0] = new int[]{0, 0, 0};
		grid[1] = new int[]{0, 1, 0};
		grid[2] = new int[]{0, 0, 0};
		
		System.out.println(uniquePathsWithObstacles(grid));
	}
	
	public static int uniquePathsWithObstacles(int[][] grid) {
        
		if(grid.length == 0){
			return 0;
		}
		
		int rows = grid.length;
		int cols = grid[0].length;
				
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				if(grid[i][j] == 1){	//we need to check this first because to make sure there is no 1, at the beginning
					grid[i][j] = 0;
				}else if(i == 0 && j == 0){	//we have to put this check before i == 0 or j == 0, because following checks depends upon cell [0][0]
					grid[i][j] = 1;
				}else if(i == 0){
					grid[i][j] = grid[i][j - 1];
				}else if(j == 0){
					grid[i][j] = grid[i - 1][j];
				}else{
					grid[i][j] = grid[i][j - 1] + grid[i - 1][j];
				}
			}
		}
		
		
        return grid[rows - 1][cols - 1];        
    }	
	
	
}
