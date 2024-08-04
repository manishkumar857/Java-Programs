package Tree;

import java.util.Scanner;

public class question {
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
}
