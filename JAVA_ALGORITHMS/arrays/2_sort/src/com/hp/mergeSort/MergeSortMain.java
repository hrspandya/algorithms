package com.hp.mergeSort;

public class MergeSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MergeSort array = new MergeSort(10);
		array.insert(10);
		array.insert(2);
		array.insert(1);
		array.insert(5);
		array.insert(3);
		array.insert(9);
		array.insert(7);
		array.insert(4);
		array.insert(8);
		array.insert(6);
		
		array.mergesort();
		
		array.display();
		
	}

}
