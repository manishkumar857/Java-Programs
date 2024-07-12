package Linkedlist;

public class Linkedlist2 {

    public static void main(String[] args) {

        Node head=null;
        head=CreateNode(head,10);
        head=CreateNode(head,30);
        head=CreateNode(head,20);
        head=CreateNode(head,40);
        head=CreateNode(head,50);


        Node middle=middleElement(head);
        System.out.println(middle.data);
//        PrintLinkedList(head);
//        head=reverseLinkedList(head);
//        PrintLinkedList(head);

    }
    public static Node CreateNode(Node head,int data){
        if(head==null){
            return  new Node(data);
        }
        Node node=new Node(data);
        Node prev=null;
        Node cur=head;
        //here previous helps to find out last node
        while(cur!=null){
            prev=cur;
            cur=cur.next;
        }
        prev.next=node;
        return head;
    }
    public static void PrintLinkedList(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.data+"   ");
            cur=cur.next;
        }
        System.out.println("**************************");
    }
    public static Node reverseLinkedList(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node prev=null;
        Node cur=head;
        while(cur!=null){
            Node temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        head=prev;
        return head;
    }
    public static Node middleElement(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}
