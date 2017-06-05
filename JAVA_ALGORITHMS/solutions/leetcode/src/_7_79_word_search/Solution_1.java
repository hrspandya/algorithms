package _7_79_word_search;

public class Solution_1 {
	
	public static void main(String[] args) {
		char[][] board = new char[3][4];
		board[0] = new char[]{'A', 'B', 'C', 'E'};
		board[1] = new char[]{'S', 'F', 'C', 'S'};
		board[2] = new char[]{'A', 'D', 'E', 'E'};
		
		System.out.println(exist(board, "ABCCED"));
		//System.out.println(exist(board, "SEE"));
	}
	
	static boolean[][] visited;
    public static boolean exist(char[][] board, String word) {
        
    	visited = new boolean[board.length][board[0].length];
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if((word.charAt(0) == board[i][j]) && search(board, word, i, j, 0)){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private static boolean search(char[][]board, String word, int i, int j, int index){
        if(index == word.length()){
            return true;
        }
        
        if(i >= board.length || i < 0 || j >= board[i].length || j < 0 || board[i][j] != word.charAt(index) || visited[i][j]){
            return false;
        }
        
        visited[i][j] = true;
        if(search(board, word, i-1, j, index+1) || 
           search(board, word, i+1, j, index+1) ||
           search(board, word, i, j-1, index+1) || 
           search(board, word, i, j+1, index+1)){
            return true;
        }
        
        visited[i][j] = false;
        return false;
    }
}
