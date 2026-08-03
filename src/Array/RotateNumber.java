package Array;

import java.util.*;
class RotateNumber{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k = sc.nextInt();

        while(k>0) {
            int first = a[0];
            for (int i = 0; i < n - 1; i++) {
                a[i] = a[i + 1];
            }
            a[n - 1] = first;
            k--;
        }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
/*
left rotation

* import java.util.*;

class Array.RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        k = k % n;

        while (k > 0) {
            int last = a[n - 1];

            for (int i = n - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }

            a[0] = last;
            k--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
* */