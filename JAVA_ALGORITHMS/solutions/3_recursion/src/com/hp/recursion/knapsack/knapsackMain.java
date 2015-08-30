package com.hp.recursion.knapsack;

public class knapsackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Knapsack problem, 
		
		//Given the weights find a total of weights to be equal to given number
		
		int findWeight = 20;
		
		int[] givenWeights = {5, 2, 6, 10, 8};
		
		//For example:  2 + 10 + 8 = 20
		
		
		KnapSack sack = new KnapSack();
		
		// This function takes an array of items and a knapsack size. It attempts to
		// fill the knapsack exactly with the given items. It only considers items
		// in the array that are in slots first, first+1,... So when the function
		// is initially called it should be called with first equal to 0.
		// In addition the function also takes as input the size of the current
		// (partial) solution. This is initially 0.
		
		int[] result = sack.knapSack(givenWeights, findWeight, 0, 0);
		
		for(int i = 0; i < result.length; i++){
			System.out.println(result[i]);
		}
		
	}	

}
