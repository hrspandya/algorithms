package _3_36_valid_sudoku;

import java.util.HashSet;

public class Solution_1 {
	
	public static void main(String[] args) {
		
		char[][] board = {
				{'5', '3', '.', '.', '7', '.', '.', '.', '.' }, 
				{'6', '.', '.', '1', '9', '5', '.', '.', '.' }, 
				{'.', '9', '8', '.', '.', '.', '.', '6', '.' },
				//----------------------------------------------
				{'8', '.', '.', '.', '6', '.', '.', '.', '3' },
				{'4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{'7', '.', '.', '.', '2', '.', '.', '.', '6' },
				//----------------------------------------------
				{'.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{'.', '.', '.', '4', '1', '9', '.', '.', '5' },
				{'.', '.', '.', '.', '8', '.', '.', '7', '9' },
		};
		
//		char[][] boxes = {
//				{'_', '_', '1', '.', '1', '1', '1', '.', '.' }, 
//				{'1', '.', '.', '.', '.', '.', '.', '.', '.' }, 
//				{'.', '.', '.', '.', '.', '.', '.', '.', '.' },
//				//----------------------------------------------
//				{'.', '.', '.', '.', '.', '.', '.', '.', '.' },
//				{'.', '.', '.', '.', '.', '.', '.', '.', '.' },
//				{'.', '.', '.', '.', '.', '.', '.', '.', '.' },
//				//----------------------------------------------
//				{'.', '.', '.', '.', '.', '.', '.', '.', '.' },
//				{'.', '.', '.', '.', '.', '.', '.', '.', '.' },
//				{'.', '.', '.', '.', '.', '.', '.', '.', '.' },
//		};
		
		
		System.out.println(isValidSudoku(board));
	}
	
	public static boolean isValidSudoku(char[][] board) {
		int[][] used1 = new int[9][9];	//row
		int[][] used2 = new int[9][9];	//column
		int[][] used3 = new int[9][9];	//9 boxes
				
        for(int i = 0; i < board.length; ++ i)
            for(int j = 0; j < board[i].length; ++ j)
                if(board[i][j] != '.')
                {
                    int num = board[i][j] - '0' - 1, k = (i / 3) * 3 + (j / 3);
                    if(used1[i][num] > 0 || used2[j][num] > 0 || used3[k][num] > 0)
                        return false;
                    used1[i][num] = used2[j][num] = used3[k][num] = 1;
                }
        
        return true;
	}
	
}
