package Array;
import java.util.*;
class ClaimbingStar{
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        a[0]=1;
        a[1]=2;
        for (int i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}