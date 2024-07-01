package utility;
import java.util.*;
public class alreverse {
    public static void main(String args[])
    {
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=4;i>=0;i--){
            al.add(a[i]);
        }
        System.out.println(al);
        sc.close();

    }
    
}
