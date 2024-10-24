package Arrays.Easy;

public class RotateArraybyK {

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
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;

        int n = nums.length;
        k %= n;   //Handle cases where k is greater than n

        reverseNum(nums,0,n-1);     //Step 1: Reverse the entire array
        reverseNum(nums,0,k-1);     //Step 2: Reverse the first k elements
        reverseNum(nums,k,n-1);           //Step 3: Reverse the remaining n-k elements


        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] +" ");
        }


    }
}
