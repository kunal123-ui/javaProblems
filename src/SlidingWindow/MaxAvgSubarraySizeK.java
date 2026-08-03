package SlidingWindow;
class AverageSubarrayofSizeK{
    public static void main(String[] args){
        int []a={1,3,2,6,-1,4,1,8,2};
        int k=3;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=a[i];
        }
        double maxavg=(double)sum/k;;
        for(int i=k;i<a.length;i++){
            sum=sum-a[i-k]+a[i];
            double avg=(double)sum/k;
            maxavg=Math.max(maxavg,sum);
        }
       System.out.print(maxavg);
    }
}