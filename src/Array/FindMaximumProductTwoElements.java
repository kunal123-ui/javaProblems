package Array;
import java.util.*;
class FindMaximumProductTwoElements{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int []a={3, 5, 7, 2, 8, 10};
        int max=a[0]*a[1] ;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++){
                int pro =a[i]*a[j];
                if( max < pro) {
                    max=pro;
                }
                }
            }
        System.out.print(max);

    }
}