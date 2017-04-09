package _CH5.CH5_1;

import CtCILibrary.AssortedMethods;

public class Solution_1 {
		
	/*
	 * You are given two 32-bit numbers,N andM, and two bit positions, i and j. 
	 * Write a method to insert M into N such that M starts at bit j and ends at bit i. 
	 * You can assume that the bits j through i have enough space to fit all of M. 
	 * That is,if M= 10011, you can assume that there are at least 5 bits between j and i. You would not, 
	 * for example,have j = 3 and i= 2,because M could not fully fit between bit 3 and bit 2.
	 * EXAMPLE:
	 * Input:N=10000000, M=10011, i =2, j =6 Output: N = 11001100 
	 */
	
	
	
	public static void main(String[] args) {
		int a = 103217;
		System.out.println(AssortedMethods.toFullBinaryString(a));
		int b = 13;
		System.out.println(AssortedMethods.toFullBinaryString(b));		
		int c = updateBits(a, b, 4, 12);
		System.out.println(AssortedMethods.toFullBinaryString(c));
			
	}

	private static int updateBits(int n, int m, int i, int j) {
		int clearValue = n;
		int shiftedValue = 0;
		
		//First clear bit for position between 2 and 6
		
		for(int k = i; k <= j; k++){			
			clearValue = clearBit(clearValue, k);
		}
		
		shiftedValue = (m << i);
		
		return clearValue | shiftedValue;				
	}
	
	public static int clearBit(int n, int i){		
		int val = ~(1 << i);
		return n & val;
	}	
	
}
