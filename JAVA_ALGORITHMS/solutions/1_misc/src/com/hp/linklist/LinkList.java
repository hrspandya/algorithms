package com.hp.linklist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LinkList {
	
	public Link first;
	public int length;
		
	public LinkList(){
		first = null;
		length = 0;
	}
	
	
	public void insert(int index, double data){
		
		Link current = first;
		Link previous = null;
		Link next = null;
		Link link = new Link(index, data);
				
		while(current != null){			
			if(current.data < data){
				previous = current;
				current = current.next;
			}else{
				break;
			}			
		}
		
		if(previous == null){
			first = link;
			link.next = current;
		}else{
			previous.next = link;
			link.next = current;
		}
		
		//increment the length
		this.length = this.length + 1;
			
	}  
	
	 
	public void insertFirst(int index, double data){
		Link current = new Link(index, data);
		current.next = this.first;
		first = current;
	}
	
	
	public Link deleteFirst(){
		Link temp = this.first;
		first = first.next;
		return temp;
	}
	
	
	public void displayList(){
		
		Link current = first;
		
		while(current != null){
			current.displayLink();
			current = current.next;
		}		
		
	}
	
	
		
}
