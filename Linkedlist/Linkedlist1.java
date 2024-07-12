package Linkedlist;

public class Linkedlist1 {

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);


        Node head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        display(head); 
    }

        public static void display(Node head)


        {
            Node curr = head;
            while(curr!=null)
            {
                System.out.print(curr.data+" ");
                curr=curr.next;
            }
        }
    }
       
class Node{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
    }
}
