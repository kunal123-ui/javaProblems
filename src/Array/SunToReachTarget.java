package Array;

import java.util.*;
class SunToReachTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tar = sc.nextInt();
        int[] val = new int[6];
        for (int i = 0; i < val.length; i++) {
            val[i] = sc.nextInt();
        }
        for (int i = 0; i < val.length; i++) {
            for (int j = i + 1; j < val.length; j++) {
                if (val[i] + val[j] == tar)
                    System.out.println(val[i] + "+" + val[j] + "=" + tar);
            }

        }
    }
}