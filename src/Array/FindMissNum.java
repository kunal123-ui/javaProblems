package Array;

import java.util.*;
class FindMissMum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for (int i=0;i<n-1;i++){
            a[i]=sc.nextInt();
        }
        int tot=n*(n+1)/2;   //sum of n natural num
        int sum=0;
        for (int i=0;i<n;i++){
            sum +=a[i];
        }
        int mis=tot - sum;

            System.out.print(mis + " ");

    }
}