package com.hp.graph.a_depth_first_search;

public class Graph {
	
	public int numberOfVertex;
	public Vertex[] vertexList;
	public int[][] matrix;
	
	
	//creating stack to store DFS values
	public Stack stack;
	
	
	public Graph(int maxsize){
		this.numberOfVertex = 0;
		this.vertexList = new Vertex[maxsize];
		this.matrix = new int[maxsize][maxsize];
		
		//initialize stack
		this.stack = new Stack(maxsize);
		
		//make the whole matrix values set to 0
		for(int i = 0; i < maxsize; i++){
			for(int j = 0; j < maxsize; j++){
				this.matrix[i][j] = 0;
			}
		}
	}
	
	
	public void addVetex(char label){
		Vertex vertex = new Vertex(label);
		this.vertexList[numberOfVertex++] = vertex;
	}
	
	
	public void addEdge(int from, int to){
		this.matrix[from][to] = 1;
	}
	
	
	public void displayVertex(int index){
		System.out.println(this.vertexList[index].label);
	}
	
	//depthFirstSearch
	public void dfs(){
		//peek first vertex and start
		
		this.vertexList[0].wasVisited = true;
		this.stack.push(0);
		this.displayVertex(0);
		
		
		while(!this.stack.isEmpty()){
			
			int v = getAdjUnvisitedVertex(this.stack.peek());
			
			if(v == -1){
			
				//if no vertex found then pop stack to see another vertex				
				this.stack.pop();
								
			}else{
				
				this.stack.push(v);
				this.displayVertex(v);
				this.vertexList[v].wasVisited = true;
				
			}

		}
		
		
		//Now that stack is empty we have visited all vertex
		//So make all wasVisited False again		
		for(int i = 0; i < numberOfVertex; i++){
			this.vertexList[i].wasVisited = false;
		}		
		
	}


	private int getAdjUnvisitedVertex(int index) {
		//consider index as row and loop through all columns to check if value is 1 and wasVisisted = false;
		// in this case vertex is connected but was not visisted, so we need to retun that vertex 
		//if not found than return -1
		
		for(int j = 0; j < this.numberOfVertex; j++){
			if(this.matrix[index][j] == 1 && this.vertexList[j].wasVisited == false){
				return j;	//vertex index
			}
		}
				
		return -1;
	}
	
}
