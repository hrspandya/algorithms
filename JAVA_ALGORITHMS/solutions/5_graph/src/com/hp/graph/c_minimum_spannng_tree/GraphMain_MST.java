package com.hp.graph.c_minimum_spannng_tree;

public class GraphMain_MST {
	
	public static void main(String[] args) {
		
		
		Graph graph = new Graph(20);
		
		graph.addVertex('A');
		graph.addVertex('B');		
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		
		
		graph.addEdge(0, 1);	//AB
		graph.addEdge(0, 2);	//AC
		graph.addEdge(0, 3);	//AD
		graph.addEdge(0, 4);	//AE
		graph.addEdge(1, 2);	//BC
		graph.addEdge(1, 3);	//BD
		graph.addEdge(1, 4);	//BE
		graph.addEdge(2, 3);	//CD
		graph.addEdge(2, 4);	//CE
		graph.addEdge(3, 4);	//DE
		
		
		for(int i = 0; i < graph.numberOfVertices; i++){
			System.out.println(graph.vertexList[i].label);
		}
		
		
		graph.mst();
		
		
		
	}
	
}
