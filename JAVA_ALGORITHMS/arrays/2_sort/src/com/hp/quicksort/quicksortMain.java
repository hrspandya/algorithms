package com.hp.quicksort;

//For detail explanation watch this;
//https://www.youtube.com/watch?v=COk73cpQbFQ


public class quicksortMain {

	public static void main(String[] args) {
 		
		
		int[] array = {9, 5, 8, 2, 7, 1, 4};
		
		Quicksort qsort = new Quicksort(7);
		qsort.insert(0, 9);
		qsort.insert(1, 5);
		qsort.insert(2, 8);
		qsort.insert(3, 2);
		qsort.insert(4, 7);
		qsort.insert(5, 1);
		qsort.insert(6, 4);
		
		System.out.println("...Before..");
		qsort.display();
				
		qsort.sort();
		
		System.out.println("\n...After..");
		qsort.display();
		
		
	}

}
