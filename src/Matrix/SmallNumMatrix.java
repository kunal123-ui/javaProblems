package Matrix;

import java.util.*;
class SmallNumMatrix{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int small=Integer.MAX_VALUE;
        int [][] mat=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
                if(mat[i][j]<small) {
                    small = mat[i][j];
                }
            }
        }
        System.out.print(small);
    }
}