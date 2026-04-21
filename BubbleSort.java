public class BubbleSort {
    public static void bubbleSort(int[] arr, int counter) {
        int n = arr.length;
        boolean swapped;
        
        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                //counter++;
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    //counter = counter + 1;
                }
                
            }
            if (!swapped) break;
        }
       counter = counter + 1; 
    }

    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};
        int counter = 0;
        bubbleSort(data, counter);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(data));
        System.out.println("Number of comparisons:" + counter);
        // System.out.println("Time Complexity: O(n^2)");
        // System.out.println("Space Complexity: O(1)");
        // System.out.println("Best Case: O(n) (when the array is already sorted)");
        // System.out.println("Worst Case: O(n^2) (when the array is sorted in reverse order)");
        // System.out.println("Average Case: O(n^2)");
        // System.out.println(data.length);
    }
}
