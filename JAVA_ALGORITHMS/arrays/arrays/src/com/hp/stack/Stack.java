package com.hp.stack;

public class Stack {
	
	long[] array;
	int nElement;
	
	
	public Stack(int maxsize){
		this.array = new long[maxsize];
		this.nElement = -1; 
	}
	
	public void push(long value){		
		this.array[++nElement] = value;
	}
	
	public long pop(){
		if(nElement < 0){
			return -1;
		}
		return this.array[nElement--];
	}
	
	
}
