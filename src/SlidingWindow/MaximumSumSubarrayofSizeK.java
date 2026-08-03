package SlidingWindow;
import java.util.*;
class MaximumSumSubarrayofSizeK{
    public static void main(String []args){
        int []a={2,1,5,1,3,2};
        int k=3;
        int sum=0;
        for (int i=0;i<k;i++){
            sum +=a[i];
        }
        int maxsum=sum;
        for (int i=k;i<a.length;i++){
            sum=sum-a[i-k]+a[i];
            maxsum=Math.max(maxsum,sum);
        }
        System.out.print(maxsum);
    }
}