package Array;
import java.util.*;
class ReplaceEveryEvenNumberWithHalfItsValue{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int []a={10 ,7 ,8 ,15 ,6, 9, 20 ,5};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 ) {
                a[i]=a[i]/2;

            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}