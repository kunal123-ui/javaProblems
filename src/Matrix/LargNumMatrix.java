package Matrix;

import java.util.*;
class LargNumMatrix{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int max=0;
        int mat[][]=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] > max) {
                    max = mat[i][j];
                }
            }
        }
        System.out.print(max);
    }
}