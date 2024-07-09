package Linkedlist;

public class Linkedlist2 {

    public static void main(String[] args) {
        Node head = null;
        head = CreateNode(head, 10);
        head = CreateNode(head, 20);
        head = CreateNode(head, 30);
        head = CreateNode(head, 40);

        display(head);
        
    }

    public static Node CreateNode(Node head,int data)

    {
        if(head == null)
        {
            return new Node(data);

        }
        Node node  = new Node(data);
        Node prev = null;
        Node curr=head;
        //here previous helps to find the last value
        while (curr!=null) {
            prev=curr;
            curr=curr.next;
            
        }
        prev.next=node;
        return head;

    }
    public static void display(Node head)
    {
        
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    
}
class Node{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
        
    }
} 

//delete node
//reverse a list
//reverse a list using array also
