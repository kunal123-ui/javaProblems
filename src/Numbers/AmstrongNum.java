package Numbers;

import java.util.*;

class AmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num, arm = 0;
        int len = String.valueOf(num).length(); // Instantly gets the number of digits

        while (temp > 0) {
            arm += Math.pow(temp % 10, len);
            temp /= 10;
        }
        System.out.println(num + (arm == num ? " is " : " is not ") + "an Armstrong number.");
    }
}