public class TraverseArray {
        public static void main(String[] args) {
        int[] LA = {10, 20, 30, 40, 50};
        //int[] dynamicArray = new int[3]; //array gots memory assignment when it found keyword "new" 
        
        /*dynamicArray[0] = 100;
        dynamicArray[1] = 200;
        dynamicArray[2] = 300;*/

        System.out.println("Static Array elements:");
        for (int i = 0; i < LA.length; i++) {
            System.out.println(LA[i]+ " Element on " +i + " index");
        }

        // System.out.println("\nDynamic Array elements:");
        // for (int value : dynamicArray) {
        //     System.out.print(value + "\t");
        //}
    }
}

