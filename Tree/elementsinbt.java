package Tree;
import java.util.*;

public class elementsinbt {
    Scanner sc;
    
    public elementsinbt() {
        this.sc = new Scanner(System.in); 
    }
    
    public static void main(String[] args) {
        elementsinbt tb = new elementsinbt();  
        System.out.println("Enter Node data");
        Node root = tb.createbinarytree();
        
        // Call method to get the number of elements in the tree
        int count = tb.noofelement(root);
        System.out.println("Number of elements in the binary tree: " + count);
    }

    public Node createbinarytree() {
        System.out.println("Enter Node data");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        Node node = new Node(data);
        System.out.println("Enter data for the left side of " + data);
        node.left = createbinarytree();

        System.out.println("Enter data for the right side of " + data);
        node.right = createbinarytree();

        return node;
    }

    public int noofelement(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + noofelement(root.left) + noofelement(root.right);
    }

    // Static inner class for Node
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}
