package Matrix;
import java.util.*;

class BoundaryTraversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[r][c];

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int left = 0;
        int right = c - 1;
        int top = 0;
        int bottom = r - 1;
        for(int j = left; j <= right; j++) {
            System.out.print(mat[top][j] + " ");
        }
        for(int i = top + 1; i <= bottom; i++) {
            System.out.print(mat[i][right] + " ");
        }
        for(int j = right - 1; j >= left; j--) {
            System.out.print(mat[bottom][j] + " ");
        }
        for(int i = bottom - 1; i > top; i--) {
            System.out.print(mat[i][left] + " ");
        }
    }
}