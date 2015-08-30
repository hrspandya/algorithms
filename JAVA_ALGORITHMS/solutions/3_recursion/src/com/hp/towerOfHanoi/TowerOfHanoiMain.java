package com.hp.towerOfHanoi;

//Understand this Problem at in detail at
//https://www.youtube.com/watch?v=bIgjzlumfsQ


public class TowerOfHanoiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Lets say we have A B and C towers 
		// Tower A has n number of the plates and we need to move all plates to the C towers
		
		doTowers(4, "A", "B", "C");
	}
	
	
	public static void doTowers( int totalDisk, String from, String intermediate, String to ){
		
		if(totalDisk == 1){
			//Then move disk 1 from A to C, You are done
			System.out.println("Move Disk " + totalDisk + " From " + from + " to " + to);
		}else if(totalDisk == 2){
			//move disk totalDisk - 1 (from --> intermediate)
			System.out.println("Move Disk " + (totalDisk - 1) + " From " + from + " to " + intermediate);
			//move disk totalDisk (from --> to)
			System.out.println("Move Disk " + (totalDisk) + " From " + from + " to " + to);
			//move disk totalDisk - 1 (intermediate --> to)
			System.out.println("Move Disk " + (totalDisk - 1) + " From " + intermediate + " to " + to);
		}else{

			//Move first 2 disks from A to B
			doTowers(totalDisk - 1, from, to, intermediate);
			
			//Move 3rd Disk from A to C
			System.out.println("Move Disk " + (totalDisk) + " From " + from + " to " + to);
			
			//Move first 2 disks from B to C
			doTowers(totalDisk - 1, intermediate, from, to);
		}
		
	}

}
