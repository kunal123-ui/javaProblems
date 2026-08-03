package Array;

import java.util.*;
class Move0Last{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int []a=new int[num];
        int k=0;
        for (int i=0;i<num;i++) {
            a[i] = sc.nextInt();
            if (a[i] != 0) {
                int t = a[i];
                a[i] = a[k];
                a[k] = t;
                k++;
            }

        }
        for (int i=0;i<num;i++) {
            System.out.print(a[i]+" ");
        }
    }
}