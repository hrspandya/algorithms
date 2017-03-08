package _CH4.CH4_4;

import com.hp.a_binaryTree.Tree;

public class Solution {

	
	public static void main(String[] args) {
		
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
					
		System.out.println( "is BST : " + mytree.isBST());
	}
	
	
}
