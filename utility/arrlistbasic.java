package utility;
import java.util.*;
public class arrlistbasic {
    

    public static void main(String args[])
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(1,9);

        System.out.println(al);

        //get operation
        System.out.println(al.get(0));

        //set
        al.set(2,10);
        al.remove(3);
        System.out.println(al);

        //contains
        System.out.println(al.contains(9));
        System.out.println(al.contains(12));
    }
}
