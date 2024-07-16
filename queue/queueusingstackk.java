package queue;

import java.util.ArrayDeque;

public class queueusingstackk {
    ArrayDeque<Integer> stack1;
    ArrayDeque<Integer> stack2;
    public queueusingstackk()
    {
        stack1= new ArrayDeque<>();
        stack2 =new ArrayDeque<>();

    }
    public static void main(String[] args) {
        

        queueusingstackk obj = new queueusingstackk();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        System.out.println(obj.dequeue());


    }
    public void enqueue(int data){
        stack1.push(data);
    }
    public int dequeue()
    {
        if(stack1.isEmpty())
        {
            System.out.println("queue is empty");
            return -1;
        }
        while (!stack1.isEmpty()) {

            stack2.push(stack1.pop());
            
        }
        int value=stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop()); 
        }
        return value;
    }
    
}
