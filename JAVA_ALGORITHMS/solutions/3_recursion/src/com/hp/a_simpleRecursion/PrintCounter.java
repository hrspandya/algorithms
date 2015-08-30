package com.hp.a_simpleRecursion;

public class PrintCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		counter(10);
		
	}

	
	public static void counter(int n){
		if(n < 0){
			return; 
		}
		
		System.out.println(n);
		
		counter(n - 1);
		
	}
}
