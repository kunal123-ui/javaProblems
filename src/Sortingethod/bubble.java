
package Sortingethod;
import java.util.*;

class bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // --- SORTING LOOPS ---
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) { // Using the simpler 'if' logic here
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        } // Outer loop ends here
        // --- PRINT LOOP (Moved completely outside) ---
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}