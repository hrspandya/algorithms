package _CH11.CH11_1;

public class Solution_1 {
	
	/*
	 * You are given two sorted arrays, A and B, where A has a large enough buffer at the
	 * end to hold B. Write a method to merge B into A in sorted order
	 */
	
	/* Solution: Take the last element of B and compare with Last element of A and place them in the last Index of Array A
	 * Keep doing it until you reach at the start of A 
	 * If B still has values then add them in A
	 */
	public static void main(String[] args) {
		int[] a = {1, 4, 6, 10, 0, 0, 0, 0, 0};
		int[] b = {0, 2, 5, 9, 11};
		
		merge(a, b, 4, 5);
		
		display(a);
	}
	
	public static void merge(int[] a, int[] b, int lastIndexA, int lastIndexB){
		int lastA = lastIndexA - 1;
		int lastB = lastIndexB - 1;
		int mergeIndex = a.length - 1; //we will start at the end of array a
		
		while(lastA >= 0 && lastB >= 0){
			if(a[lastA] > b[lastB]){				
				a[mergeIndex] = a[lastA];
				lastA--;
				mergeIndex--;
			}else{
				a[mergeIndex] = b[lastB];
				lastB--;
				mergeIndex--;
			}			
		}
		
		while(lastB >= 0){
			a[mergeIndex] = b[lastB];
			lastB--;
			mergeIndex--;
		}		
	}
	
	public static void display(int[] a){
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}

}
