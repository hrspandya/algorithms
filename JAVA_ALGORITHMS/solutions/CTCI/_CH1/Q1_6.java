package _CH1;
	
/*
 * Given an image represented by an NxN matrix, 
 * where each pixel in the image is 4 bytes, 
 * write a method to rotate the image by 90 degrees. Can you do this in place? 
 */


public class Q1_6 {
	/*
	 * remember that when we want to rotate the matrix to 90 degree
	 * first row becomes last column (means r0 = c2, which means r0 = c[matrix.length - 1 - r],   r0 = c[3-1-0],     r0 = c[2]) 
	 * 2nd row becomes 2nd column (means r1 = c1, which means r1 = c[matrix.length - 1 - r],   r1 = c[3-1-1],     r1 = c[1])
	 * last row becomes first column (means r2 = c1, which means r2 = c[matrix.length - 1 - r],   r2 = c[3-1-2],     r2 = c[0])
	 * 
	 * similarly 
	 * c0 = r0,   c1 = r1,   c2 = r2
	 */
	
	private static int[][] rotate(int[][] matrix) {
		int rLength = matrix.length;
		int cLength = matrix[0].length;
		int[][] result = new int[rLength][cLength];
		
		for(int r = 0; r < matrix.length; r++){
			for(int c = 0; c < matrix[r].length; c++){
				result[c][matrix.length - 1 - r] = matrix[r][c];
			}
		}	
		
		return result;
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
		
		int[][] matrix = {{1, 0, 0}, {1, 0, 0}, {1, 0, 0}};
		printMatrix(matrix);
		
		System.out.println("");
		
		int[][] result = rotate(matrix);
		printMatrix(result);
	}	
	
}
