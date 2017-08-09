package _CH5.CH5_6;

import CtCILibrary.AssortedMethods;

public class Solution_1 {
	
	/*
	 * Question : Write a program to swap odd and even bits in an integer with as few instructions as possible 
	 * (e.g., bit 0 and bit 1 are swapped, bit 2 and bit 3 are swapped, and so on).
	 */
	
	
	/*
	 * Solution 1: you can assume its 32 bit and for loop 32 times, and you can find odd and even by doing (i % 2),
	 * then you can get the value at position i and then swap first even with first odd and so on
	 * swap can be done by clearing and setting the bits , get can be used to check if we need to do clear or set 
	 */
	
	/*
	 * Better Solution:   First set odd numbers and clear all even numbers, then clear odd numbers and set even numbers.
	 * then move odd number right by 1 and even numbers left by 1 
	 * then or them and you are done.
	 */
	
	
	public static void main(String[] args) {
		System.out.println(AssortedMethods.toFullBinaryString(13));
		System.out.println(swapOddEven(13));
		System.out.println(AssortedMethods.toFullBinaryString(swapOddEven(13)));
		

	}

	private static int swapOddEven(int n) {
		int odd = n & 0xaaaaaaaa; //a = 10, which is 1010, odd numbers 
		int even = n & 0x55555555; //5 is 0101, even numbers
		return (odd >> 1) | (even << 1);
	}

}
