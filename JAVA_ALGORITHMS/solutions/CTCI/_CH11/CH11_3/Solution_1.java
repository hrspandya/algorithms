package _CH11.CH11_3;

public class Solution_1 {
	
	/*
	 * Given a sorted array of n integers that has been rotated an unknown number of times, 
	 * write code to find an element in the array. You may assume that the array was 
	 * originally sorted in increasing order.
	 */
	
	public static void main(String[] args) {
		int[] a = { 2, 3, 2, 2, 2, 2, 2, 2 , 2 , 2 };

		System.out.println(search(a, 0, a.length - 1, 2));
		System.out.println(search(a, 0, a.length - 1, 3));
		System.out.println(search(a, 0, a.length - 1, 4));
		System.out.println(search(a, 0, a.length - 1, 1));
		System.out.println(search(a, 0, a.length - 1, 8));
	}
	
	public static int search(int[] a, int start, int end, int find){
		
		int mid = (start + end) /2;
		
		if(end < start){
			return -1;
		}
		
		if(a[mid] == find){
			return mid;
		}
		
		if(a[start] < a[mid]){	//left side is in order
			if(find >= a[start] && find <= a[mid]){
				return search(a, start, mid - 1, find);
			}else{
				return search(a, mid + 1, end, find);				
			}
		}else if(a[start] > a[mid]){ //right side is in order
			if(find >= a[mid] && find <= a[end]){
				return search(a, mid + 1, end, find);
			}else{
				return search(a, start, mid - 1, find);
			}
		}else if(a[start] == a[mid]){	//there are duplicates
			//search both sides
			int sol = search(a, start, mid - 1, find);
			if(sol == -1){
				return search(a, mid + 1, end, find);
			}else{
				return sol;
			}
		}
				
		return -1;
	}
	
}












