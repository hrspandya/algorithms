package com.hp.graph.b_breath_first_search;

public class Graph {
	
	public int numberOfVertex;
	public Vertex[] vertexList;
	public int[][] matrix;
	
	//queue
	public Queue queue;
	
	public Graph(int maxsize){
		this.vertexList = new Vertex[maxsize];
		this.numberOfVertex = 0;
		this.matrix = new int[maxsize][maxsize];
		
		this.queue = new Queue(maxsize);
		
		//also initialize the matrix and set all values to 0
		for(int i = 0; i < maxsize; i++){
			for(int j = 0; j < maxsize; j++){
				this.matrix[i][j] = 0;				
			}
		}			
	}
		
	public void addVertex(char label){
		Vertex vertex = new Vertex(label);
		this.vertexList[numberOfVertex++] = vertex;
	}
	
	public void addEdge(int from, int to){
		this.matrix[from][to] = 1;
		this.matrix[to][from] = 1;
	}
	
	public void displayVertex(int index){
		System.out.println(this.vertexList[index].label);				
	}
	
	//Breath First Search
	//In Breath first search you try to stay find all connected vertices of one Vertex before going to another
	//for BFS we use queue, 
	public void bfs(){
		
		//start with first one 
		this.vertexList[0].wasVisited = true;
		this.queue.insert(0);
		this.displayVertex(0);
		int v2;
		
		while(!this.queue.isEmpty()){
			
			int v = this.queue.remove();			
			
			while((v2 = getAdjUnvisitedVertex(v)) != (-1)){
				this.queue.insert(v2);
				this.displayVertex(v2);
				this.vertexList[v2].wasVisited = true;
			}						
		}
		
		//after all the vertices has been visited , now we need to reset them for future use, 
		for(int i = 0; i < numberOfVertex; i++){
			this.vertexList[i].wasVisited = false;
		}
				
	}

	private int getAdjUnvisitedVertex(int index) {
		
		for(int j = 0; j < numberOfVertex; j++){
			if(this.matrix[index][j] == 1 && this.vertexList[j].wasVisited == false){
				return j;
			}			
		}
		
		return -1;
	}
		

}
