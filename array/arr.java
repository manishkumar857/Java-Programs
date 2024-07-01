package array;
import java.util.*;
public class arr {
    public static void main(String args[])
    {
        //int sum=0;
        int temp;
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int arr[] = new int[s]; //array dec and creation
       
        for(int i=0;i<s;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<s;i++)
        {
            //sum+=arr[i];
            if(arr[i]>arr[i+1])
            {
                temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int i=0;i<s;i++)

        {
            System.out.println(arr[i]);
        }
        //System.out.println("sum "+sum);
sc.close();
        
    }

}

