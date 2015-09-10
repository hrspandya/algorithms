package com.hp.graph.c_minimum_spannng_tree;

public class Stack {
	
	public int nElements;
	public int[] array;
	
	
	public Stack(int maxsize){
		this.array = new int[maxsize];
		this.nElements = 0;
	}
	
	
	public void push(int val){
		this.array[nElements++] = val;
	}
	
	
	public int pop(){
		return this.array[--nElements];
	}
	
	
	public int peek(){
		return this.array[nElements - 1];
	}
	
	
	public boolean isEmpty(){
		if(nElements <= 0){
			return true;
		}else{
			return false;
		}
	}
	
	
}
