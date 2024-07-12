package stack;

public class StackUsingLinkelist {
    public static int size;
    public static void main(String[] args) {

    }
    public static Node push(Node head,int data){
        if(head==null){
            Node node=new Node(data);
            size++;
            System.out.println("data Inserted ");
            return node;
        }else{
            Node node=new Node(data);
            node.next=head;
            size++;
            System.out.println("data Inserted ");
            head=node;
            return head;
        }
    }
    public static Node pop(Node head){
        System.out.println(head.data);
        System.out.println("Data Poped Out");
        head=head.next;
        return head;
    }

}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}

