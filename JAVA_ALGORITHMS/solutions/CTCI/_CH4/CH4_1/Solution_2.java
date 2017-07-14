package _CH4.CH4_1;

import com.hp.a_binaryTree.Node;
import com.hp.a_binaryTree.Tree;

public class Solution_2 {
	
	/*
	 * Question:  Implement a function to check if a binary tree is balanced. 
	 * For the purposes of this question, a balanced tree is defined to be a tree such 
	 * that the heights of the two subtrees of any node never differ by more than one.
	 */
		
	
	//Answer: Previous version was better and easier,  
	
	public static void main(String[] args) {
		
		int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//NOTE:  Minimal BST is always Balanced		
		Tree myTree = new Tree();
		Node node = myTree.createMinimalBST(array1);
		int height1 = getHeight(node);
		//System.out.println(height1);
		System.out.println((height1 != -1) ? true : false);
		
		
		int[] array2 = {11, 2, 13, 24, 15, 36, 17, 28, 9, 10};
		Tree myTree2 = new Tree();
		for(int i = 0; i < array2.length; i++){
			myTree2.insert(array2[i], array2[i]);
		}		
		int height2 = getHeight(myTree2.root);
		//System.out.println(height2);		
		System.out.println((height2 != -1) ? true : false);
	}
	
	
	public static int getHeight(Node node){
		if(node == null){
			return 0;
		}
		
		//get Height
		int leftHeight = getHeight(node.leftNode);
		if(leftHeight == -1){
			return -1;
		}
		
		int rightHeight = getHeight(node.rightNode);
		if(rightHeight == -1){
			return -1;
		}
		
		
		int heightDiff = Math.abs(getHeight(node.leftNode) - getHeight(node.rightNode));
		if(heightDiff > 1){
			return -1;
		}else{
			return Math.max(leftHeight, rightHeight) + 1;
		}
		
	}

}
