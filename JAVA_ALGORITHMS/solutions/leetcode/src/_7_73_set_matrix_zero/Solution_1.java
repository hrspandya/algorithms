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
		
		
		int[][] n = new int[4][4];
		n[0] = new int[]{1, 2, 3, 4};
		n[1] = new int[]{5, 0, 5, 2};
		n[2] = new int[]{8, 9, 2, 0};
		n[3] = new int[]{5, 7, 2, 1};
		//n[4] = new int[]{0, 0, 1, 1};		
		printMatrix(n);
		setZeroes(n);
		printMatrix(n);
		
	}
	
	public static void setZeroes(int[][] matrix) {		
		//first we make sure that every time we see 0 we make that column first cell and row first cell 0
		// then we loop through everything else except first row and first columns and make them 0, if previous condition met
		// then we check and make first row and first column 0 base on flag
		
		boolean fr = false;
		boolean fc = false;
		int rows = matrix.length;
		int cols = matrix[0].length;
		int i = 0;
		int j = 0;
		
		for(i = 0; i < rows; i++){
			for(j = 0; j < cols; j++){
				if(matrix[i][j] == 0){
					matrix[0][j] = 0;
					matrix[i][0] = 0;
					
					if(i == 0){
						fr = true;
					}
					
					if(j == 0){
						fc = true;
					}
				}
			}			
		}
		
		for(i = 1; i < rows; i++){
			for(j = 1; j < cols; j++){
				if(matrix[i][0] == 0 || matrix[0][j] == 0){
					matrix[i][j] = 0;
				}
			}
		}
		
		
		if(fr == true){
			for(j = 0; j < cols; j++){
				matrix[0][j] = 0;
			}
		}
		
		if(fc == true){
			for(i = 0; i < rows; i++){
				matrix[i][0] = 0;
			}
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
