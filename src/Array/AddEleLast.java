package Array;
import java.util.*;
class AddEleLast{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ne=sc.nextInt();
        a[n]=ne;
        for(int i=0;i<=n;i++){

            System.out.print(a[i]+" ");
        }
        }
    }
