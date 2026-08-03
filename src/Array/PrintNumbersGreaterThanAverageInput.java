package Array;
import java.util.*;
class PrintNumbersGreaterThanAverageInput{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int []a={10 ,20, 30 ,40 ,50};
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
            int avg = sum / a.length;


        for (int i = 0; i < a.length; i++) {
        if (a[i] >avg ) {
            System.out.print(a[i] + " ");
        }
        }

    }
}