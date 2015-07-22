package com.hp.array.binarySearchWithOrderedArray;

public class binarySearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BINARY SEARCH WITH ORDERED ARRAY
		
		OrderedArray array1 = new OrderedArray(10);
		
		array1.insert(1);
		array1.insert(20);
		array1.insert(2);
		array1.insert(3);		
		array1.insert(33);
		array1.insert(10); 
		array1.insert(5);
		array1.insert(7);
		array1.insert(9);
		array1.insert(100);
		
		array1.display();
		
		
		boolean isFound = array1.binarySearch(33);

        System.out.println(isFound);
		

	}

}
