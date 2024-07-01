package utility;
import java.util.*;
import java.util.ArrayList;


public class arrlist{

    public static void main(String args[])
    {
        ArrayList<Integer> al =new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<10;i++){  
            int no = sc.nextInt();
            al.add(no);
        }
        System.out.println(al.size());
        System.out.println("output is : ");
       for(int i =0;i<al.size();i++)
        {

            System.out.println(al.get(i));
        }
        sc.close();

    }
    

}