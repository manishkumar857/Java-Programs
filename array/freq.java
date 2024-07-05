package array;

public class freq {

    public static void main(String args[])
    {
        
        int count =0;
        int[] arr = {1,1,1,2,3,3};
        int ele = arr[0];

        for(int i =0;i<arr.length;i++)
        {
            if(ele ==arr[i])  
            {
                count++;
                
                
            }else{
                
                System.out.println("frequency of"+ele+" ="+count);
                count=1;
                ele=arr[i];
                
            }
            
            
        }
        System.out.println("frequency of"+ele+" ="+count);
        
    }
    
}
