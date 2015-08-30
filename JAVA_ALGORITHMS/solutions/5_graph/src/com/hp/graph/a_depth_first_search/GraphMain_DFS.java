package com.hp.graph.a_depth_first_search;

public class GraphMain_DFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph graph = new Graph(20);
		
		graph.addVetex('A');
		graph.addVetex('B');
		graph.addVetex('C');
		graph.addVetex('D');
		graph.addVetex('E');
		
		graph.addEdge(0, 1);	//A connected to B
		graph.addEdge(1, 2);	//B connected to C
		graph.addEdge(0, 3);	//A connected to D
		graph.addEdge(3, 4);	//D connected to E
				
		
		//DFS, Depth First Search, basically used to determine how many vertices are connected 
		graph.dfs();
		
		//OUTPUT: ABCDE
	}

}
