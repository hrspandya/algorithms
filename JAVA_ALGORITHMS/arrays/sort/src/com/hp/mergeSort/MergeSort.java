package com.hp.mergeSort;

// EXPLANATION of MergeSort
//https://www.youtube.com/watch?v=TzeBrDU-JaY

public class MergeSort {
	
	private long[] mainArray;
	private int nElements;	
	
	public MergeSort(int maxsize){
		mainArray = new long[maxsize];
		nElements = 0;
	}
	
	public void insert(long val){
		mainArray[nElements] = val;
		nElements++;
	}
	
	public void display(){
		for(int i = 0; i < nElements; i++){
			System.out.println(mainArray[i]);
		}
	}

	public void mergesort(){			
		this.mainArray = recMergeSort(this.mainArray);
	}

	private long[] recMergeSort(long[] array) {
		int n = array.length;
		if(n <= 1){
			return array;
		}else{
			int mid = n/2;
			long[] leftArray = new long[mid];
			long[] rightArray = new long[n - mid];
			long[] resultArray = new long[n];
			
			
			for(int i = 0; i < mid; i++){
				leftArray[i] = array[i];
			}
			
			for(int j = mid, i = 0; j < n; j++){				
				rightArray[i] = array[j];
				i++;
			}
			
			leftArray = recMergeSort(leftArray);
			rightArray = recMergeSort(rightArray);
			
			resultArray = merge(leftArray, rightArray);
			return resultArray;
		}
	}


	private long[] merge(long[] leftArray, long[] rightArray) {
		int nL = leftArray.length;
		int rL = rightArray.length;
		int leftIndex = 0;
		int rightIndex = 0;
		int resultIndex = 0;
		long[] mergedArray = new long[leftArray.length + rightArray.length];
		
		while(leftIndex < leftArray.length && rightIndex < rightArray.length){
			if(leftArray[leftIndex] < rightArray[rightIndex]){
				mergedArray[resultIndex] = leftArray[leftIndex];
				resultIndex++;
				leftIndex++;
			}else{
				mergedArray[resultIndex] = rightArray[rightIndex];
				resultIndex++;
				rightIndex++;
			}
		}
		
		while(leftIndex < leftArray.length){
			mergedArray[resultIndex] = leftArray[leftIndex];
			resultIndex++;
			leftIndex++;
		}
		
		while(rightIndex < rightArray.length){
			mergedArray[resultIndex] = rightArray[rightIndex];
			resultIndex++;
			rightIndex++;
		}
		
		return mergedArray;
		
	} 
	
}


