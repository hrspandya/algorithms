package _CH4.CH4_2;

import java.util.LinkedList;

public class Solution {
	/*
	 * Given a directed graph, design an algorithm to find out whether there is a route between two nodes.
	 */
	 
	public enum State {
	    VISITING,
	    VISITED,	    
	    UNVISITED;
	}
	
	public static void main(String[] args) {
		Graph g = createNewGraph();
		Node[] nodes = g.getNodes();
		Node start = nodes[0];
		Node end = nodes[5];
		System.out.println("0 to 5 " + search(g, start, end));
		System.out.println("2 to 3 " + search(g, nodes[2], nodes[3]));
		System.out.println("3 to 5 " + search(g, nodes[3], nodes[5]));
		
		System.out.println("REMEMBER: This is Uni Directional Graph ");
	}

	private static Graph createNewGraph() {
		Graph g = new Graph(6);
		Node[] temp = new Node[6];
		
		temp[0] = new Node("a", 3);
		temp[1] = new Node("b", 0);
		temp[2] = new Node("c", 0);
		temp[3] = new Node("d", 1);
		temp[4] = new Node("e", 1);
		temp[5] = new Node("f", 0);
		
		temp[0].addAdjacent(temp[1]);
		temp[0].addAdjacent(temp[2]);
		temp[0].addAdjacent(temp[3]);
		temp[3].addAdjacent(temp[4]);
		temp[4].addAdjacent(temp[5]);
		
		for(int i = 0; i < 6; i++){
			g.addNode(temp[i]);
		}
			
		return g;
	}
	
	private static boolean search(Graph g, Node start, Node end) {
		LinkedList<Node> q = new LinkedList<>();
		
		//Reset state for all nodes
		for(Node n : g.getNodes()){
			n.state = State.UNVISITED;
		}
		
		
		q.add(start);
		
		while(!q.isEmpty()){
			Node n = q.removeFirst();
			n.state = State.VISITING;
			Node[] adjacentNodes = n.getAdjacentNodes();
			
			for(Node adjNode : adjacentNodes){
				if(adjNode.state == State.VISITED){
					
					//already visited do nothing
					
				}else{
					
					if(adjNode.vertex == end.vertex){
						return true; // Found it 
					}else{
						q.add(adjNode);
					}
					
				}
			}
			
			n.state = State.VISITED;
			
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
}
