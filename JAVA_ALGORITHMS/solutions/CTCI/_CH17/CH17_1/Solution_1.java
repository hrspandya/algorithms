package _CH17.CH17_1;

public class Solution_1 {
	/*
	 * Write a function to swapa number in place (that is, without temporary variables).
	 * 
	 * */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 9;
		int b = 4;
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		
		a = a - b;
		b = a + b;
		a = b - a;
		
	}

}
