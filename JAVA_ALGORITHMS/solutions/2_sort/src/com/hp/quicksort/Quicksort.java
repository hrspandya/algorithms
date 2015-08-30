package com.hp.quicksort;

//For detail explanation watch this;
//https://www.youtube.com/watch?v=COk73cpQbFQ
	
public class Quicksort {
	
	
	public int[] array;
	public int nElements;
	
	public Quicksort(int maxsize){
		this.array = new int[maxsize];
		nElements = 0;
	}

	public void insert(int index, int value){
		this.array[index] = value;
		nElements++;
	}
	
	public void sort(){
		this.quicksort(this.array, 0, nElements - 1);
	}
	
	public void quicksort(int[] array, int start, int end){
		if(start < end){
			int pIndex = this.partition(this.array, start, end);
			
			quicksort(this.array, start, pIndex - 1);
			quicksort(this.array, pIndex + 1, end);
		}
	}
	
	public int partition(int[] array, int start, int end){
		
		int pivot = array[end];
		int pIndex = start;
		
		
		for(int i = start; i < end; i++){
			if(array[i] <= pivot){
				//swap array[pIndex] with array[i]
				int temp = array[i];
				array[i] = array[pIndex];
				array[pIndex] = temp;
				
				//increment pIndex after swap
				pIndex = pIndex + 1;
			}
		}
		
		//after for loop, move array[end] to pIndex 
		//so swap array[end] and array[pIndex]
		int temp = array[pIndex];
		array[pIndex] = array[end];
		array[end] = temp;
		
		return pIndex;
	}
	
	
	public void display(){
		for(int i =0; i < this.nElements; i++){
			System.out.println(this.array[i]);
		}
	}
	
}
