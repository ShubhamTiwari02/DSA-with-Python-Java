// import java.util.Arrays;
public class DeletionArray {
    
    // public static void main(String[] args) {
    //     int[] original = {10, 20, 30, 40, 50};
    //     int indexToRemove = 3; // Removes '40'

    //     int[] newArray = new int[original.length - 1];  //step 3

    //     for (int i = 0, k = 0; i < original.length; i++) {
    //         if (i == indexToRemove) {
    //             continue;
    //         }
    //         newArray[k++] = original[i];
    //     }

    //     System.out.println("Original: " + Arrays.toString(original));
    //     System.out.println("After Deletion: " + Arrays.toString(newArray));
    // }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int deleteIndex = 2; // Deleting element at index 2 (value 30)

        // Shift elements to the left starting from the index to be deleted
        for (int i = deleteIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1]; // Shift element at i+1 to i
        }

        // Optional: The last element is now a duplicate, often set to 0 or null
        arr[arr.length - 1] = 0; //its not decreasing the size of the array but we can ignore the last element as it is now considered "deleted"
        //arr.length = arr.length - 1 ; // Reduce the effective size of the array

        // Print resulting array (ignoring the last index)
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr.length);
    }

}

//original: [10, 20, 30, 40, 50] 0,1,2,3,4
//newarray: [10, 20, 40, 50]     0,1,2,3