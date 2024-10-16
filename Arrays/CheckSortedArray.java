package Arrays;

public class CheckSortedArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5};
        boolean isSorted = true;

        for(int i = 0; i < a.length-1; i++){
            if(a[i] > a[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted == false){
            System.out.println("Array was not sorted");
        }
        else{
            System.out.println("Array was sorted");
        }
    }
}
