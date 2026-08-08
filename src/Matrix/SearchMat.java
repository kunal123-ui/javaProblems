package Matrix;

import java.util.*;

public class SearchMat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[r][c];

        // Input matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Element to search
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (mat[i][j] == key) {
                    System.out.println("Found at Row = " + i + " Column = " + j);
                    found = true;
                    break;
                }
            }

            if (found)
                break;
        }

        if (!found) {
            System.out.println("Not Found");
        }
    }
}