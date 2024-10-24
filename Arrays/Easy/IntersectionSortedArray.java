package Arrays.Easy;

public class IntersectionSortedArray {
    public static void main(String[] args) {
        int a[] = {1,2,2,3,3,4,5,6};
        int b[] = {2,3,3,5,6,6,7};
        int interSection[] = new int[a.length];

        int k = 0,i = 0,j = 0;
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < b.length; j++) {
        //         if(a[i] == b[j]){
        //             interSection[k] = b[j];
        //             b[j] = 0;
        //             k++;
        //             break;
        //         }
        //     }
        // }

        while (i < a.length && j < b.length) { 
            if(a[i] < b[j]){
                i++;
            }
            else if(b[j] < a[i]){
                j++;
            }
            else {
                interSection[k] = b[j];
                k++;
                i++;
                j++;
            }
            
        }


    
        for (int t = 0; t < k; t++) {
            System.out.print(interSection[t] +" ");
        }
    
    }
}
