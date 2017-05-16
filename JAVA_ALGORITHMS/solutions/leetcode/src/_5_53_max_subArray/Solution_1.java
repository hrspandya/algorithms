package _5_53_max_subArray;

import java.util.ArrayList;

public class Solution_1 {
	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[]{ -2, 1, -3, 4, -1, 2, 1, -5, 4}));
	}
	
	public static int maxSubArray(int[] A) {
	    int result = A[0];
	    int maxSofar = A[0];
	    ArrayList<Integer> list = new ArrayList<>();
	    
	    for(int i = 1; i < A.length; i++){
	    	maxSofar = Math.max(maxSofar + A[i], A[i]);	    	    	
	    	if(maxSofar + A[i] > A[i]){
	    		list.add(A[i]);
	    	}
	    	result = Math.max(result, maxSofar);
	    }
	    
	    return result;
	}
}
