package _5_54_spiral_matrix;

import java.util.ArrayList;
import java.util.List;

public class Solution_1 {
	/*
	 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

		For example,
		Given the following matrix:
		
		[
		 [ 1, 2, 3 ],
		 [ 4, 5, 6 ],
		 [ 7, 8, 9 ]
		]
	 */
	
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		matrix[0] = new int[]{1, 2, 3};
		matrix[1] = new int[]{4, 5, 6};
		matrix[2] = new int[]{7, 8, 9};				
		System.out.println(spiralMatrix(matrix));
		
		int[][] matrix1 = new int[1][2];
		matrix1[0] = new int[]{1, 2};						
		System.out.println(spiralMatrix(matrix1));
	}
	
	public static List<Integer> spiralMatrix(int[][] matrix){
		List<Integer> res = new ArrayList<Integer>();
        
        if (matrix.length == 0) {
            return res;
        }
        
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse Right
            for (int j = colBegin; j <= colEnd; j ++) {
                res.add(matrix[rowBegin][j]);
            }
            rowBegin++;
            
            // Traverse Down
            for (int j = rowBegin; j <= rowEnd; j ++) {
                res.add(matrix[j][colEnd]);
            }
            colEnd--;
            
            if (rowBegin <= rowEnd) {	//we are checking for rows here because we want to make sure there is row to traverse left to
                // Traverse Left
                for (int j = colEnd; j >= colBegin; j --) {
                    res.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;
            
            if (colBegin <= colEnd) {	//we are checking for cols here because we want to make sure there is col to traverse upward to
                // Traver Up
                for (int j = rowEnd; j >= rowBegin; j --) {
                    res.add(matrix[j][colBegin]);
                }
            }
            colBegin ++;
        }
        
        return res;
	}
	
	
}
