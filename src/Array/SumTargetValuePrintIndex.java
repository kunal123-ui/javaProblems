package Array;

import java.util.*;
class SumTargetValuePrintIndex{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int tar=9;
        boolean find=false;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(a[i]+a[j]==tar){
                    System.out.print(i +" "+j);
                    find=true;
                    break;
                }
                if (find)
                    break;
            }
        }
    }
}