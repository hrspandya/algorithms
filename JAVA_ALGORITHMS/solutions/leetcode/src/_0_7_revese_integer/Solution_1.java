package _0_7_revese_integer;

public class Solution_1 {
	/*
	 * Reverse digits of an integer.
	
	Example1: x = 123, return 321
	Example2: x = -123, return -321
	 */
	
	
	public static void main(String[] args) {
		System.out.println("Input : 123    Output: " + reverse(123));
		System.out.println("Input : -123    Output: " + reverse(-123));
		System.out.println("Input : 2,147,483,747    Output: " + reverse(2147483647));		
	}
	
	public static int reverse(int x){
		int result = 0;
		
		while(x != 0){
			
			int tail = x % 10;
			int newResult = result * 10 + tail;
			if(result != (newResult - tail)/10){				
				return 0;
			}			
			result = newResult;
			x = x / 10;			
		}
		
		
		return result;
	}
	
}
