import java.util.Arrays;

public class InsertionArray {
 public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        // Insert element 25 at index 2
        originalArray = insertElement(originalArray, 25, 2);
        System.out.println("After Insertion (25 at index 2): " + Arrays.toString(originalArray));
   }

    // Method to insert an element into a new array
    public static int[] insertElement(int[] arr, int element, int index) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == index) {
                newArray[i] = element;
            } else {
                newArray[i] = arr[j++];
            }
        }
        return newArray;
    }
}
