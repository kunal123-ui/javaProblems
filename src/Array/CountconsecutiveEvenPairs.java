package Array;
import java.util.*;
class CountconsecutiveEvenPairs{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int []a={2 ,4 ,6 ,7, 8 ,10, 5 ,12};
        int count = 0;
        for (int i = 0; i < a.length-1; i++) {
                if (a[i] % 2 == 0 && a[i + 1] % 2 == 0) {
                    count++;
                }

        }
                System.out.print(count);

        }
    }