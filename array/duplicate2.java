package array;
import java.util.*;

public class duplicate2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int a[]= new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
       //HashSet<Integer> hs = new HashSet<>();
       //for(int i: a){
       // hs.add(i);
       //}
       //System.out.println(hs);

       

       TreeSet<Integer> ts = new TreeSet<>();
       for(int i :a)
       {
        ts.add(i);
        
       }

       //Iterator iterator = ts.iterator();
       //while (iterator.hasNext()) {
        //System.out.println(iterator.next());
       //}
       sc.close();
    }
}
