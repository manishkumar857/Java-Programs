package array;

public class seconndmax {

    public static void main(String[] args) {
        int[] arr = {2, 9, 1, 7};
        int largest = 0;
        int secondLargest = Integer.MIN_VALUE; // Initialize with smallest possible value

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                secondLargest = largest; // Update secondLargest to the previous largest
                largest = i; // Update largest to the current index
            } else if (arr[i] < arr[largest] && arr[i] > arr[secondLargest]) {
                secondLargest = arr[i]; // Update secondLargest if arr[i] is in between largest and secondLargest
            }
        }

        System.out.println("Second largest element index: " + secondLargest);
    }
}
