package Recursion;

public class lastoccur {
    public static int lo(int arr[],int key,int i)
    {
        if (i == arr.length) {
            return -1; 
        }
        int back = lo(arr, key, i+1);
        if(back == -1 && arr[i]==key)
        {
            return i;
        }
        return back;

    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,2,3};
        System.out.println(lo(arr, 2, 0));

    }
}
