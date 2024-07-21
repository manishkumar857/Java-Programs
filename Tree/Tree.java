package Tree;
//from parent node various child nodes comes out and there is no cyclic order.
//height is measured form down to top and vicecersa for depth ,but for whole tree both is same.
//representation/image of tree is state space of trees


import java.util.*;
public class Tree {
    Scanner sc;
    
    public Tree()
    {
        this.sc= new Scanner(System.in); 
    }
    
    public static void main(String[] args) {
        Tree tb = new Tree();  
        System.out.println("Enter Node data");
        Node root = tb.createbinarytree();
    
    }

    public Node createbinarytree()
    {
        System.out.println("Enter Node data");
        int data = sc.nextInt();
        if(data==-1)
        {
            return null;
        }
        Node node = new Node(data);
        System.out.println("enter data "+data+" left side");
        node.left=createbinarytree();

        System.out.println("enter data "+data+" right side");
        node.right=createbinarytree();

        return node;
       


    }
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
        }
        
    }
}
