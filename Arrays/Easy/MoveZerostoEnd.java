package Arrays.Easy;

public class MoveZerostoEnd {

    // This method moves all zeros to the end of the array, using an extra array.
    public static void ZerostoEnd(int arr[]) {
        
        // Temporary array to store non-zero elements
        int temp[] = new int[arr.length];
        int j = 0; // Index for the temp array
        int count = 0; // Count of zeros in the array

        // Traverse the array and store non-zero elements in temp
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i]; // Store non-zero element
                j++; // Move to next index in temp
            } else {
                count++; // Count zeros
            }
        }

        // Copy elements from temp back to arr, followed by zeros at the end
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - count) {
                arr[i] = temp[i]; // Copy non-zero elements
            } else {
                arr[i] = 0; // Fill the rest with zeros
            }
        }
    }

    // This optimized method moves all zeros to the end in-place, without using extra space
    public static void ZerostoEndOpt(int arr[]) {
        int j = -1; // j will track the first occurrence of zero

        // Find the index of the first zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i; // Set j to the first zero's index
                break;
            }
        }

        // Swap non-zero elements with the first zero position and move j forward
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap non-zero element at i with zero at j
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                j++; // Move j to next position
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 0, 0, 3, 4, 0, 5};

        // ZerostoEnd(arr); // Uncomment to use the non-optimized method
        ZerostoEndOpt(arr); // Use the optimized method

        // Print the modified array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
