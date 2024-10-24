package Arrays;

public class MoveZerostoEnd {

    public static void ZerostoEnd(int arr[]){

        int temp[] = new int[arr.length];
        int j = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                temp[j] = arr[i];
                j++;
            }
            else{
                count++;
            }
        } 

        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length-count){
                arr[i] = temp[i];
            }
            else{
                arr[i] = 0;
            }
        }
    }

    public static void ZerostoEndOpt(int arr[]){
        int j = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        for (int i = j+1; i < arr.length; i++) {
            if(arr[i] != 0){
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,0,2,0,0,3,4,0,5};

        //ZerostoEnd(arr);
        ZerostoEndOpt(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
