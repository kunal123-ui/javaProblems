package SlidingWindow;
class MinSumSubarrayofSizeK{
    public static void main(String[] args){
        int []a={2,1,5,1,3,2};
        int k=3;
        int sum=0;

        for (int i=0;i<k;i++){
            sum+=a[i];
        }
        int minsum=sum;
        for (int i=k;i<a.length;i++){
            sum=sum-a[i-k]+a[i];
            minsum=Math.min(minsum,sum);
        }
        System.out.print(minsum);
    }
}