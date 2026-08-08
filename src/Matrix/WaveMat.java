package Matrix;

import java.util.*;
public class WaveMat
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]mat=new int[r][c];
        for (int i=0;i< r;i++){
            for (int j=0;j< c;j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int j=0;j<c;j++){
            if(j%2==0) {
                for (int i = 0; i < r; i++) {
                    System.out.print(mat[i][j] + " ");
                }
            }else {
                for (int i = r - 1; i >= 0; i--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }
}
