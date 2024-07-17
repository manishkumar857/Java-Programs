package queue;

import java.util.ArrayDeque;

public class stacktooppstack {
    public static void main(String[] args) {
        
    
    ArrayDeque<Integer> stack = new ArrayDeque<>();
    ArrayDeque<Integer> stack2 = new ArrayDeque<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    System.out.println(stack);
    for(int i:stack){
        stack2.push(i);
    }
    System.out.println(stack2.pop());
    System.out.println(stack2);
    }
}
