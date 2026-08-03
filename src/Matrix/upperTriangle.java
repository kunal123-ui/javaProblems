package Matrix;

import java.util.Scanner;

public class upperTriangle {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[][] a=new int[n][n];

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();

        System.out.println("Upper Triangular:");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                if(i<=j)
                    System.out.print(a[i][j]+" ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
/*
* import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[][] a=new int[n][n];

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();

        System.out.println("Upper Triangular:");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                if(i>=j)
                    System.out.print(a[i][j]+" ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
* */