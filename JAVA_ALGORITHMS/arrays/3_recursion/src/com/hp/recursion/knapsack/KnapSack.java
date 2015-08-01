package com.hp.recursion.knapsack;

public class KnapSack {

	private int[] givenArray;
	private int findTotal;
	
	//{5, 2, 6, 10, 8};
	
	public KnapSack(){
		
	}
	
	
	public static int[] knapSack(int[] items, int realtarget, int first, int solutionSize){

		if(realtarget > 0)
		{
			// For each i, try placing the ith item in the knapsack
			for(int i= first; i < items.length; i++)
			{
				// Fit the smaller knapsack with items chosen from i+1, i+2,...
				int [] answer = knapSack(items, realtarget-items[i], i+1, solutionSize+1);

				if (answer != null)
				{
					answer[solutionSize] = items[i];
					return answer;
				}
			}

			return null;
		}
		// We have found a solution. So we create an array of the right size
		// and send it back for filling
		else if(realtarget==0)
		{
			int[] temp = new int[solutionSize];
			return temp;
		}
		
		else // realtarget is negative, so no solution is possible
			return null;

	}
	
}
