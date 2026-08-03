package String;
import java.util.Scanner;

class ReveveryPairConsdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char[] a = n.toCharArray();
        char temp = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = temp;
        System.out.print(new String(a));
    }
}
