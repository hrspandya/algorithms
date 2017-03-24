package _CH4.CH4_8;

import CtCILibrary.AssortedMethods;
import CtCILibrary.TreeNode;

public class Solution_1 {
	
	/*
	 * Question : You have two very large binary trees: Tl, with millions of nodes, and T2, with
	 * hundreds of nodes. Create an algorithm to decide if T2 is a subtree of Tl.
	 * A tree T2 is a subtree of Tl if there exists a node n in Tl such that the subtree of n is identical to T2. 
	 * That is, if you cut off the tree at node n, the two trees would be identical.
	 */
	
	
	/*
	 * Answer : best solution is to think if the problm is much smaller with few nodes, 
	 * First we will traverse trough the Big Tree and whenever we find T1.data == T2.data, 
	 * then we will 
	 */
	
	
	public static void main(String[] args) {
		//t2 is subtree of t1
		int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		int[] array2 = {2, 4, 5, 8, 9, 10, 11};
		
		TreeNode t1 = AssortedMethods.createTreeFromArray(array1);
		TreeNode t2 = AssortedMethods.createTreeFromArray(array2);
		
		if(containsTree(t1, t2)){
			System.out.println("t2 is a substree of t1");
		}else{			
			System.out.println("t2 is not a subtree of t1");
		}
		
		// t4 is not a subtree of t3
		int[] array3 = {1, 2, 3};
		TreeNode t3 = AssortedMethods.createTreeFromArray(array1);
		TreeNode t4 = AssortedMethods.createTreeFromArray(array3);

		if (containsTree(t3, t4)){
			System.out.println("t4 is a subtree of t3");
		}else{
			System.out.println("t4 is not a subtree of t3");
		}

	}

	private static boolean containsTree(TreeNode t1, TreeNode t2) {
		if(t2 == null){
			return true;
		}
		
		return subTree(t1, t2);
	}

	private static boolean subTree(TreeNode t1, TreeNode t2) {
		
		if(t1 == null){
			return false;			
		}
		
		if(t1.data == t2.data){
			if(matchTree(t1, t2)){
				return true;
			}
		}
		
		return subTree(t1.left, t2) || subTree(t1.right, t2);
	}

	private static boolean matchTree(TreeNode t1, TreeNode t2) {
		if(t1 == null && t2 == null){
			return true;
		}
		
		if(t1 == null || t2 == null){
			return false;
		}
			
		if(t1.data != t2.data){
			return false;
		}
		
		return (matchTree(t1.left, t2.left) && matchTree(t1.right, t2.right));
	}
	

}
