package classWork2;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //we will create some nodes and connect them to a tree
		
		Node A = new Node(25);
		Node B = new Node(20);
	    Node C = new Node(32);
	   Node D = new Node(12);
       Node E = new Node(22);
       Node F = new Node(27);
       Node G = new Node(45);
       Node H = new Node(21); 
       Node I = new Node(65);

	
       A.left = B;
       A.right = C;
       B.left = D;
       B.right = E;
       C.left = F;
       C.right = G;
       E.left = H;
       G.right = I;
       
   BinaryTree bt = new BinaryTree(A);
   System.out.print("PreOrder: ");
   bt.preOrder(A);
   System.out.print("\nInOrder: ");
   bt.inOrder(A);
   System.out.print("\npostOrder: ");
   bt.postOrder(A);
       
       
       
       
       
       
       
	
	}
}