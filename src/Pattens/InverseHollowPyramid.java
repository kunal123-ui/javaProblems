package Pattens;
import java.util.*;
public class InverseHollowPyramid{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n-1;i>=0;i--){
            for (int j= 0; j <n-1-i; j++) {
                System.out.print(" ");
            }
            int width=2*i+1;
            for(int j=0;j<width;j++){
                if(j==0||j==width-1||i==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}