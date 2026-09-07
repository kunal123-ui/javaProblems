package Numbers;
import java.util.*;
class CountPrimeNumber {
    public static void main(String[] args){
        int[] a = {2, 4, 5, 7, 8, 11, 12};
        int count = 0;

        for (int i = 0; i < a.length; i++) {

            int factors = 0;

            for (int j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    factors++;
                }
            }

            if (factors == 2) {
                count++;
            }
        }

        System.out.print(count);
    }
}