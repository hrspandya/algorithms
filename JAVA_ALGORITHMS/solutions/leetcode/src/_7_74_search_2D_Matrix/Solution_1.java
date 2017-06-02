package _7_74_search_2D_Matrix;

import _0_commonLibs.CommonLibs;

public class Solution_1 {
	/*
	 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

		Integers in each row are sorted from left to right.
		The first integer of each row is greater than the last integer of the previous row.
		For example,
		
		Consider the following matrix:
		
		[
		  [1,   3,  5,  7],
		  [10, 11, 16, 20],
		  [23, 30, 34, 50]
		]
		Given target = 3, return true.
	 */
	
	public static void main(String[] args) {
		int[][] matrix = new int[3][4];
		matrix[0] = new int[]{1, 2, 3, 4};
		matrix[1] = new int[]{5, 6, 7, 8};
		matrix[2] = new int[]{9, 10, 11, 12};
		
		CommonLibs.printMatrix(matrix);
		System.out.println(searchMatrix(matrix, 3));
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
		int start = 0;
		int end = (matrix.length * matrix[0].length) - 1;
		int rows = matrix.length;
		int cols = matrix[0].length;
		int mid = (start + end)/2;
		
		while(start <= end){			
			mid = (start + end)/2;
			int value = matrix[mid / cols][mid % cols];
			
			if(value == target){
				return true;
			}
			
			if(target < value){
				end = mid - 1;				
			}else{
				start = mid + 1;
			}
		}
		
		return false;
    }
	
	
}
