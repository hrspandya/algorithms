package _7_73_set_matrix_zero;

public class Solution_1 {	
	/*
	 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
	 * 
	 * Solution: first loop through all and set starting index 0 for rows and cols when you find 0
	   then loop through all again and check if starting index of row or col == 0 then make them 0
	 */
	
	
	public static void main(String[] args) {
//		int[][] m = new int[4][4];
//		m[0] = new int[]{1, 1, 1, 1};
//		m[1] = new int[]{1, 0, 1, 1};
//		m[2] = new int[]{1, 1, 0, 1};
//		m[3] = new int[]{1, 1, 1, 0};		
//		printMatrix(m);
//		setZeroes(m);
//		printMatrix(m);
		
		
		int[][] n = new int[5][4];
		n[0] = new int[]{0, 0, 0, 5};
		n[1] = new int[]{4, 3, 1, 4};
		n[2] = new int[]{0, 1, 1, 4};
		n[3] = new int[]{1, 2, 1, 3};
		n[4] = new int[]{0, 0, 1, 1};		
		printMatrix(n);
		setZeroes(n);
		printMatrix(n);
		
	}
	
	public static void setZeroes(int[][] matrix) {		
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
	     int m = matrix.length, n = matrix[0].length;
	     boolean row = false, col = false;
	     for (int i = 0; i < m; i++)
	         for (int j = 0; j < n; j++){
	             if (matrix[i][j] == 0) {
	                 matrix[0][j] = 0;
	                 matrix[i][0] = 0;
	                 if (i == 0) row = true;
	                 if (j == 0) col = true;
	             }
	         }
	     
	     for (int i = 1; i < m; i++){
	         if (matrix[i][0] == 0){
	             for (int j = 1; j < n;j++)
	                 matrix[i][j] = 0;
	         }
	     }
	     
	     for (int j = 1; j < n; j++){
	         if (matrix[0][j] == 0){
	             for (int i = 1; i < m; i++)
	                 matrix[i][j] = 0;
	         }
	     }
	     
	     if (row){
	         for (int j = 0; j < n; j++)
	             matrix[0][j] = 0;
	     }
	     
	     if (col){
	         for(int i = 0; i < m; i++)
	             matrix[i][0] = 0;
	     }
		
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
