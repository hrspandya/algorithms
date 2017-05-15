package _4_48_rotate_image;

public class Solution_1 {

	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		matrix[0] = new int[]{1,2,3};
		matrix[1] = new int[]{4,5,6};
		matrix[2] = new int[]{7,8,9};
		printMatrix(matrix);
		rotate(matrix);	//rotate with new matrix
		rotateInPlace(matrix);	//rotate in place without using additional matrix
	}
	
	public static void rotate(int[][] matrix) {
		int[][] result = new int[3][3];
		for(int r = 0; r < matrix.length; r++){
			for(int c = 0; c < matrix[0].length; c++){				
				result[c][matrix.length - 1 - r] = matrix[r][c]; 
			}
		}
		
		printMatrix(result);
	}
	
	public static void rotateInPlace(int[][] matrix) {
        for(int r = 0; r < matrix.length; r++){
        	for(int c = r; c < matrix[0].length; c++){
        		int temp = matrix[r][c];
        		matrix[r][c] = matrix[c][r];
        		matrix[c][r] = temp;
        	}
        }

        //first row to be first column, 
        //second row to be second column, 
        //third row to be third column
        printMatrix(matrix);
        
        //now you can swap first and third column and you rotated the image in place
        
        for(int r = 0; r < matrix.length; r++){
        	for(int c = 0; c < matrix.length/2; c++){
        		int temp = matrix[r][c];
        		matrix[r][c] = matrix[r][matrix.length - 1 - c];
        		matrix[r][matrix.length - 1 - c] = temp;
        	}
        }
        
        printMatrix(matrix);
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
