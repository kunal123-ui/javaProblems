package Numbers;

import java.util.*;
class RevNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        int dig=0;
        while(num>0) {
            dig = num % 10;
            num /= 10;
            rev = (rev*10 )+ dig;

        }
        System.out.print(rev);
    }
}