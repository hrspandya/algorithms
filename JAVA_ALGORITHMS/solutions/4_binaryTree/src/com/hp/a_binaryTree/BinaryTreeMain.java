package com.hp.a_binaryTree;

public class BinaryTreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Tree mytree = new Tree();
		
		mytree.insert(4, 4);
		mytree.insert(2, 2);
		mytree.insert(3, 3);
		mytree.insert(1, 1);
		mytree.insert(6, 6);
		mytree.insert(9, 9);
		mytree.insert(8, 8);
		mytree.insert(5, 5);
		mytree.insert(7, 7);
		
		System.out.println("Display Tree is Asc Order ---");
		mytree.traverseInAscOrder();
		System.out.println("----- end -----");
		
		System.out.println("Display Tree is Desc Order ---");
		mytree.traverseInDescOrder();
		System.out.println("----- end -----");
		
		System.out.println("Finding Minimum "+ mytree.findMinimum());
		System.out.println("Finding Maximum "+ mytree.findMaximum());
		
		System.out.println("Found 3 : " + mytree.search(3));
		System.out.println("Found 13 : " + mytree.search(13));
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Node t = mytree.createMinimalBST(array);
		
		
		System.out.println( "is BST : " + mytree.isBST());
		
		
		System.out.println( "get Height : " + mytree.getHeight());
		
		
		
	}

}
