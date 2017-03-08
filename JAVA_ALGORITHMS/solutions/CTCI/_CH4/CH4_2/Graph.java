package _CH4.CH4_2;

public class Graph {
	
	public Node vertices[];
	public int verticesCount;
	public int count;
	public int graphCount;
	
	
	public Graph(int graphCount){
		this.vertices = new Node[graphCount];
		this.graphCount = graphCount;
		this.count = 0;
	}
	
	public void addNode(Node x){
		if(this.count > this.graphCount){
			System.out.println("Graph is full");
		}else{
			this.vertices[count] = x;
			count++;
		}
	}
		
	public Node[] getNodes(){
		return this.vertices;
	}
	
	
}
