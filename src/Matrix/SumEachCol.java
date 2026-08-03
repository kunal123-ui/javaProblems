package Matrix;

import java.util.*;
class SumEachCol{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();

        int [][] mat=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int j=0;j<c;j++)
        {
            int colsum=0;
            for (int i=0;i<r;i++) {
                colsum += mat[i][j];
            }
            System.out.println(colsum);
        }
    }

}
