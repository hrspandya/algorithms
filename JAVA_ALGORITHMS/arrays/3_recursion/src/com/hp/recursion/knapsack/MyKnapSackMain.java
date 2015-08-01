package com.hp.recursion.knapsack;

public class MyKnapSackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Find a total from an array values
		
		int[] array = {5, 6, 10, 9};
		int target = 20;
		
		knapsack(array, 0, target);

	}
	
	
	public static boolean knapsack(int[] array, int index, int target) {
		
		if (index <= array.length) {

			// First loop through the array since we need to check if each
			// element is already target
			// or if each value addition is more than target

			for (int i = index; i < array.length; i++) {

				if (array[i] == target) {
					System.out.println(target);
					return true;

				} else if (target - array[i] < 0) { 

					// Check if target -
					// array[i] < 0 , if so
					// total has gone above
					// target

					// If current total has gone above target then do nothing
					// and go to next element

				} else if(target - array[i] == 0){
					
					return true;
					
				} else {
					
					knapsack(array, index + 1, target - array[i]);
					
				}

			}

		}

		return false;
	}

}
