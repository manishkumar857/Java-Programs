package array;
import java.util.*;
public class search {

    public static void main(String args[])
    {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();

for(int i =0;i<arr.length;i++)
{
    if(n==arr[i])
    {
        System.out.println("element found :"+ arr[i]);
    }
}
sc.close();;
    }
}
