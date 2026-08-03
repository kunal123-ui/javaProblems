package Array;
import java.util.*;
class FindNearestNumberGivenTarget{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int []a={12, 18, 25, 30, 41, 50};
        int k=28;
        int nearest = a[0];
        int mindif= Math.abs(a[0]-k );
        for (int i = 0; i < a.length; i++) {
            int dif= Math.abs(a[i]-k);
            if( dif < mindif){
                mindif=dif;
                nearest=a[i];
            }
        }

            System.out.print(nearest);

    }
}