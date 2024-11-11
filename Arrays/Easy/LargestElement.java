package Arrays.Easy;

public class LargestElement {
    public static void main(String[] args) {
        // Define an array of integers
        int arr[] = {1, 2, 3, 4, 5};
        
        // Assume the first element is the largest initially
        int largestNum = arr[0];

        // Loop through the array starting from the second element
        for(int i = 1; i < arr.length; i++){
            // If the current element is greater than the current largest,
            // update largestNum to the current element
            if(arr[i] > largestNum){
                largestNum = arr[i];
            }
        }

        // Print the largest element found in the array
        System.out.println("Largest Element in the array : " + largestNum);
    }
}
