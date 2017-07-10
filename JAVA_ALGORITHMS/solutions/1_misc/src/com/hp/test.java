package com.hp;

public class test {
	public static void main(String[] args) {
		int[] a = {2, 3, 4, 3, 2, 1, 4};
		System.out.println(singleNumber(a, 7));
	}
	
	public static int singleNumber(int A[], int n) {
	    int result = 0;
	    for (int i = 0; i<n; i++)
	    {
			result = result ^ A[i];
	    }
		return result;
	}
}
