package Arrays.Easy;

public class RotateArraybyK {

    // Helper method to reverse elements in the array between indices start and end
    public static void reverseNum(int nums[], int start, int end){
        while(start < end){   
            int swap = nums[start];
            nums[start] = nums[end];
            nums[end] = swap;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7}; // Initial array
        int k = 3; // Number of positions to rotate

        int n = nums.length;
        k %= n;   // Handle cases where k is greater than n (rotation more than array length)

        // Step 1: Reverse the entire array
        reverseNum(nums, 0, n - 1);

        // Step 2: Reverse the first k elements to bring them to the start in rotated order
        reverseNum(nums, 0, k - 1);

        // Step 3: Reverse the remaining n-k elements to complete the rotation
        reverseNum(nums, k, n - 1);

        // Print the rotated array
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
