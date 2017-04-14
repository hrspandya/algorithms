package _CH5.CH5_5;

import CtCILibrary.AssortedMethods;

public class Solution_1 {
	
	/*
	 * Question: Write a function to determine the number of bits required to convert integer A to integer B.
	 * 
	 * Solution: 
	 */
	
	
	public static int bitSwapRequired(int a, int b) {
		int count = 0;
		
		int c = a ^ b;
		
		while(c != 0){
			Integer lsb = new Integer(1 & c);
			if(lsb == 1){
				count++;
			}
			c = c >> 1;
		}
		
		return count;
	}
	
	
	public static int bitSwapRequired2(int a, int b) {
		int count = 0;
		
		int c = a ^ b;
		
		while(c != 0){
			count = count + (c & 1);
			c = c >> 1;
		}
		
		return count;
	}

	
	public static void main(String[] args) {
		int a = 23432;
		int b = 512132;
		System.out.println(a + ": " + AssortedMethods.toFullBinaryString(a));
		System.out.println(b + ": " + AssortedMethods.toFullBinaryString(b));
		int nbits = bitSwapRequired(a, b);		
		int nbits2 = bitSwapRequired2(a, b);		
		System.out.println("Required number of bits: " + nbits + " " + nbits2);
	}

}
