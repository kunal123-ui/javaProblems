package Array;

import java.util.*;
class RevArr{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int []a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int i=0;
        int j=n-1;
        int temp;
            while (i < j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;


            }
        for (int k = 0; k < n; k++) {
            System.out.print(a[k] + " ");
        }
    }
}