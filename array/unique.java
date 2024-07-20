package array;

public class unique{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 11, 1, 2, 3};
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique ^= arr[i];
        }
        System.out.println(unique);
    }
}
