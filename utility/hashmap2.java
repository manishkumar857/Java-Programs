package utility;
import java.util.*;
public class hashmap2 {

    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[5];
    
    for(int i=0;i<5;i++)
    {
        a[i] = sc.nextInt();
    }

    HashMap<Integer ,Integer> map = new HashMap<>();
    for(int v:a)
    {
        if(map.containsKey(v)){

            int f = map.get(v);
            
            map.put(v,f+1);


        }
        else{
            map.put(v,1);
        }
    }
    for(Map.Entry<Integer,Integer> val: map.entrySet()){

        System.out.println(val.getKey()+" "+val.getValue());

    }
    sc.close();


}




}
