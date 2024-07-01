package utility;
import java.util.*;
public class almax {
    public static void main(String args[])
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(1);
        al.add(9);
        al.add(4);

        int max = Integer.MIN_VALUE;
        for(int i =0;i<al.size();i++)
        {
        if(max<al.get(i))
        {
            max = al.get(i);
        }
        //max = Math.max(max, al.get(i));
        
        }
        System.out.println(max);

    }
}
