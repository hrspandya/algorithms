package _CH4.CH4_1;

import com.hp.a_binaryTree.Node;
import com.hp.a_binaryTree.Tree;

public class Solution_1 {
	
	/*
	 * Question:  Implement a function to check if a binary tree is balanced. 
	 * For the purposes of this question, a balanced tree is defined to be a tree such 
	 * that the heights of the two subtrees of any node never differ by more than one.
	 */
		
	
	//Answer: Brute force
	
	
	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		Tree myTree = new Tree();
		Node node = myTree.createMinimalBST(array);
		Node root = node;
		
		boolean isBalanced = false;
		if(node != null){
			isBalanced = isBalanced(node);			
		}				
		
		System.out.println(isBalanced);
		//Creating MInimal BST always becomes Balanced
		
		
		
		
		
		int[] array2 = {1, 20, 13, 24, 35, 26, 17, 8, 19, 10};
		
		Tree myTree1 = new Tree();
		for(int i = 0; i < array2.length; i++){
			myTree1.insert(array2[i], array2[i]);
		}
		
		Node root2 = myTree.root;
		
		isBalanced = false;
		if(root2 != null){
			isBalanced = isBalanced(root2);			
		}				
		
		System.out.println(isBalanced);		
		
	}
		
	public static boolean isBalanced(Node node){
		if(node == null){
			return true;
		}
		
		int heightDiff = Math.abs(getHeight(node.leftNode) - getHeight(node.rightNode));
		if(heightDiff > 1){			
			return false;
		}else{
			return isBalanced(node.leftNode) && isBalanced(node.rightNode);
		}
	}
	
	public static int getHeight(Node node){
		if(node != null){
			int leftHeight = getHeight(node.leftNode);
			int rightHeight = getHeight(node.rightNode);
			
			return Math.max(leftHeight, rightHeight) + 1;
		}else{
			return 0;
		}
	}	

}
