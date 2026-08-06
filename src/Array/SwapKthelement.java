package Array;
import java.util.*;
class SwapKthelement{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k   =sc.nextInt();

            int t=a[k-1];
            a[k-1]=a[n-1];
            a[n-1]=t;

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}