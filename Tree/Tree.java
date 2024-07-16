package Tree;

public class Tree {
    //from parent node various child nodes comes out and there is no cyclic order.
    //height is measured form down to top and vicecersa for depth ,but for whole tree both is same.
    // representation/image of tree is state space of trees

    
    public static void main(String[] args) {
        //Node node1 = new Node(10);
        //Node node2 = new Node(20);
        //Node node3 = new Node(30);
        //Node root = node1;
        //root.left=node2;
        //root.right=node3;


        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6= new Node(6);
        Node node7 = new Node(7);
        Node root =node1;
        root.left=node2;
        root.right=node3;
        root.left.left=node4;
        root.left.right=node5;
        root.right.left=node6;
        root.right.right=node7; 
        
         
    }
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
        }
    }
}
