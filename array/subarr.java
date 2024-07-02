package array;

public class subarr {
    // a continious part of an array
    public static void main(String args[])
    {
        int ts =0;
        int[] arr = {2,3,6,10,9};
        for(int i=0;i<arr.length;i++)
        {
            int start =i;
            for(int j =i;j<arr.length;j++)
            {
                int end = j;

                for(int k=start;k<=end;k++)
                {
                    System.out.print(arr[k]+" ");
                    
                }
                ts++;
                System.out.println();
                

            }
            System.out.println();
        }
        System.out.println("total subarrays: "+ts);
    }
}
