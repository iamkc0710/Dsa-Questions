package Arrays.Easy;

public class IntersectionSortedArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3, 3, 4, 5, 6}; // First sorted array
        int b[] = {2, 3, 3, 5, 6, 6, 7};    // Second sorted array
        int interSection[] = new int[a.length]; // Array to store intersection elements

        int k = 0, i = 0, j = 0; // Initialize indexes for interSection, a, and b respectively
       
        // Loop until the end of either array a or b is reached
        while (i < a.length && j < b.length) { 
            if(a[i] < b[j]){     // If element in a is smaller, increment index i to check next element
                i++;
            }
            else if(b[j] < a[i]){ // If element in b is smaller, increment index j to check next element
                j++;
            }
            else { // Elements are equal, so add to intersection array
                interSection[k] = b[j];
                k++; // Move to next position in interSection array
                i++; // Move to next element in array a
                j++; // Move to next element in array b
            }
        }

        // Print all intersection elements stored in interSection array
        for (int t = 0; t < k; t++) {
            System.out.print(interSection[t] + " ");
        }
    }
}
