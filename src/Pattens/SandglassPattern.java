package Pattens;
import java.util.*;
public class SandglassPattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n-1;i>=0;i--){
            for (int j= 0; j <n-1-i; j++) {
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                    System.out.print("*");
                }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for (int j= 0; j <n-1-i; j++) {
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}