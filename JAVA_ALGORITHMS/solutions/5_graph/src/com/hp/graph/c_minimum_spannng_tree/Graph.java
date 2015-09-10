package com.hp.graph.c_minimum_spannng_tree;

public class Graph {
	
	public Vertex[] vertexList;
	public int numberOfVertices;
	public int[][] matrix;
	
	public Stack stack;
	
	public Graph(int maxsize){
		this.numberOfVertices = 0;
		this.vertexList = new Vertex[maxsize];
		this.matrix = new int[maxsize][maxsize];
		
		this.stack = new Stack(maxsize);
		
		//now initialize whole matrix with values set to 0
		for(int i = 0; i < maxsize; i++){
			for(int j = 0; j < maxsize; j++){
				this.matrix[i][j] = 0;
			}
		}
	}
	
	
	public void addVertex(char label){
		Vertex vertex = new Vertex(label);
		
		this.vertexList[numberOfVertices++] = vertex;		
	}
		
	public void addEdge(int from, int to){
		this.matrix[from][to] = 1;
		this.matrix[to][from] = 1;
	}
	
	public void displayVertex(int index){
		System.out.println(this.vertexList[index].label);
	}
	
	
	//Minimum spanning tree
	public void mst(){
		//start from first vertex
		this.vertexList[0].wasVisited = true;
		this.stack.push(0);
		//this.displayVertex(0);
		
		while(!this.stack.isEmpty()){
			int v = getAdjUnvisistedVertex(this.stack.peek());
			
			if(v == -1){
				// no unvisisted adjacent vertex found
				this.stack.pop();
			}else{
				
				//Print result before pushing into stack, otherwise stack.peek() and vertexList[v], both are same.. will result BB, CC, DD, EE, 
				//Here we took previous value and new value and display,   then update stack and mark the vertex;
				System.out.println(this.vertexList[this.stack.peek()].label + "" + this.vertexList[v].label);
				
				this.stack.push(v);
				this.vertexList[v].wasVisited = true;
			}			
		}
		
		
		//Once we go through all vertex, reset wasVisited for all vertices for future use		
		for(int i = 0; i < this.numberOfVertices; i++){
			this.vertexList[i].wasVisited = false;
		}
			
	}


	private int getAdjUnvisistedVertex(int index) {
		//check if matrix value is 1 and vertex was no visisteds
		
		for(int j = 0; j < this.numberOfVertices; j++){
			if(this.matrix[index][j] == 1 && this.vertexList[j].wasVisited == false){
				return j;
			}
		}
		
		return -1;
	}
	
		
}
