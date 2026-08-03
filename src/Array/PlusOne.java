package Array;
import java.util.*;
class PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean carry = true;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] < 9) {
                a[i]++;
                carry = false;
                break;
            } else {
                a[i] = 0;
            }
        }
            if (carry) {
                int[] res = new int[n + 1];
                res[0] = 1;
                for (int i = 0; i < res.length; i++) {
                    System.out.print(res[i] + " ");
                }
            } else{
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
            }
    }
}