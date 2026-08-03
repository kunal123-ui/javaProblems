package Array;
import java.util.*;
class sortOddNum{
    public static void main(String []args){
        int []a={1,2,5,6,3,9,4,7};
        int cout=0;
        int[] odd = new int[a.length];
        for(int i=0;i<a.length;i++){
           if(a[i]%2!=0){
              odd[cout++]= a[i];
           }
        }
        for(int i=0;i<cout-1;i++){
            for(int j=0;j<cout-i-1;j++){
                if (odd[j] > odd[j + 1]) {
                    int t = odd[j];
                    odd[j] = a[j + 1];
                    odd[j + 1] = t;
                }
            }
        }
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i] = odd[index++];
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}