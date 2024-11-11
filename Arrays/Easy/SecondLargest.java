package Arrays.Easy;

public class SecondLargest {
    public static void main(String[] args) {

        // Initialize an array of integers
        int a[] = {1, 7, 6, 4, 5};
        
        // Assume the first element is the largest
        int largest = a[0];
        
        // Initialize the second largest to -1 (assuming no valid second largest initially)
        int Slargest = -1;

        // Iterate through the array starting from the second element
        for(int i = 1; i < a.length; i++){
            
            // If the current element is greater than the largest, update largest and second largest
            if(a[i] > largest){
                Slargest = largest;  // Old largest becomes second largest
                largest = a[i];      // Update largest with the new largest
            }
            // If current element is not larger than largest but greater than second largest, update second largest
            else if(a[i] < largest && a[i] > Slargest){
                Slargest = a[i];
            }
        }
    
        // Output the second largest element in the array
        System.out.println("Largest Element in the array : " +Slargest);
    }
}
