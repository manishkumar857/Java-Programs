package queue;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public StackUsingQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public static void main(String[] args) {
        StackUsingQueue obj = new StackUsingQueue();
        obj.push(10);
        obj.push(20);
        obj.push(30);

        System.out.println(obj.pop()); // 30
        System.out.println(obj.pop()); // 20
        System.out.println(obj.pop()); // 10
        
        try {
            System.out.println(obj.pop()); // Throws exception as the stack is empty
        } catch (RuntimeException e) {
            System.out.println(e.getMessage()); // Expected output: "Stack is empty"
        }
    }

    public void push(int data) {
        q1.add(data);
    }

    public int pop() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        // Move all elements except the last one from q1 to q2
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        // The last element in q1 is the top of the stack
        int data = q1.poll();

        // Swap references of q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return data;
    }
}
