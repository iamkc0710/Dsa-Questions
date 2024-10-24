package Arrays.Easy;

public class SecondLargest {
    public static void main(String[] args) {

        int a[] = {1, 7, 6, 4, 5};
        int largest = a[0];
        int Slargest = -1;

        for(int i = 1; i < a.length; i++){
            if(a[i] > largest){
                Slargest = largest;
                largest = a[i];
            }
            else if(a[i] < largest && a[i] > Slargest){
                Slargest = a[i];
            }
        }
    
        System.out.println("Largest Element in the array : " +Slargest);
  
    }
}
