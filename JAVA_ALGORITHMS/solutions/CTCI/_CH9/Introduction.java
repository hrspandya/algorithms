package _CH9;

import java.util.ArrayList;

public class Introduction {

	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		ArrayList<Integer> list0 = new ArrayList<>();		
		
		ArrayList<Integer> list1 = list0;
		list1.add(1);
		
		
		list.add(list0);
		list.add(list1);
		
		System.out.println(list.toString());
	}
	
}
