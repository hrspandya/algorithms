package _7_70_climbing_stairs;

public class Solution_1 {
	public static void main(String[] args) {
		System.out.println(climbStairs(3));
	}
	
	public static int climbStairs(int n) {
	    if(n == 0){
	    	return 0;
	    }
	    
	    if(n == 1){
	    	return 1;	    	
	    }
	    
	    if(n == 2){
	    	return 2;
	    }
	    
	    int n_1 = 2;
	    int n_2 = 1;
	    int result = 0;
	    for(int i = 3; i <= n; i++){
	    	result = n_1 + n_2;
	    	n_2 = n_1;
	    	n_1 = result;	    	
	    }
	    
	    return result;
	}
}
