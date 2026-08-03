package Numbers;

import java.util.Scanner;

public class LCM {
   public static int gcd(int a, int b) {
       while(b!=0){
           int t=b;
           b=a%b;
           a=t;
       }
       return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a * b) / gcd(a, b));
    }
}