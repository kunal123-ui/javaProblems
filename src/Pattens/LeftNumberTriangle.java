
package Pattens;
import java.util.*;
public class LeftNumberTriangle
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=1;
            for(int j=0;j<=i;j++){
                if(j>=0) {
                    System.out.print(num++);
                }
            }
            System.out.println();
        }
    }
}