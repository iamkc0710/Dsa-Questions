package Arrays;

public class RotateArraybyK {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;   
        
        // Right Rotate

        int temp[] = new int[k+1];

        for(int i = 0; i < nums.length-k; i++){
            temp[i] = nums[i];
        }

        for(int i = 0; i < k; i++){
            nums[i] = nums[nums.length-k+i];
        }

        for(int i = 0; i < nums.length-k ; i++){
            nums[k+i] = temp[i];
        }


        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] =" ");
        }

    }
}
