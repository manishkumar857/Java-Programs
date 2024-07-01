package array;
import java.util.Scanner;

public class subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    
        System.out.print("Enter the target sum: ");
        int n = sc.nextInt();
        
        int[] arr = {1, 4, 1, 3, 1};
        int length = arr.length;
        
        
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                
                if (arr[i] + arr[j] == n) {
                    
                    System.out.print("Subarray with sum " + n + ": ");
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
