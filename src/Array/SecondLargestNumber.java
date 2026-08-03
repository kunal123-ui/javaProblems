package Array;

import java.util.*;
class SecondLargestNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]>max){
                sec=max;
                max=a[i];
            }
            else if(sec<a[i] && a[i]!=max ){
                sec=a[i];
            }
        }
        if(sec==Integer.MIN_VALUE){
            System.out.print("not sec max");
        }
        else {
            System.out.print(sec);
        }
    }
}