package com.hp.graph;

public class GraphMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph graph = new Graph(20);
		
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(3, 4);
		graph.addEdge(2, 5);
		
		
		graph.displayVertex(0);
		graph.displayVertex(1);
		graph.displayVertex(2);
		graph.displayVertex(3);		
		graph.displayVertex(4);
		
		
		
	}

}
