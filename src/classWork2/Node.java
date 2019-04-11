package classWork2;
//Represents each of the nodes in a binary tree

public class Node {
	public int data;
	public Node left;
	public Node right;
	
	
	
	//Construtor to create Node
	
	public Node(int data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
		
	}

	
	public String toString() {
		
		return"[" + this.data + "]";
	}
	
	
	
}
