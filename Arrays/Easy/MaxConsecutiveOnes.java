package Arrays.Easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1};
        int count = 0;
		int max = 0;

		for(int i = 0; i < nums.length; i++){
			if(nums[i] == 1){
				count++;
			
			max = Math.max(max, count);
				
			}
			else{
				count=0;
			}
		}
   
        System.out.println(max);
    }
}
