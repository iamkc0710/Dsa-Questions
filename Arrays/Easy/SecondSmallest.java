package Arrays.Easy;

public class SecondSmallest {
    public static void main(String[] args) {
        // Initialize the array
        int a[] = {1, 7, 6, 4, 5};
        
        // Assume the first element as the smallest
        int smallest = a[0];
        // Set second smallest to maximum possible value initially
        int Ssmallest = Integer.MAX_VALUE;

        // Iterate through the array starting from the second element
        for(int i = 1; i < a.length; i++){
            // If current element is smaller than the smallest, update both smallest and second smallest
            if(a[i] < smallest){
                Ssmallest = smallest;  // Update second smallest
                smallest = a[i];       // Update smallest
            }
            // If the current element is not the smallest but smaller than the second smallest
            else if(a[i] != smallest && a[i] < Ssmallest){
                Ssmallest = a[i];  // Update second smallest
            }
        }
    
        // Output the second smallest element
        System.out.println("Second Smallest Element in the array : " + Ssmallest);
    }
}
