package Array;

import java.util.Scanner;

class RemoveDublicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a = new int [num];
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }
            for (int i = 0; i < num; i++) {
                boolean dub = false;

                for (int j = 0; j < i; j++) {
                    if (a[i] == a[j]) {
                        dub = true;
                        break;
                    }
                }
                if (!dub)
                    System.out.print(a[i] + " ");
            }

    }
}