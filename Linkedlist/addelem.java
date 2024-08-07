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

    public void AddFirst(int data)
    {
        //step 1 create new node
        Node newNode = new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;

        }

        //step 2 newNode next = head
        newNode.next=head;
        //step 3 point head to new Node

        head = newNode;

    }

    public  void AddLast(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;

        }
        tail.next = newNode;
        tail = newNode;

    }

    public void display()
    {
        if(head == null)
        {
            System.out.println("linked list is empty");
        }
        Node temp = head;
        while (temp!=null) {

            System.out.print(temp.data+"->");
            temp=temp.next;
            if(temp == null)
            System.out.println("null");
            
        }
    }
    public static void main(String[] args) {

       addelem ll = new addelem();
       ll.AddFirst(2);
       ll.AddFirst(4);
       ll.AddLast(5);
       ll.AddLast(7);

       ll.display();
    }
}


       
