package _CH4.CH4_7;

import CtCILibrary.TreeNode;

public class Solution_2 {
	
	//Check if p is on left side, Check if q is on left side 
	// if p and q both are on left side root is ancestor
	//else if p,q is on left then go to left and recurse 
	// else if p,q are on right side then go to right and recurse 
	private static TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null){
			return null;
		}
		
		if(root == p || root == q){			
			return root;
		}
		
		boolean p_on_left = covers(root.left, p);
		boolean q_on_left = covers(root.left, q);
		
		if(p_on_left != q_on_left){
			//then root has to be the ancestor
			return root;
		}
		
		if(p_on_left == true){
			return commonAncestor(root.left, p, q);
		}
		
		if(p_on_left == false){
			return commonAncestor(root.right, p, q);
		}
		
		return null;
			
	}
	
	
	private static boolean covers(TreeNode root, TreeNode p) {
		if(root == null){
			return false;
		}
		
		if(root == p){
			return true;
		}
		
		
		return covers(root.left, p) || covers(root.right, p);
	}


	public static void main(String[] args) {
		TreeNode myTree = new TreeNode(10);
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		TreeNode root = myTree.createMinimalBST(array);
		TreeNode p = root.find(6);
		TreeNode q = root.find(9);
		
		TreeNode ancestor = commonAncestor(root, p, q);
		System.out.println(ancestor.data);

	}	

}
