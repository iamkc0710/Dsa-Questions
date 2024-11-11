package Arrays.Easy;

public class RotateArraybyOne {
    public static void main(String[] args) {
        // Initialize an array with values
        int arr[] = {1, 2, 3, 4, 5};
        
        // Get the length of the array
        int n = arr.length;

        // Store the first element of the array to be placed at the end
        int temp = arr[0];

        // Shift all elements of the array one position to the left
        for(int i = 1; i < n; i++){
            arr[i-1] = arr[i];  // Assign the current element to the previous position
        }

        // Place the first element at the last position of the array
        arr[n-1] = temp;

        // Print the rotated array
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");  // Print each element with a space
        }
    }
}
