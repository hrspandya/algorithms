package _CH1;

import java.util.HashMap;

/*
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 */

public class Q1_7 {
	
	public static int[][] setZero(int[][] matrix){
		
		HashMap<Integer, Boolean> rowMap = new HashMap<>();
		HashMap<Integer, Boolean> colMap = new HashMap<>();
		
		for(int r = 0; r < matrix.length; r++){
			for(int c = 0; c < matrix[0].length; c++){
				if(matrix[r][c] == 0){
					rowMap.put(r, true);
					colMap.put(c, true);
				}						
			}
		}
		
		for(int r = 0; r < matrix.length; r++){
			for(int c = 0; c < matrix[0].length; c++){
				if(rowMap.get(r) != null && rowMap.get(r) == true){
					matrix[r][c] = 0;
				}else if(colMap.get(c) != null && rowMap.get(c) == true){
					matrix[r][c] = 0;
				}
			}
		}
		
		return matrix;
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
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{0, 1, 1}, {1, 1, 1}, {1, 1, 1}};
		printMatrix(matrix);
		System.out.println("");
		int[][] result = setZero(matrix);
		printMatrix(result);
	}
}
