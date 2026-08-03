package Array;
import java.util.*;
class FrequencyNum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            int count=1;
            if(a[i]==-1){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                    a[j]=-1;
                }
            }
            System.out.println(a[i]+"->"+count);
        }


    }
}