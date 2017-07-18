package _CH4.CH4_3;

import com.hp.a_binaryTree.Node;
import com.hp.a_binaryTree.Tree;

public class Solution {
	
	/*
	 * Given a sorted (increasing order) array with unique integer elements, 
	 * write an algo- rithm to create a binary search tree with minimal height.
	 */

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		Tree tree = new Tree();
		Node node = tree.createMinimalBST(array);
		
	}

}
