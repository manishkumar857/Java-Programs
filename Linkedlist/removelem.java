package Linkedlist;

public class removelem {
    

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
    public static int size;

   

    public void AddFirst(int data)
    {
        //step 1 create new node
        Node newNode = new Node(data);
        size++;
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
        size++;
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
        size++;
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

    public int removefirst()
    {
        if(size==0)
        {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if(size==1)
        {
            int val =head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public static void main(String[] args) {

       removelem ll = new removelem();
       ll.AddFirst(2);
       ll.AddFirst(4);
       ll.AddLast(5);
       ll.AddLast(7);
       ll.Addmiddle(2,9);

       ll.display();
       System.out.println(addmiddle.size);
    }
}



