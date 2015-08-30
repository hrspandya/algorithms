package com.hp.graph;

public class Graph {
	
	int numberOfVertices;
	int[][] adjancencyMatrix;
	Vertex[] vertexList;
	
	
	public Graph(int maxSize){
		
		this.vertexList = new Vertex[maxSize];
		this.numberOfVertices = 0;
		this.adjancencyMatrix = new int[maxSize][maxSize];		//adjacency matrix is the table matrix shown in book which shows 0 or 1 
		
		//Now set the adjancencyMatrix of all edges to 0
		
		for(int i = 0; i < maxSize; i++){
			for(int j = 0; j < maxSize; j++){
				this.adjancencyMatrix[i][j] = 0;
			}
		}
				
	}
	
	
	public void addVertex(char label){		
		Vertex vertex = new Vertex(label);	
		this.vertexList[numberOfVertices++] = vertex;	
		
	}
	
	public void addEdge(int from, int to){
		this.adjancencyMatrix[from][to] = 1;
		this.adjancencyMatrix[to][from] = 1;
	}
	
		
	public void displayVertex(int index){
		System.out.println(this.vertexList[index].label);
	}

}
