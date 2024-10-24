package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 5};

        int n = nums.length;
        int totalSum = n*(n+1)/2;
        int presentSum = 0;

        for(int i = 0; i < n-1; i++){
            presentSum += nums[i];
        }

        int ans = totalSum - presentSum;

        System.out.println(ans);

    }
}
