package Arrays;

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
        k %= n;

        reverseNum(nums,0,n-1);
        reverseNum(nums,0,k-1);
        reverseNum(nums,k,n-1);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] +" ");
        }


    }
}
