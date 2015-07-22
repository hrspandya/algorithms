package com.hp.linklist;

public class Link {
	
	public int index;
	public double data;
	public Link next;
	
	
	public Link(int index, double data){
		this.index = index;
		this.data = data;		
	}
	
	public void displayLink(){
		System.out.println(this.index + "   " + this.data);
	}
	
	
}
