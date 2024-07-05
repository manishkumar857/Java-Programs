package array;
public class prefixsum {
    public static void main(String args[])
    {
        int[] arr ={1,7,-4,3,2,-1};
        int[] b = new int[arr.length];

        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        b[0]=arr[0];
        for(int i= 1;i<arr.length;i++)
        {
            b[i]=b[i-1]+arr[i];
 
        }
        System.out.println();

        for(int i =0;i<b.length;i++)
        {
        System.out.print(b[i]+" ");
        }


    }

}
