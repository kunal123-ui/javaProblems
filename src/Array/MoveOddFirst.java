package Array;
import java.util.*;
class MoveOddFirst{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
         for(int i=0;i<n-1;i++){
             for(int j=0;j<n-1;j++){
                 if(a[j]%2==0 && a[j+1]%2 !=0) {
                     int t = a[j];
                     a[j] = a[j + 1];
                     a[j + 1] = t;
                 }
             }
         }
        for(int i=0;i<n;i++){
           System.out.print(a[i]+" ");
        }
    }
}
/*
[6, 5, 4, 2, 3, 1]
 ↑  ↑
6 is even and 5 is odd
*/