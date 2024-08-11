package Linkedlist;
public class reversell {
   

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

    public void reverse()
    {
        // 3variable and 4 step to reverse
        Node prev = null;
        Node curr = tail= head;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {

       reversell ll = new reversell();
       ll.AddFirst(2);
       ll.AddFirst(4);
       ll.AddLast(5);
       ll.AddLast(7);

       ll.display();
       ll.reverse();
       ll.display();

       // time complexity of this is BIG O n
    }
}


       


