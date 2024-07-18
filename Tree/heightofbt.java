package Tree;
import java.util.*;
public class heightofbt {
    Scanner sc;
    
    public heightofbt()
    {
        this.sc= new Scanner(System.in); 
    }
    
    public static void main(String[] args) {
        heightofbt tb = new heightofbt();  
        System.out.println("Enter Node data");
        Node root = tb.createbinarytree();
        int height = tb.getheight(root);
        System.out.println("height of node is "+height);
    
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

    public int getheight(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int leftheight = getheight(root.left);
        int rightheight = getheight(root.right);

        return Math.max(leftheight, rightheight)+1;
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
