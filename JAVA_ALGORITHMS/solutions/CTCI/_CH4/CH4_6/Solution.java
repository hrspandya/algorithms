package _CH4.CH4_6;

import CtCILibrary.TreeNode;

public class Solution {
	
	/*
	 * Solution:  When we traverse the tree we go all the way to left then current and then right side
	 * If you draw the Tree, you will see that if node.right != null, next is going to be left most node of node.right
	 * so if node.right != null do that, 
	 * 
	 *  otherwise if node is left node of the parent then parent is the successor	 *  
	 *   
	 *  if node is right node of the parent then we are done with right side and current as well so keep going up until you see node 
	 *  which is left node of the parent.  
	 */
	
	
	
	public static TreeNode inorderSucc(TreeNode n) { 
		
		if(n == null){
			return null;
		}
				
		if(n.right != null){
			
			return leftMostChild(n.right);
			
		}else{
			
			TreeNode x = n;
			TreeNode p = n.parent;
			
			while(p != null && p.left != x){
				x = p;
				p = p.parent;
			}
			
			return p;
		}
			
	} 
		
	public static TreeNode leftMostChild(TreeNode n) {
		
		if(n == null){
			return null;
		}
		
		while(n.left != null){
			n = n.left;
		}
				
		return n; 
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		TreeNode root = TreeNode.createMinimalBST(array);
		for (int i = 0; i < array.length; i++) {
			TreeNode node = root.find(array[i]);
			TreeNode next = inorderSucc(node);
			if (next != null) {
				System.out.println(node.data + "->" + next.data);
			} else {
				System.out.println(node.data + "->" + null);
			}
		}
	}
}
