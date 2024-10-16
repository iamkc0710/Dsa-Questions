public class SecondSmallest {
    public static void main(String[] args) {
        int a[] = {1, 7, 6, 4, 5};
        int smallest = a[0];
        int Ssmallest = Integer.MAX_VALUE;

        for(int i = 1; i < a.length; i++){
            if(a[i] < smallest){
                Ssmallest = smallest;
                smallest = a[i];
            }
            else if(a[i] != smallest && a[i] < Ssmallest){
                Ssmallest = a[i];
            }
        }
    
        System.out.println("Largest Element in the array : " +Ssmallest);
   
    }
}
