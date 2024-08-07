package Linkedlist;

public class addmiddle {
    

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

    public void AddLast(int data)
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

    public void Addmiddle(int idx ,int data)
    {
        if(idx==0)
        {
            AddFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        while(i<idx-1)
        {
            temp=temp.next;
            i++;
        }
        //i =idx-1 ; temp -> prev
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public static void main(String[] args) {

       addmiddle ll = new addmiddle();
       ll.AddFirst(2);
       ll.AddFirst(4);
       ll.AddLast(5);
       ll.AddLast(7);
       ll.Addmiddle(2,9);

       ll.display();
    }
}

