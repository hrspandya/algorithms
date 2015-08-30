package com.hp.graph.a_depth_first_search;

public class Stack {
	
	public int[] array;
	public int nElements;
	
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
		if(isEmpty()){
			return -1;
		}else{
			return this.array[nElements - 1];
		}		
	}
	
	public boolean isEmpty(){
		if(nElements == 0){
			return true;
		}else{
			return false;
		}
	}
	
	
	
}
