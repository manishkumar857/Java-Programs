package Linkedlist;

public class addelem {

    public static class Node{
    int data;
    Node next;
    
    public Node(int data)
    {
        this.data = data;
        this.next=null;
    }
    }

    public static Node head;
    public static Node tail;

    public static void AddFirst(int data)
    {
        //step 1 create new node
        Node newNode = new Node(data);

        //step 2 newNode next = head
        newNode.next=head;

        head = newNode;

    }
    public static void main(String[] args) {

       
    }
}


       
