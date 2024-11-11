package Arrays.Easy;

public class MissingNumber {
    public static void main(String[] args) {
        // Input array with a missing number in the sequence
        int nums[] = {1, 2, 4, 5};

        // Length of the array
        int n = nums.length;
        
        // Calculate the expected total sum of numbers from 1 to n+1
        int totalSum = (n + 1) * (n + 2) / 2;

        // Calculate the sum of elements present in the array
        int presentSum = 0;
        for(int i = 0; i < n; i++){
            presentSum += nums[i];
        }

        // The missing number is the difference between the expected sum and the actual sum
        int ans = totalSum - presentSum;

        // Output the missing number
        System.out.println(ans);
    }
}
