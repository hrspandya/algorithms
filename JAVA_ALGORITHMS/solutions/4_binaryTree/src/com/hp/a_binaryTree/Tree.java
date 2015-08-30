package com.hp.a_binaryTree;

public class Tree {
	
	public Node root;
		
	
	public Tree(){
		root = null;
	}
	
	
	public void insert(int iData, double value){
		//Create new node first before inserting in Tree
		Node newNode = new Node();
		newNode.iData = iData;
		newNode.value = value;
		
		
		if(this.root == null){	//First Element to insert
			root = newNode;
			return;
			
		}else{
			
			//We need Parent's reference since we may need to add new node into parent
			//We need Current's reference since we need to check if current node is null or not
			//Initially both parent and current point to root 
			Node parent = root;
			Node current = root;
			
			//Now start infinite while loop
			while(true){
				
				//Check if newNode index is less than parent index, if so we need to go to left
				if(newNode.iData < parent.iData){
					//Then go to left
					current = parent.leftNode;
					
					if(current == null){
						parent.leftNode = newNode;
						return;
					}else{
						parent = parent.leftNode;
					}
					
				}else{
					//Go to Right
					current = parent.rightNode;
					
					if(current == null){
						parent.rightNode = newNode;
						return;
					}else{
						parent = parent.rightNode;
					}					
					
				}
				
			} //end while
			
		}//end if		
		
	}//end method
	
	
	
	
	public void traverseInAscOrder(){
		this.inAscOrder(this.root);
	}
	
	public void inAscOrder(Node node){
		if(node != null){
			//Go to Left
			//Keep Traversing Left nodes first,
			//using recursion
			inAscOrder(node.leftNode);
			
			
			//Once you reach all the way to Left Node, then Print 
			System.out.println(node.value);
			
			
			//Go to Right			
			//Now check on right side			
			inAscOrder(node.rightNode);						
		}
	}
	
	
	public void traverseInDescOrder(){
		inDescOrder(this.root);
	}
	
	public void inDescOrder(Node node){
		//check node is not null
		if(node != null){
			
			//Go to right
			//Keep Traversing right nodes first
			//using recursion
			inDescOrder(node.rightNode);
			
			//Once you reach all the way to Right Node then Print
			System.out.println(node.value);
			
			//Go to Left
			//Now Check on Left Side
			inDescOrder(node.leftNode);
		}
	}
	
	
	public double findMinimum(){
		
		//To find minimum go all the way to Left and then print
		
		if(this.root == null){
			return -1;
		}else{
			
			Node parent = root;
			Node current = root;
			
			while(true){
				
				current = parent.leftNode;
				
				if(current == null){
					return parent.value;
				}else{
					parent = parent.leftNode;
				}
							
			}
			
		}		
	}
	
	
	public double findMaximum(){
		
		if(this.root == null){
			return -1;
		}else{
			
			Node parent = this.root;
			Node current = this.root;
			
			while(true){
								
				//Keep going to Right
				current = parent.rightNode;
				
				if(current == null){
					return parent.value;
				}else{
					parent = parent.rightNode;
				}			
				
			}
			
		}		
	}
	
	
	//Same code as Traversing..  All we need to do is add key check
	public boolean search(int key){
		
		Node parent = this.root;
		Node current = this.root;
		
		if(this.root == null){
			return false;
		}else{
			
			while(true){
				
				//Just adding Key check..  everything else is same as Traversing
				if(key == parent.iData){
					return true;
				}				
				
				if(key < parent.iData){
					//Go to Left
					current = parent.leftNode;
					
					if(current == null){
						return false;
					}else{
						parent = parent.leftNode;
					}
				}else{
					
					current = parent.rightNode;
					
					if(current == null){
						return false;
					}else{
						parent = parent.rightNode;
					}
					
				}
			}
			
		}
				
				
	}
	
	
	
}
