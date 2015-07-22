package com.hp.array.unorderedArray;

public class UnorderedArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UnorderedArray array = new UnorderedArray(5);
		
		array.insert(0, 10);
		array.insert(1, 5);
		array.insert(2, 30);
		array.insert(3, 7);
		array.insert(4, 8);
		
		array.display();
		
		
		array.search(10);
		
		
		array.delete(5);
		
	}

}
