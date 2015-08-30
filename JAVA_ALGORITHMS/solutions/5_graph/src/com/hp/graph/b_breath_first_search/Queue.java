package com.hp.graph.b_breath_first_search;

public class Queue {
	
	public int nElements;
	public int[] array;
	
	public int currentIndex;
	
	public Queue(int maxsize){
		
		this.array = new int[maxsize];
		this.nElements = 0;
		this.currentIndex = 0;
	}
	
	
	public void insert(int value){
		this.array[nElements++] = value;
	}
	
	
	public int remove(){
		return this.array[currentIndex++];
	}
	
	public boolean isEmpty(){
		if(currentIndex >= nElements){
			return true;
		}else{
			return false;
		}
	}
	
	
}
