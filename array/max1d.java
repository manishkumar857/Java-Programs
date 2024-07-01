package array;

public class max1d {
    public static void main(String[] args) {  
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        int max = arr[0]; 
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i]; 
            }
        }
        
        System.out.println("Maximum value in the array is: " + max);
    }
}
