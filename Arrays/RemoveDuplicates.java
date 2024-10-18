package Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3,4,4,5,5};

        int index = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[index] != arr[i]){
                arr[index+1] = arr[i];
                index++;
            }
        }

        System.out.println(index+1);

        
    }
}
