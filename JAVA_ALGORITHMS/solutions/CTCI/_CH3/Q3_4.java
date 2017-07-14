package _CH3;

import java.util.ArrayList;

import _CH3.StackUsingLinklist.Stack;

public class Q3_4 {
	
	/*
	 *Questions: In the classic problem of the Towers of Hanoi, you have 3 towers and N disks of different sizes which can slide onto any tower. 
	 *The puzzle starts with disks sorted in ascending order of size from top to bottom 
	 *(i.e., each disk sits on top of an even larger one). You have the following constraints:
	 *
	 *(T) Only one disk can be moved at a time.
	 *(2) A disk is slid off the top of one tower onto the next rod.
	 *(3) A disk can only be placed on top of a larger disk.
	 *Write a program to move the disks from the first tower to the last using Stacks 
	 */
	
	
	
	public static void main(String[] args) {
		Q3_4 mainClass = new Q3_4();
		
		
		Tower towerOfHanoi = mainClass.new Tower();		
		
		//init all 3 stacks first 
		towerOfHanoi.stacks.add(new Stack<Integer>());
		towerOfHanoi.stacks.add(new Stack<Integer>());
		towerOfHanoi.stacks.add(new Stack<Integer>());
		
		
		//init first stack with 3 disk
		towerOfHanoi.add(0, 10);
		towerOfHanoi.add(0, 20);
		towerOfHanoi.add(0, 30);
		
		Stack origin = towerOfHanoi.stacks.get(0);
		Stack buffer = towerOfHanoi.stacks.get(1);
		Stack destination = towerOfHanoi.stacks.get(2);
		
		
		towerOfHanoi.moveDisks(3, origin, destination, buffer);		
	}

	
	
	
	
	class Tower{
		ArrayList<Stack<Integer>> stacks = null;
		Integer noOfStacks = 3;
		
		public Tower(){			
			this.stacks = new ArrayList<>();
		}
		
		public void add(int i, int value){
			this.stacks.get(i).push(value);
		}
		
		public void moveDisks(int n, Stack origin, Stack destination, Stack buffer){
			//if n <= 0 return , we dont have disk left in the tower/stack
			if(n <= 0){
				return;
			}		
			
			//move disk from origin to buffer, use destination as buffer
			moveDisks(n - 1, origin, buffer, destination);
			
			//move disk from origin to destination
			moveTop(origin, destination);
			
			//move disk from buffer to destination, use origin as buffer
			moveDisks(n - 1, buffer, destination, origin);
		}
		
		public void moveTop(Stack origin, Stack destination){
			int originTop = (int) origin.pop().data;
			destination.push(originTop);	
			System.out.println("Move disk " + originTop + " tower from " + this.stacks.indexOf(origin) + " to tower " + this.stacks.indexOf(destination));
		}
		
	}
	
	

}
