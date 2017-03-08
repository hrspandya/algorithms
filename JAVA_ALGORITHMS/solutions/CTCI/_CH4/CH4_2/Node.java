package _CH4.CH4_2;

import _CH4.CH4_2.Solution.State;

public class Node {
	
	public Node adjacentNodes [];
	
	public int adjacentCount;	
	
	public String vertex;
	
	public State state;
	
	
	public Node(String vertex, int adjacentLength){
		this.vertex = vertex;
		this.adjacentNodes = new Node[adjacentLength];
		this.adjacentCount = 0;
	}
	
	
	public void addAdjacent(Node x){
		this.adjacentNodes[this.adjacentCount] = x;
		this.adjacentCount++;
	}
	
	public Node[] getAdjacentNodes(){
		return this.adjacentNodes;
	}
	
	public String getVertex(){
		return this.vertex;		
	}
	
}
