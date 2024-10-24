package Arrays.Easy;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int largestNum = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largestNum){
                largestNum = arr[i];
            }
        }

        System.out.println("Largest Element in the array : " +largestNum);
    }
}