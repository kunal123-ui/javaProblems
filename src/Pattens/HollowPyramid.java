package Pattens;
import java.util.*;
public class HollowPyramid{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
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