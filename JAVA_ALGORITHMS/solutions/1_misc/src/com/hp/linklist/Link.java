package com.hp.linklist;

public class Link {
		
	public double data;
	public Link next;
	
	
	public Link(double data){		
		this.data = data;		
	}
	
	public void displayLink(){
		System.out.println(this.data);
	}
	
	
}
