package _CH4.CH4_7;

import CtCILibrary.TreeNode;

public class Solution_1 {
	
	/*
	 * Question: Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree. 
	 * Avoid storing additional nodes in a data structure. 
	 * NOTE: This is not necessarily a binary search tree.
	 */
	
	/*
	 * Best solution is to update the find method and keep adding isVisited = true , when you are finding other node, 
	 * see the last isVisited = true before you find your node and that will be your ancestor.
	 */
	
	/*
	 * Other Best Solution will be is to keep going to parent until you reach root for one node and for 
	 * every node set isVisited = true; Now from another Node keep going to parent until you see 
	 * node which has isVisited = true and you have find an ancestor. 
	 */
	
	private static TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		int count = 0;
		if(root == null){
			return root;
		}
		
		if(root == p || root == q){
			return root;
		}
		
		TreeNode pT = p;
		TreeNode qT = q;
		
		while(pT != null){			
			if(pT == root){				
				//break the loop				
				break;
			}
			
			pT.isVisited = true; 
			pT = pT.parent;
			count = count + 1;
		}
		
		if(qT.isVisited == true){			
			return qT;
		}
		
		while(qT != root && qT.isVisited == false){		
			qT = qT.parent;
			count = count + 1;
		}
		
		System.out.println("Big o cycles count:  " + count);
		return qT;
	}

		
	public static void main(String[] args) {
		TreeNode myTree = new TreeNode(10);
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		TreeNode root = myTree.createMinimalBST(array);
		TreeNode p = root.find(7);
		TreeNode q = root.find(1);
		
		TreeNode ancestor = commonAncestor(root, p, q);
		System.out.println(ancestor.data);

	}
	

}
