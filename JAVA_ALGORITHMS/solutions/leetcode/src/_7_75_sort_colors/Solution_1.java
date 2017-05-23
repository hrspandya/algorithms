package _7_75_sort_colors;

public class Solution_1 {
	
	public static void main(String[] args) {
		int[] array = new int[]{0, 2, 1, 0, 1, 2, 1};
		printArray(array);
		sortColors(array);
		printArray(array);
	}
	
	public static void sortColors(int A[]) {
	    int start = 0, end = A.length-1;
	    for (int i=0; i <= end; i++) {
    		int temp = 0;
	        if (A[i] == 0){
	            //swap(A[i], A[start]);
	        	temp = A[i];
	        	A[i] = A[start];
	        	A[start] = temp;
	        	start++;
	        }else if (A[i] == 2){
	            //swap(A[i], A[end]);
	        	temp = A[i];
	        	A[i] = A[end];
	        	A[end] = temp;
	        	i--;
	        	end--;
	        }
	    }
	}
	
	public static void printArray(int[] array){
		String s = "[";
		for(int i = 0; i < array.length; i++){
			s = s + array[i] + " ";
		}
		s = s + "]";
		System.out.println(s);
	}
	
}
