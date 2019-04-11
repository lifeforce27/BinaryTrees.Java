package classWork2;

public class BinaryTree {
//Attribute
	public Node root;

	//Constructor
	public BinaryTree(Node root) {
		super();
		this.root = root;
	}
	
	//preorder traversal
	public void preOrder(Node root) {
		if(root == null)
			return;
		
		System.out.print(root);  //Root
		preOrder(root.left);    //process left
		preOrder(root.right);   //process right
		
	}
	
	public void inOrder(Node root) {
		if(root == null)
			return;
		
		inOrder(root.left);  //process left
		System.out.print(root);  //Root
		   
		inOrder(root.right);   //process right
		
	}
	
	public void postOrder(Node root) {
		if(root == null)
			return;
		
		postOrder(root.left);  //process left
		postOrder(root.right);   //process right
		System.out.print(root);  //Root
		   
		
		
	}
	
}
