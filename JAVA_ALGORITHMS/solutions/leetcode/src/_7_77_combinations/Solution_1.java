package _7_77_combinations;

import java.util.ArrayList;
import java.util.List;

public class Solution_1 {
	
	public static void main(String[] args) {
		System.out.println(combine(4, 2));
	}
	
	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> combs = new ArrayList<List<Integer>>();
		combine(combs, new ArrayList<Integer>(), 1, n, k);
		return combs;
	}
	public static void combine(List<List<Integer>> combs, List<Integer> tempList, int start, int n, int k) {
		if(k==0) {
			combs.add(new ArrayList<Integer>(tempList));
			return;
		}
		for(int i=start;i<=n;i++) {
			tempList.add(i);
			combine(combs, tempList, i+1, n, k-1);
			tempList.remove(tempList.size()-1);
		}
	}
	
}
