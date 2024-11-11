package Arrays.Easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        // Initialize an array with binary values
        int nums[] = {1,1,0,1,1,1};
        
        // 'count' to count consecutive 1s, 'max' to store the maximum count
        int count = 0;
        int max = 0;

        // Iterate through the array
        for(int i = 0; i < nums.length; i++){
            // If current element is 1, increment count
            if(nums[i] == 1){
                count++;
                
                // Update max with the higher value between max and count
                max = Math.max(max, count);
            } else {
                // Reset count to 0 if current element is not 1
                count = 0;
            }
        }

        // Print the maximum consecutive 1s
        System.out.println(max);
    }
}
