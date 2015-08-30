package com.hp.graph.b_breath_first_search;


public class GraphMain_BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph(20);
		
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		
		graph.addEdge(0, 1);	//A connected to B
		graph.addEdge(1, 2);	//B connected to C
		graph.addEdge(0, 3);	//A connected to D
		graph.addEdge(3, 4);	//D connected to E		
				
		
		//DFS, Depth First Search, basically used to determine how many vertices are connected 
		graph.bfs();	
		
		//Output:  ABDCE
		
	}

}
