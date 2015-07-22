package com.hp.stack;

public class stackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack st1 = new Stack(10);
		
		st1.push(1);
		st1.push(2);
		
		System.out.println(st1.pop());
		System.out.println(st1.pop());
		System.out.println(st1.pop());
		System.out.println(st1.pop());
		
	}

}
