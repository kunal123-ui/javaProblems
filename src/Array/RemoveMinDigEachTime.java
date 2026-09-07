package Array;
import java.util.*;
class RemoveMinDigEachTime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<n;i++){
            if(a[i]>min){
                min=a[i];
                index = i;
            }
        }

    }
}