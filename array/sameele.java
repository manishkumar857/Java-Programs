package array;

public class sameele {
    public static void main(String args[])
    {
        int[] arr = {8,0,3,5,0,2,0};
        int [] b = new int[arr.length];
    
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                b[i]=arr[i];
                 
            }
            
            System.out.println(b[i]);
        }
    } 

}

