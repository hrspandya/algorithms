package com.hp.array.unorderedArray;

public class UnorderedArray {
	
	long[] array;
	int nElement = 0;
	
	public UnorderedArray(int maxSize){		
		this.array = new long[maxSize];		
	}
	
	public void insert(int index, long value){
		this.array[index] = value;
		nElement++;
	}
	
	public boolean search(long value){
		for(int i=0; i < this.array.length; i++){
			if(this.array[i] == value){
				System.out.println("Found the value: " + value);
				return true;
			}
		}
		
		System.out.println("Could Not Find the value: " + value);
		return false;
	}
	
	public void delete(long value){
		
		for(int i=0; i < this.array.length; i++){
			if(this.array[i] == value){
				System.out.println("Found the value: " + value);
				nElement--;
				for(int j=i; j < nElement; j++ ){
					this.array[j] = this.array[j + 1];					
				}
				
				this.display();
				break;
			}
		}
					
	}
	
	public void display(){
		for(int i = 0; i < nElement; i++){
			System.out.println(this.array[i]);
		}
	}
	
}
