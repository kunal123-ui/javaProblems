package Array;
import java.util.*;
class ReplaceAllMultiples5with5{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int []a={10 ,22, 36 ,40 ,50};

        for (int i = 0; i < a.length; i++) {
            if(a[i]%5==0){
                a[i]=5;
            }
        }
        for (int i = 0; i < a.length; i++) {

                System.out.print(a[i] + " ");

        }

    }
}