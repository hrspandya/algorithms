package com.hp.stack.validateDelimiters;

public class Stack {
	
	char[] array;
	int nElement;
	
	public Stack(int maxSize){
		this.array = new char[maxSize];
		this.nElement = -1;		
	}
	
	
	public void push(char value){
		this.array[++nElement] = value;
	}
	
	
	public char pop(){
		if(nElement < 0){
			return ' ';
		}else{
			return this.array[nElement--];	
		}
	}
	
	
	public char peek(){
		return this.array[nElement];
	}
	
	
}
