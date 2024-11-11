package Arrays.Easy;

public class CheckSortedArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5}; // Array to check if it is sorted
        boolean isSorted = true; // Variable to store if the array is sorted

        // Loop through the array to check if each element is less than or equal to the next one
        for(int i = 0; i < a.length - 1; i++){
            // If an element is greater than the next element, the array is not sorted
            if(a[i] > a[i+1]){
                isSorted = false; // Set isSorted to false
                break; // Exit loop as we found the array is not sorted
            }
        }

        // Check the isSorted flag to print the result
        if(isSorted == false){
            System.out.println("Array was not sorted"); // Print if array is not sorted
        }
        else{
            System.out.println("Array was sorted"); // Print if array is sorted
        }
    }
}
