package Arrays.Easy;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5};

        int index = 0; // Initialize index to keep track of unique elements' positions

        // Loop through the array starting from the second element
        for(int i = 1; i < arr.length; i++) {
            // Check if the current element is different from the last unique element
            if(arr[index] != arr[i]) {
                arr[index + 1] = arr[i]; // Move the unique element forward in the array
                index++; // Increment index to the next position
            }
        }

        // Print the count of unique elements (index + 1 gives the total unique count)
        System.out.println(index + 1);
    }
}
