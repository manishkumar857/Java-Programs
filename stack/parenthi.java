package stack;
import java.util.ArrayDeque;

public class parenthi{
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        while ((!stack.isEmpty())) {

            System.out.println(stack.pop());
            
        }

    } 
}
//changes 
    